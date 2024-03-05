public class GameValues {
    public static String[] introTexts = {
        "You are walking through the forest and stumble upon a fork in the road.",
        "You decide to go left and start climbing the hill. After a few minutes, you reach the top and find an old tower.",
        "You choose the path leading right, walking through the tall grass. Suddenly, you find a hidden chest.",
        "You decide to go straight towards the river. As you get closer, you notice a small boat tied to a tree.",
        "Inside the tower, you find a staircase spiraling upwards.",
        "You open the chest to find a map leading to a buried treasure.",
        "You take the boat and start rowing across the river. Midway, you see an island.",
        "At the top of the stairs, you find a telescope pointing at the stars.",
        "Following the map, you eventually find the treasure buried under an ancient tree.",
        "On the island, you find a cave with glowing crystals.",
        "Looking through the telescope, you discover a new constellation.",
        "You take the treasure and become incredibly wealthy.",
        "Deep inside the cave, you find a sleeping dragon.",
        "Your discovery makes you famous in the astronomy community.",
        "Your donations help build schools and hospitals.",
        "You manage to sneak past the dragon and find its hoard of gold."
    };
    public static String[] questions = {
        "You have 3 choices to make, you see a hill to your left, a river in front of you, and grass to your right.",
        "Do you enter the tower or return to the fork in the road?",
        "Do you open the chest or go back to the fork?",
        "Do you take the boat to cross the river or return to the fork?",
        "Do you go up the stairs or leave the tower?",
        "Do you follow the map or ignore it?",
        "Do you explore the island or continue across the river?",
        "Do you look through the telescope or go back down?",
        "Do you take the treasure or leave it?",
        "Do you enter the cave or go back to the boat?",
        "Do you document your discovery or forget about it?",
        "Do you donate some of your wealth or keep it all?",
        "Do you try to sneak past it or leave quietly?",
        "Do you continue your research or retire early?",
        "Do you remain anonymous or take credit for your donations?",
        "Do you take some gold or leave it?"
    };
    public static String[][] choices = {
        {"Go left", "Go right", "Go straight"},
        {"Enter the tower", "Return to the fork"},
        {"Open the chest", "Go back"},
        {"Take the boat", "Return to the fork"},
        {"Go up the stairs", "Leave the tower"},
        {"Follow the map", "Ignore the map"},
        {"Explore the island", "Continue"},
        {"Look through the telescope", "Go back down"},
        {"Take the treasure", "Leave it"},
        {"Enter the cave", "Go back"},
        {"Document it", "Forget about it"},
        {"Donate some", "Keep it all"},
        {"Sneak past", "Leave quietly"},
        {"Continue research", "Retire early"},
        {"Remain anonymous", "Take credit"},
        {"Take some gold", "Leave it"}
    };
    //hold pointers to next nodes and a risk weight for each choice
    public static int[][][] metaDataChoices = {
        {{1, 2, 3}, {1, 100, 1}},
        {{4, 0},{1, 1}},
        {{5, 0}, {1, 1}},
        {{6, 0}, {1, 1}},
        {{7, 0}, {1, 1}},
        {{8, 0}, {1, 1}},
        {{9, 0}, {1, 1}},
        {{10, 0}, {1, 1}},
        {{11, 0}, {1, 1}},
        {{12, 0}, {1, 1}},
        {{13, 0}, {1, 1}},
        {{14, 0}, {1, 1}},
        {{15, 0}, {1, 1}},
        {{16, 0}, {1, 1}},
        {{17, 0}, {1, 1}},
        {{18, 0}, {1, 1}},
    };
    
}
