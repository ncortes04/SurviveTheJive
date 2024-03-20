import java.util.Map;
import java.util.List;
import java.util.HashMap;

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
                        "After donating some of your wealth, you hear about a mysterious forest enchanted with magic.", // Node
                                                                                                                        // 17
                        "While exploring the enchanted forest, you stumble upon a talking tree that offers you wisdom.", // Node
                                                                                                                         // 18
                        "You find a hidden village of elves who are in need of help to defend against a looming threat.", // Node
                                                                                                                          // 19
                        "The elves gift you a magical artifact as a token of their gratitude.", // Node 20
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

        };
        public static String[][] outcomes = {
                        // good outcome section
                        // path changes
                        { "You continue down the left path.", "You continue down the right path.",
                                        "You continue down the middle path." }, // Node 1
                        { "You continue down the left path.",
                                        "You continue down the right path.",
                                        "You continue down the middle path."
                        },
                        { "You continue down the left path.",
                                        "You continue down the right path.",
                                        "You continue down the middle path.", }, // path change 3 outcome node
                        { "You continue down the left path.",
                                        "You continue down the right path.",
                                        "You continue down the middle path.", }, // path change 4 outcome node

                        // path changes outcomes
                        { "You stop and admire the views that surrounds you. You feel ready to continue your journey." },
                        // view 1 outcome node
                        { "You continue on your path without stopping to look around.", }, // view 1 outcome node
                        { "You stop and admire the views that surrounds you. You feel ready to continue your journey." },
                        // view 1 outcome node
                        { "You continue on your path without stopping to look around.", },
                        { "You stop and admire the views that surrounds you. You feel ready to continue your journey." },
                        // view 1 outcome node
                        { "You continue on your path without stopping to look around.", },
                        { "You stop and admire the views that surrounds you. You feel ready to continue your journey." },
                        // view 1 outcome node
                        { "You continue on your path without stopping to look around.", },
                        { "You stop and admire the views that surrounds you. You feel ready to continue your journey." },
                        // view 1 outcome node
                        { "You continue on your path without stopping to look around.", },
                        { "You stop and admire the views that surrounds you. You feel ready to continue your journey." },
                        // view 1 outcome node
                        { "You continue on your path without stopping to look around.", },
                        { "You stop and admire the views that surrounds you. You feel ready to continue your journey." },
                        // view 1 outcome node
                        { "You continue on your path without stopping to look around.", },
                        { "You stop and admire the views that surrounds you. You feel ready to continue your journey." },
                        // view 1 outcome node
                        { "You continue on your path without stopping to look around.", },
                        { "You stop and admire the views that surrounds you. You feel ready to continue your journey." },
                        // view 1 outcome node
                        { "You continue on your path without stopping to look around.", },
                        { "You stop and admire the views that surrounds you. You feel ready to continue your journey." },
                        // view 1 outcome node
                        { "You continue on your path without stopping to look around.", },
                        // chests
                        { "" }, // outcome node
                        { "" }, // outcome node

                        // camping
                        { "" },// outcome node
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
                        { "Explore the enchanted forest", "Return to homeland" }, // Node 17
                        { "Ask for wisdom", "Ask for riches" }, // Node 18
                        { "Help the elves", "Continue journey" }, // Node 19
                        { "Keep the artifact", "Give it away" }, // Node 20
                        { "Go left", "Go right", "Go straight" }, // Node 21

        };
        // hold pointers to next nodes and a risk weight for each choice
        // this risk weight just tells us how risky it is, the higher mean more risk

        public static String[][] deathScenarios = {
                        {}, // Node 1: Initial choice, no direct death scenario
                        { "While entering the tower, a hidden trapdoor opens beneath you, plummeting you into darkness." }, // Node
                                                                                                                            // 2
                        { "The chest explodes upon opening, engulfing you in flames." }, // Node 3
                        { "The boat capsizes in strong currents, and you drown." }, // Node 4
                        { "The staircase crumbles under your feet, sending you falling to your demise." }, // Node
                                                                                                           // 5
                        {}, // Node 6: Finding a map, less direct risk here
                        {
                                        "Quicksand surrounds the island, trapping you as you step ashore." }, // Node 7
                        {}, // Node 8: Observing stars, less inherent risk
                        {}, // Node 9: Finding treasure, less inherent risk
                        {
                                        "The glowing crystals explode when touched, fatally wounding you." }, // Node 10
                        {}, // Node 11: Discovering a constellation, less inherent risk
                        {}, // Node 12: Becoming wealthy, less inherent risk
                        { "As you try and sneak by the dragon awakens, luckely you have a sword on you to defend yourself",
                                        "The dragon awakens and incinerates you with a fiery breath." }, // Node
                        // 13
                        {}, // Node 14: Gaining fame, less inherent risk
                        {}, // Node 15: Making donations, less inherent risk
                        { "The hoard is cursed; touching the gold turns you to stone.",
                                        "As you grab the gold, the cave begins to shake violently, sealing the exit forever." }, // Node
                                                                                                                                 // 16
                        { "You're ensnared by magical vines that strangle you.",
                                        "A cursed faerie misleads you deeper into the forest, where you're lost forever." }, // Node
                                                                                                                             // 17
                        { "The talking tree turns out to be a malevolent spirit that traps your soul.",
                                        "As you seek wisdom, a hidden guardian deems you unworthy and strikes you down." }, // Node
                                                                                                                            // 18
                        { "While helping the elves, you're caught in a deadly ambush.",
                                        "A mystical barrier erected to protect the village malfunctions and vaporizes you." }, // Node
                                                                                                                               // 19
                        { "The artifact unleashes a curse, consuming your life force.",
                                        "Attempting to use the artifact, you accidentally summon a demon that claims your soul." }, // Node
                                                                                                                                    // 20
                        { "One path leads to a spectral bear that mauls you.",
                                        "Another path ensnares you in an eternal mist from which there's no escape." }, // Node
                                                                                                                        // 21
        };
        public static int[][][] metaDataChoices = {
                        { { 1, 2, 3 }, { 1, 1, 1 } }, // Node 1
                        { { 4, -1 }, { 1, 1 } }, // Node 2
                        { { -2, -1 }, { 1, 1 } }, // Node 3
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
                        { { 18, -1 }, { 1, 1 } }, // Node 16
                        { { 18, 0 }, { 1, 1 } }, // Node 17
                        { { 19, 20 }, { 2, 3 } }, // Node 18
                        { { 21, 0 }, { 2, 1 } }, // Node 19
                        { { 0, 22 }, { 1, 2 } }, // Node 20
                        { { 22, 23, 0 }, { 2, 2, 1 } }, // Node 21

        };
}
