import javax.swing.JPanel;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class GamePanel extends JPanel implements Runnable {
    static GameState state = new GameState();
    static Scenario currScenario = state.gameArray.get(0);
    static Stack<Scenario> prevNodes = new Stack<>();
    static Player player = new Player();
    static int called = 0;
    static boolean isWin = false;

    @Override
    public void run() {
        prevNodes.push(currScenario);
        Scanner scan = new Scanner(System.in);

        while (currScenario != null) {
            // just chose it
            handleTurn(scan);
        }
        if (!isWin) {
            return;
        }
        System.out.println("You have Won!!");

        scan.close();
        return;
    }

    // uses try catch block that kees executing until a return condition is met
    public static int promptNumberReadLine(Scanner scan, String prompt, int max) {
        while (true) { // continuously loop until valid input is received
            // this just fix if the program exits while scanner is active. it will spam the
            // prompt
            // this makes it so if its called more than once then exit
            called++;
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
        System.out.println("Rope: " + (player.resources.isRope() ? "1 " : "0 ") + " | Sword: "
                + (player.resources.isSword() ? "1 " : "0 ") + "| Camp Supplies: "
                + (player.resources.isCampSupplies() ? "1 " : "0 ") + "| Raft: "
                + (player.resources.isRaft() ? "1 " : "0 ") + "\t" + "Karma: " + player.karma + "\n");
        promptContinue(scan, currScenario.getIntroText());
        animateText("\n" + "\n" + currScenario.getHeaderText() + "\n" + "\n", 10);

        for (int i = 0; i < currScenario.getChoicesLength(); i++) {
            System.out.println(i + 1 + ": " + currScenario.getOneChoice(i));
        }
        int number = promptNumberReadLine(scan, "please enter your move (1-" + currScenario.getChoicesLength() + "): ",
                currScenario.getChoicesLength());
        Scenario temp = currScenario;
        if (player.karma >= 2 && currScenario.hasDeathScenarios()) {
            if (1 != 2) {
                handleDeath(scan, number - 1);
            }
            return;
        }
        int pointerToNext = currScenario.getPointer(number);
        if (pointerToNext == -1) {
            currScenario = prevNodes.pop();
        } else if (pointerToNext == -2) { // this is opening chests
            if (player.isVisited(pointerToNext)) {
                promptContinue(scan, "The Chest is Empty");
            } else {
                promptContinue(scan, player.resources.getRandomResource());
                player.addToVisited(pointerToNext);
            }
            currScenario = prevNodes.pop();
        } else {
            currScenario = state.gameArray.get(pointerToNext);
            prevNodes.push(temp);
        }
        player.increaseKarma();

    }

    public static void handleDeath(Scanner scan, int index) {
        promptContinue(scan, currScenario.getRandomDeathScenarios());
        animateText("GAME OVER!!", 10);

        currScenario = null;
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
                Thread.currentThread().interrupt(); // restore the interrupted status
                System.err.println("Thread was interrupted, failed to complete operation");
            }
        }
        System.out.println(); // move to the next line after the text is printed
    }

}
