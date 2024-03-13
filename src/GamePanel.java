import javax.swing.JPanel;

import java.util.Scanner;

public class GamePanel extends JPanel implements Runnable {
    static GameState state = new GameState();
    static Scenario currScenario = state.gameArray.get(30);
    static Scenario prevNode = state.gameArray.get(30);
    static int called = 0;
    static KeyInputHandler keyH = new KeyInputHandler();

    @Override
    public void run() {

        Scanner scan = new Scanner(System.in);

        while (currScenario != null) {
            handleTurn(scan);
        }

        scan.close();
        return;
    }

    // uses try catch block that kees executing until a return condition is met
    public static int promptNumberReadLine(Scanner scan, String prompt, int max) {
        while (true) { // continuously loop until valid input is received
            // this just fix if the program exits while scanner is active. it will spam the prompt
            // this makes it so if its called more than once then exit
            called ++;
            if (called > 1) {
                System.exit(0);
            }
            System.out.print(prompt);
            called = 0;
            // check if there's another line of input
            if (scan.hasNext()) {
                String inputLine = scan.nextLine(); // read the whole line
         
                try {
                    int temp = Integer.parseInt(inputLine); // attempt to parse the integer

                    if (temp >= 1 && temp <= max) {

                        return temp; // return the valid input
                    } else {
                        // if input is an integer nut not within the valid range
                        System.out.println("That was not a valid number! Please try again.");
                    }
                } catch (NumberFormatException e) {
                    // if input cannont be converted to an integer thor an exception
                    System.out.println("That was not a valid number! Please try again.");
                }
            }
        }
    }

    public static void promptContinue(Scanner scan, String prompt) {
        animateText(prompt, 10);
        System.out.print("Press 'Enter' to continue...");
        scan.nextLine();
        // this is a console command to go up one line and delete a line
        System.out.print("\033[1A\033[K");

    }

    public static void handleTurn(Scanner scan) {
        clearConsole();

        promptContinue(scan, currScenario.getIntroText());
        animateText("\n" + "\n" + currScenario.getHeaderText() + "\n" + "\n", 10);

        for (int i = 0; i < currScenario.getChoicesLength(); i++) {
            System.out.println(i + 1 + ": " + currScenario.getOneChoice(i));
        }
        int number = promptNumberReadLine(scan, "please enter your move (1-" + currScenario.getChoicesLength() + "): ",
                currScenario.getChoicesLength());
  
        Scenario temp = currScenario;
        if (currScenario.getPointer(number) == -1) {
            currScenario = prevNode;
        } else {
            currScenario = state.gameArray.get(currScenario.getPointer(number));
        }
        prevNode = temp;
        // i change the turn and keep track since the program allows one last move to be
        // called even if the other player already lost

    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void animateText(String text, long delay) {
        for (char character : text.toCharArray()) {
            System.out.print(character); // print character without a newline
            try {
                Thread.sleep(delay); // wait for 'delay' milliseconds before printing the next character
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore the interrupted status
                System.err.println("Thread was interrupted, failed to complete operation");
            }
        }
        System.out.println(); // move to the next line after the text is printed
    }

}
