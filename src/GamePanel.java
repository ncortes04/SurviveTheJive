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

    @Override
    public void run() {
        // inits the stack with the first scenario
        prevNodes.push(currScenario);
        Scanner scan = new Scanner(System.in);
        //infinite loop until there is no new node, this is only possible if a player wins.
        while (currScenario != null) {
            handleTurn(scan);
        }

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
        // calls clear console
        clearConsole();
        // uses ternary to display players item count as well as karma
        System.out.println("Rope: " + (player.resources.isRope() ? "1 " : "0 ") + " | Sword: "
                + (player.resources.isSword() ? "1 " : "0 ") + "| Camp Supplies: "
                + (player.resources.isCampSupplies() ? "1 " : "0 ") + "| Raft: "
                + (player.resources.isRaft() ? "1 " : "0 ") + "\t" + "Karma: " + player.karma + "\n");
        // if player visits n distinct nodes, they win
        if(player.getVisitedCount() >= 9){
            handleWin(scan);
            return;
        }
        // displays text in which a player presses enter to continue
        promptContinue(scan, currScenario.getIntroText());
        // calls animate text along with a delay between characters
        animateText("\n" + "\n" + currScenario.getHeaderText() + "\n" + "\n", 10);
        // loops over choices and logs them
        for (int i = 0; i < currScenario.getChoicesLength(); i++) {
            System.out.println(i + 1 + ": " + currScenario.getOneChoice(i));
        }
        // displays choice count
        int number = promptNumberReadLine(scan, "please enter your move (1-" + currScenario.getChoicesLength() + "): ",
                currScenario.getChoicesLength());
        Scenario currentPointer = currScenario;
        // calls karma class and has a chance to end the game based on the players karma and the choice they made
        if (Karma.isBadThing(player.karma, currScenario.getWeight(number)) && currScenario.hasDeathScenarios()) {
            handleDeath(scan, number - 1);
            return;
        }
        // sets a pointer of the index of the next node
        int pointerToNext = currScenario.getPointer(number);
        // if its -1 we that means go back to the previous node
        if (pointerToNext == -1) {
            currScenario = prevNodes.pop();
        } else if (pointerToNext == -2) { // this is opening chests
            // if its in visited set they cannot open again
            if (player.isVisited(pointerToNext)) {
                promptContinue(scan, "The Chest is Empty");
            } else {
                // else get random resource
                promptContinue(scan, player.resources.getRandomResource());
            }
            // goes back to the previous node
            currScenario = prevNodes.pop();
        } else {
            // if its neither go back or opening a chest then progress to the next node they chose
            currScenario = state.gameArray.get(pointerToNext);
            // add node index to the stack
            prevNodes.push(currentPointer);
        }
        // checks if last node has an outcome, not all node has that specific outcome
        if(prevNodes.peek().hasOutcome(number)) {
            // if its does then its safe to return it
            promptContinue(scan, prevNodes.peek().getOutcome(number));
        }
        // if the current node isnt already in the visited set, add karma
        if(!player.isVisited(currScenario.getIndex())){
            player.increaseKarma();
        }
        // adds node to visited set, sets cannot have duplicates so no if statement is needed
        player.addToVisited(currentPointer.getIndex());

    }
    // handles death and ends game
    public static void handleDeath(Scanner scan, int index) {
        promptContinue(scan, currScenario.getRandomDeathScenarios());
        animateText("GAME OVER!!", 10);

        currScenario = null;
    }
    // handles win and ends game
    public static void handleWin(Scanner scan) {
            promptContinue(scan, "Congrats you have won completed 15 scenaiors and have won");
            currScenario = null;
    }

    public static void clearConsole() {
        // console comment to move top left/ home and clear the console
        System.out.print("\033[H\033[2J");
        // forces buffer to be written to console (safety)
        System.out.flush();
    }
    
    public static void animateText(String text, long delay) {
        // uses a for in loop to loop over string and grab each character
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
