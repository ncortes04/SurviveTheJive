public class GameValues {
    // intro text giving a breif description of what happened
    // ACTION NODES 3,6,9,16,19,20,25,33,34
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
            "You manage to sneak past the dragon and find its hoard of gold.", // Node 16
            "After donating some of your wealth, you hear about a mysterious forest enchanted with magic.", // Node 17
            "While exploring the enchanted forest, you stumble upon a talking tree that offers you wisdom.", // Node 18
            "You find a hidden village of elves who are in need of help to defend against a looming threat.", // Node 19
            "The elves gift you a magical artifact as a token of their gratitude.", // Node 20
            "You encounter a crossroads within the forest, each path shrouded in mist.", // Node 21
            "A mystical phoenix appears before you, offering to take you to a distant land.", // Node 22
            "You discover an ancient library filled with forgotten knowledge.", // Node 23
            "The ancient library reveals a secret passage as you touch one of the books.", // Node 24
            "Following the secret passage, you emerge in a chamber with a crystal glowing ominously.", // Node 25
            "You encounter a wise sage who offers to teach you ancient magic.", // Node 26
            "A mysterious portal opens in front of you, showing glimpses of other worlds.", // Node 27
            "In the depths of the forest, you find a mystical pond that reflects the stars during the day.", // Node 28
            "You discover a lost golem wandering, seeking its creator.", // Node 29
            "A hidden garden blooms in the moonlight, filled with flowers of pure gold.", // Node 30
            "You stumble upon an enchanted glade where time seems to stand still.", // Node 31
            "A nocturnal festival is being celebrated by the creatures of the forest; each offers you a gift.", // Node 32
            "You find an ancient artifact that seems to be missing pieces scattered around.", // Node 33
            "A group of travelers offers you a choice of their treasures before they part ways.", // Node 34
            "You come across a grand library guarded by a riddle-speaking Sphinx.", // Node 35
            "A magical storm brews in the sky, promising power but also danger.", // Node 36
            "The path splits into four, each leading to a different season.", // Node 37
            "You encounter a wise owl that speaks of destiny and asks you a profound question.", // Node 38
            "A bridge appears, but it demands a tribute to cross. The tribute changes with the moon." // Node 39
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
            "Do you take some gold or leave it?", // Node 16
            "Do you explore the enchanted forest or return to your homeland?", // Node 17
            "Do you ask for wisdom or for material riches?", // Node 18
            "Do you help the elves or continue on your journey?", // Node 19
            "Do you keep the artifact or give it to someone in need?", // Node 20
            "Which path do you choose: left, right, or straight ahead?", // Node 21
            "Do you accept the phoenix's offer or stay in the forest?", // Node 22
            "Do you study the ancient texts or search for treasures within the library?", // Node 23
            "Do you investigate the secret passage or ignore it?", // Node 24
            "Do you touch the crystal or leave the chamber?", // Node 25
            "Do you accept the sage's offer or kindly refuse?", // Node 26
            "Do you step through the portal or close it?", // Node 27
            "Do you drink from the mystical pond or merely observe?", // Node 28
            "Do you help the lost golem find its creator or leave it be?", // Node 29
            "Do you pick a golden flower or leave the garden untouched?", // Node 30
            "Do you stay in the enchanted glade or continue your journey?", // Node 31
            "Which gift do you choose: a lantern, a cloak, a book, or a key?", // Node 32
            "Do you search for the artifact pieces, or leave it be?", // Node 33
            "Which treasure do you choose: a sword, a shield, a potion, or a compass?", // Node 34
            "Do you attempt to answer the Sphinx's riddle, or bypass the library?", // Node 35
            "Do you harness the storm, seek shelter, or observe from a distance?", // Node 36
            "Which path do you choose: Spring, Summer, Autumn, or Winter?", // Node 37
            "How do you respond to the owl: seek knowledge, wealth, power, or love?", // Node 38
            "What tribute do you offer: a memory, a secret, a dream, or nothing?", // Node 39
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
            { "Take some gold", "Leave it" }, // Node 16
            {"Explore the enchanted forest", "Return to homeland"}, // Node 17
        {"Ask for wisdom", "Ask for riches"}, // Node 18
        {"Help the elves", "Continue journey"}, // Node 19
        {"Keep the artifact", "Give it away"}, // Node 20
        {"Go left", "Go right", "Go straight"}, // Node 21
        {"Accept the offer", "Stay in the forest"}, // Node 22
        {"Study the texts", "Search for treasures"}, // Node 23
        {"Investigate the passage", "Ignore it"}, // Node 24
        {"Touch the crystal", "Leave the chamber"}, // Node 25
        {"Accept the offer", "Refuse"}, // Node 26
        {"Step through the portal", "Close it"}, // Node 27
        {"Drink from the pond", "Observe"}, // Node 28
        {"Help the golem", "Leave it be"}, // Node 29
        {"Pick a golden flower", "Leave the garden untouched"}, // Node 30
        {"Stay in the glade", "Continue your journey"}, // Node 31
        {"Lantern", "Cloak", "Book", "Key"}, // Node 32
        {"Search for pieces", "Leave it be"}, // Node 33
        {"Sword", "Shield", "Potion", "Compass"}, // Node 34
        {"Answer riddle", "Bypass library"}, // Node 35
        {"Harness the storm", "Seek shelter", "Observe"}, // Node 36
        {"Spring", "Summer", "Autumn", "Winter"}, // Node 37
        {"Knowledge", "Wealth", "Power", "Love"}, // Node 38
        {"Memory", "Secret", "Dream", "Nothing"} // Node 39
    };
    // hold pointers to next nodes and a risk weight for each choice
    // this risk weight just tells us how risky it is, the higher mean more risk
    public static int[][][] metaDataChoices = {
            { { 1, 2, 3 }, { 1, 1, 1 } }, // Node 1
            { { 4, -1 }, { 1, 1 } }, // Node 2
            { { -2, -1 }, { 1, 1 } }, // Node 3 -- 5
            { { 6, -1 }, { 1, 1 } }, // Node 4
            { { 7, -1 }, { 1, 1 } }, // Node 5
            { { -2, -1 }, { 1, 1 } }, // Node 6 -- 8
            { { 9, -1 }, { 1, 1 } }, // Node 7
            { { 10, -1 }, { 1, 1 } }, // Node 8
            { { -2, -1 }, { 1, 1 } }, // Node 9 -- 11
            { { 12, -1 }, { 1, 1 } }, // Node 10
            { { 13, -1 }, { 1, 1 } }, // Node 11
            { { 14, -1 }, { 1, 1 } }, // Node 12
            { { 15, -1 }, { 1, 1 } }, // Node 13
            { { 16, -1 }, { 1, 1 } }, // Node 14
            { { 17, -1 }, { 1, 1 } }, // Node 15
            { { -2, -1 }, { 1, 1 } },// Node 16 -- 18
            {{18, 0}, {1, 1}}, // Node 17
            {{19, 20}, {2, 3}}, // Node 18
            {{-2, 0}, {2, 1}}, // Node 19 -- 21
            {{-2, 22}, {1, 2}}, // Node 20 -- 0
            {{22, 23, 0}, {2, 2, 1}}, // Node 21
            {{23, 0}, {3, 1}}, // Node 22
            {{24, 0}, {1, 2}}, // Node 23
            {{26, 0}, {2, 1}}, // Node 24
            {{27, 0}, {3, 1}}, // Node 25 -- 27
            {{28, 0}, {2, 1}}, // Node 26 -- 28
            {{29, 0}, {4, 1}}, // Node 27
            {{30, 0}, {3, 1}}, // Node 28
            {{31, 0}, {2, 1}}, // Node 29
            {{0, 0}, {3, 1}}, // Node 30
            {{0, 0}, {2, 1}},  // Node 31
            {{40, 41, 42, 43}, {2, 2, 3, 1}}, // Node 32
        {{44, 0}, {3, 1}}, // Node 33 -- 44/null
        {{45, 46, 47, 48}, {2, 2, 3, 1}}, // Node 34 -- actions
        {{49, 0}, {4, 1}}, // Node 35
        {{50, 51, 0}, {4, 2, 1}}, // Node 36
        {{52, 53, 54, 55}, {2, 2, 2, 2}}, // Node 37
        {{56, 57, 58, 59}, {3, 1, 4, 2}}, // Node 38
        {{60, 61, 62, 0}, {3, 3, 3, 1}}  // Node 39
    };

}
