public class GameValues {
    // intro text giving a breif description of what happened
    public static String[] introTexts = {
            "You are walking through the forest and stumble upon a fork in the road.", // Node 1
            "You decide to go left and start climbing the hill. After a few minutes, you reach the top and find an old tower.", // Node
                                                                                                                                // 2
            "You choose the path leading right, walking through the tall grass. Suddenly, you find a hidden chest.", // Node
                                                                                                                     // 3
            "You decide to go straight towards the river. As you get closer, you notice a small boat tied to a tree.", // Node
                                                                                                                       // 4
            "Inside the tower, you find a staircase spiraling upwards.", // Node 5
            "You open the chest to find a map leading to a buried treasure.", // Node 6
            "You take the boat and start rowing across the river. Midway, you see an island.", // Node 7
            "At the top of the stairs, you find a telescope pointing at the stars.", // Node 8
            "Following the map, you eventually find the treasure buried under an ancient tree.", // Node 9
            "On the island, you find a cave with glowing crystals.", // Node 10
            "Looking through the telescope, you discover a new constellation.", // Node 11
            "You take the treasure and become incredibly wealthy.", // Node 12
            "Deep inside the cave, you find a sleeping dragon.", // Node 13
            "Your discovery makes you famous in the astronomy community.", // Node 14
            "Your donations help build schools and hospitals.", // Node 15
            "You manage to sneak past the dragon and find its hoard of gold." // Node 16
    };
    // Lays out questions for the player
    public static String[] questions = {
            "You have 3 choices to make, you see a hill to your left, a river in front of you, and grass to your right.", // Node
                                                                                                                          // 1
            "Do you enter the tower or return to the fork in the road?", // Node 2
            "Do you open the chest or go back to the fork?", // Node 3
            "Do you take the boat to cross the river or return to the fork?", // Node 4
            "Do you go up the stairs or leave the tower?", // Node 5
            "Do you follow the map or ignore it?", // Node 6
            "Do you explore the island or continue across the river?", // Node 7
            "Do you look through the telescope or go back down?", // Node 8
            "Do you take the treasure or leave it?", // Node 9
            "Do you enter the cave or go back to the boat?", // Node 10
            "Do you document your discovery or forget about it?", // Node 11
            "Do you donate some of your wealth or keep it all?", // Node 12
            "Do you try to sneak past it or leave quietly?", // Node 13
            "Do you continue your research or retire early?", // Node 14
            "Do you remain anonymous or take credit for your donations?", // Node 15
            "Do you take some gold or leave it?" // Node 16
    };
    // gives choices 0 - n correspnging to a node found in pointers
    public static String[][] choices = {
            { "Go left", "Go right", "Go straight" }, // Node 1
            { "Enter the tower", "Return to the fork" }, // Node 2
            { "Open the chest", "Go back" }, // Node 3
            { "Take the boat", "Return to the fork" }, // Node 4
            { "Go up the stairs", "Leave the tower" }, // Node 5
            { "Follow the map", "Ignore the map" }, // Node 6
            { "Explore the island", "Continue" }, // Node 7
            { "Look through the telescope", "Go back down" }, // Node 8
            { "Take the treasure", "Leave it" }, // Node 9
            { "Enter the cave", "Go back" }, // Node 10
            { "Document it", "Forget about it" }, // Node 11
            { "Donate some", "Keep it all" }, // Node 12
            { "Sneak past", "Leave quietly" }, // Node 13
            { "Continue research", "Retire early" }, // Node 14
            { "Remain anonymous", "Take credit" }, // Node 15
            { "Take some gold", "Leave it" } // Node 16
    };
    // hold pointers to next nodes and a risk weight for each choice
    // this risk weight just tells us how risky it is, the higher mean more risk
    public static int[][][] metaDataChoices = {
            { { 1, 2, 3 }, { 1, 1, 1 } }, // Node 1
            { { 4, -1 }, { 1, 1 } }, // Node 2
            { { 5, -1 }, { 1, 1 } }, // Node 3
            { { 6, -1 }, { 1, 1 } }, // Node 4
            { { 7, -1 }, { 1, 1 } }, // Node 5
            { { 8, -1 }, { 1, 1 } }, // Node 6
            { { 9, -1 }, { 1, 1 } }, // Node 7
            { { 10, -1 }, { 1, 1 } }, // Node 8
            { { 11, -1 }, { 1, 1 } }, // Node 9
            { { 12, -1 }, { 1, 1 } }, // Node 10
            { { 13, -1 }, { 1, 1 } }, // Node 11
            { { 14, -1 }, { 1, 1 } }, // Node 12
            { { 15, -1 }, { 1, 1 } }, // Node 13
            { { 16, -1 }, { 1, 1 } }, // Node 14
            { { 17, -1 }, { 1, 1 } }, // Node 15
            { { 18, -1 }, { 1, 1 } },// Node 16
    };

}
