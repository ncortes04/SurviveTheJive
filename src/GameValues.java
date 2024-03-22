import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class GameValues {
        // intro text giving a breif description of what happened
        /*this file works by defning a scenario that has an intro text, question, choices, deathtext, and meta data
        This is like a graph / tree since some nodes have multiple nodes that point to it
        */ 
        public static String[] introTexts = {
        		//path change
        		"Soon after starting your journey, You find yourself at a fork in the path ahead.",  //node 1
        		"You come to a fork in the path ahead.", //node 2
        		"Ahead, the path splits into 3 new paths.", //node 3
        		"You come across a junction in the path ahead.", //node 4
        		//view M
        		"Shortly after the fork in the path you start making your way up the side of a mountain. You soon find yourself at a mountain side overlook.",  //node 5
        		"After trekking along a winding mountain trail you come across a bridge passing in front of a cliff side waterfall.", //node 6
        		"You climb higher into the mountain range, with mountains surrounding you, you eventually come across a meadow hidden by mountain peaks.", //node 7
        		//view F
        		"After making your way through a slowly densening pine forest, you come to a large grassy clearing surrounded by trees.", //node 8
        		"You path takes you through a forest full of maples, stretching as far as the eyes can see.", //node 9
        		"Your path takes you deeper into a forest, the sounds of water reaches you before you see the log bridge stretching over a lazy river.", //node 10
        		//view H
        		"As you walk down your new path, the area around you starts to turn into grassy hill rolling off into the distance.", //node 11
        		"Your path takes you up and down rolling hills that seem to strech for miles, you crest a hill gracing you with a view of a lake below.", //node 12
        		"You contuinue along your path, you soon come across a bubbling creek that crosses the trail ahead. ", //node 13
        		//view V
        		"As you make you way along the valley floor, the view arounds you changes to a meadow, filled with flowers of all different types.", //node 14
        		"Your path takes you along an old wooden fence, weathered with times. In the distance you see a herd of cows grazing, kept together by the fence.", //node 15
        		"As your path meanders along the vally floor, you come across a steel bridge spanning a glacial river ahead.",// node 16
        		//loot
        		"On the path ahead, you come across a cart that has been rolled over, you see that all the items on the cart have been rummaged through, but you see what looks like an untouched chest.", //node 17
        		"You come across a turned over cart with an unopened chest in it.", //node 18
        		//camp
        		"Your path leads you to a great camping site next to a small picturesque lake.", //node 19
        		"Your path leads you to a covered clearing in the forest. It would make a great spot to camp for the night.", //node 20
        		"Your path leads you to a great camping spot in the middle of a meadow next to a small creek.", //node 21
        		"Your path leads you to a camping shelter. This is an amazing spot to stop for the night.", //node 22
        		"Your path leads you to an unpotimal camping spot along the path. At least it has a stream for water.", //node 23
        		//issues
        		"While walking along a path cut into the side of a mountain, you come across a section of the path that has been washed away. Suddenly, Behind you, you hear a rumbling as the ground behind you falls away. You have to continue forwards.", //node 24
        		"While walking through a wooded area, you suddenly come upon a Grizzly bear blocking the path, before you know it, the bear starts charging you.", //node 25
        		"As your walking along the side of a hill, you suddenly feel and hear a rumbling from the area above you. You look up to see a rock slide coming your way.", //node 26
        		"As you are walking along a mountain ridge, you start to notice the sky around you turn dark and cloudy. Thunder starts to echo across the valleys below. You start to feel a tingling sensation and your hair starts to stand on end.", //node 27
        		"Your path is taking you across a dried riverbed, you hear thunder rolling through the valley from a storm in the distance. When your just over half way across you hear a rumbling that turns into the sound of rushing water. You have found yourself in the middle of a flash flood.", //node 28
        		//blockage
        		"Ahead, you see a river that interrupts your path. You notice that the bridge that once spanned the river was washed away at some point.", //node 29
        		"As you look ahead, you find your path blocked by a rock slide that has covered the path ahead.", //node 30
        		"When you come around a bend in the path, your suddenly faced with a fallen tree that is laying across your path. The tree must be 6 feet across.", //node 31
        		"As your walking along the path valley path, you suddenly stop dead in your tracks, ahead, standing in the middle of the path blocking the way forwards is a cow. Its stares at you with its cold, dead eyes waiting for you decision.", //node 32
        		//event
        		"You come upon a stranger standing in the middle of the path looking out across a nearby lake. He is wearing an outfit that is made up of extreamly bright colors and his backpack is covered in random trickets.", //node 33
        		"A group of people around a camp fire(placeholder)", //node 34
        		"Indian guy on the path (not native american)(placeholder)", //node 35
        		"friendly old man",//node 36
        		"nerrator",//node 37
        		//site
        		"As you walking along your path, you come across and old abandoned cabin.",//node 38
        		"Along your path you notice an old fire tower not far off the path perched ontop of a near by ridge. ",//node 39
        }; 
        		 public static String[][] outcomes = {
                         // good outcome section
                         // path changes
                         { "You continue down the left path.", "You continue down the right path.", "You continue down the middle path."}, // path change 1 Node 1
                         { "You continue down the left path.", "You continue down the right path.", "You continue down the middle path."}, // path change 2 node 2
                         { "You continue down the left path.", "You continue down the right path.", "You continue down the middle path."}, // path change 3 node 3
                         { "You continue down the left path.", "You continue down the right path.", "You continue down the middle path."}, // path change 4 node 4
                         // path changes outcomes
                         { "You stop and admire the views that surrounds you. You feel ready to continue your journey.", "You continue on your path without stopping to look around." },// view 1 outcome node 5
                         { "You stop and admire the views that surrounds you. You feel ready to continue your journey.", "You continue on your path without stopping to look around." },// view 2 outcome node 6
                         { "You stop and admire the views that surrounds you. You feel ready to continue your journey.", "You continue on your path without stopping to look around." },// view 3 outcome node 7
                         { "You stop and admire the views that surrounds you. You feel ready to continue your journey.", "You continue on your path without stopping to look around." },// view 4 outcome node 8
                         { "You stop and admire the views that surrounds you. You feel ready to continue your journey.", "You continue on your path without stopping to look around." },// view 5 outcome node 9
                         { "You stop and admire the views that surrounds you. You feel ready to continue your journey.", "You continue on your path without stopping to look around." },// view 6 outcome node 10
                         { "You stop and admire the views that surrounds you. You feel ready to continue your journey.", "You continue on your path without stopping to look around." },// view 7 outcome node 11
                         { "You stop and admire the views that surrounds you. You feel ready to continue your journey."},// view 8 outcome node 12
                         { "You stop and admire the views that surrounds you. You feel ready to continue your journey.", "You continue on your path without stopping to look around." },// view 9 outcome node 13
                         { "You stop and admire the views that surrounds you. You feel ready to continue your journey.", "You continue on your path without stopping to look around." },// view 10 outcome node 14
                         { "You stop and admire the views that surrounds you. You feel ready to continue your journey.", "You continue on your path without stopping to look around." },// view 11 outcome node 15
                         { "You stop and admire the views that surrounds you. You feel ready to continue your journey.", "You continue on your path without stopping to look around." },// view 12 outcome node 16
                         // chests
                         { "You open the chest and you were able to find something useful.", "You leave the chest behind, better be safe than sorry. You never know if it is a trap." }, // outcome node 17
                         { "You open the chest and you were able to find something useful.", "You leave the chest behind, better be safe than sorry. You never know if it is a trap."}, // outcome node 18
                         // camping
                         { "You set up camp and spend the night looking out over the lake. You feel well rested and ready to continue on the trail.", "You continue along the path ahead hoping to find another stop to camp.", "You go exploring along the edge of the lake and you were able to find some useful supplies." },// outcome node 19
                         { "You set up camp and spend the night looking up at the starts though the canopy above. You feel well rested and ready to continue on the trail.", "You continue along the path ahead hoping to find another stop to camp.", "You go exploring along the edge of the lake and you were able to find some useful supplies."  },// outcome node 20
                         { "You set up camp and spend the night dreaming of your journey ahead. You feel well rested and ready to continue on the trail.", "You continue along the path ahead hoping to find another stop to camp.", "You go exploring along the edge of the lake and you were able to find some useful supplies."  },// outcome node 21
                         { "You set up camp and spend the night in comparable luxury. You feel extreamly well rested and ready for the rest of your journey.", "You continue along the path ahead hoping to find another stop to camp.", "You go exploring along the edge of the lake and you were able to find some useful supplies."  },// outcome node 22
                         { "You set up camp and spend the night listening to the stream trickle by. You feel rested and ready to continue on the trail.", "You continue along the path ahead hoping to find another stop to camp.", "You go exploring along the edge of the lake and you were able to find some useful supplies."  },// outcome node 23
                         //issues
                         { "You start you climb along the cliff wall. As you grab your first hand hold a rock falls but you continue onwards. You were able to find just enough hand holds to make it across safely",
                        	 	"You take a few steps back and take a short run up, you leap across landing safely on the other side.", "You carefully make your way down the washed out section, making sure your find proper footings before taking each step. In no time you safely make it across." },// outcome node 34
                         { "You start to try and run away from the charging bear, This cuases the bear to give chase. After a minute of running you look back to see the bear had lost interest and wondered off. You got incredibly lucky doing the wrong thing.", 
                         		"You plant your feet and prepare to fight, right before the bear reaches you, you make a war cry preparing to fight a bear. Luckly the sound of you yelling and the postering you are in caused the bear to get scared off.",
                         			"As the bear charges, you fall limp to the ground, trying to play dead. The bear slows his charge and walked towards your limp form. It takes a few good sniffs, and taps you with its paw but it loses interest quickly and wanders off. You were lucky that it was a grizzly bear and this was one of the right things to do.",
                         				"As the bear charges, you remember bears do bluff charges when startled and you go through the steps to prevent an attack. You make yourself as big as you can waving your hands in the air while taking a few slow steps back while making some noise. You avoid eye contact and turning your back to the bear. This causes the bear to change direction deeper into the forest. You did the right thing here."},// outcome node 25
                         { "Being stuck in a rock fall with no good solutions, you take your chances and start running forwards along the trail. Rocks start landing all around you but luckily you were able to make it away without a scratch.",
                         					"Being stuck in a rock fall with no good solutions, you take your chances and start running back the way you came. Rocks start to land all around were you just were and luckily you were able to make it away without a scratch.",
                         						"Being stuck in a rock fall with no good solutions, you dive towards the only cover you can see, a nearby boulder. Hiding under the rock you hear rocks fall all around you but luckily you were able to make it away without a scratch." },// outcome node 26
                         { "As lightning starts to fill the sky, you keep walking looking for any form of shelter you can find. After a few painfully long minutes you come across an abandoned mine where you are able to take cover from the storm. It was an incredibly risky decision but it luckily worked out.", 
                         		"As your hair starts to stand, you know this is the first sign your about to be struck by lightning. You quickly fall to the ground landing on your hands and knees putting as little contact on the ground that you can. Seconds later lightning starts to strike around you, hitting the nearby rocks only dozens of yards away. While the sounds were deafening, you feel lucky to have made it out with your life.",
                         			"You immediately rush towards a boulder that looks like it has just enough space below it to hide. You crawl under the boulder seconds before lightning strikes the ground around you.  The sounds of lightning deafen you as the boulder gets showered in debris. You were lucky that the boulder you are hiding under did not get struck. "},// outcome node 27
                         { "Your first instincts causes you to rush towards a large rock that is just over half way across the river bed, as you scramble up the rock water starts to flow around you. Slowly rising higher and higher up the rock. The sudden torrent of water finally stops three quarters up the rock you are trapped on. As the minutes tick by you are able to think about the poor decisions you have made but as if by a miracle, the water starts to slow to the point it is safe to cross. You make it to the other side as if by sheer luck.", 
                         	"As the rumble of water starts to sound, you start to sprint for your life. Within seconds you reach the other side, moments before the area you once stood is flooded with massive surge of water. It crashes along the river bed like a freight train taking out everything in its path. You are safely on the river bank knowing if you were only a few seconds slower, you would have never made it across.",
                         		"You panic, with the sounds of water thundering towards you start running, not to the shore 15 yards ahead, but away from the water in a blind sprint. The water crashes around a bend up stream racing towards you, gaining on you, but as if by a miracle your path takes you up a sand bank moments before the water overtakes you. The flow of water gets split into two and after a few minutes, favors the path behind where you need to go. You are able to continue your journey "},// outcome node 28
                         //blockage
                         { "You start to make you way across the river. While the water looked deep, it was slow moving allowing you to make it across without an issue.",
                         	"You decide to go and look for another path. You start making your way up river and after about twenty minutes of walking you find yourself at another bridge that you are able to take across. You head back down stream on the other bank until you are able to reconnect to your path and continue your journey.",},// outcome node 29
                         { "You start to climb over the pile of rocks, carfuly moving across making sure you only use stable rocks. After a bit of struggling you are able to make it over with only a few scrapes and bruises showing your effort.",
                         	"After a bit of serching, you are able to find a clear path makes its way through the rock pile. While it was slow going, you are able to reconnect with the path with few issues."},// outcome node 30
                         { "You start to climb over the tree, you use the branches like a ladder and slowly make your way across. While it wasent very graceful you are able to make it over with only a few scratches.",
                      		"After takeing a few moments to assess the situation in front of you. You see that you sould be able to crawl under the log. You remove your backpack and carfuly slide under the fallen tree making your way across. Besides being a bit dirty, your no worse for ware."},// outcome node 31
                         { "With the terrifying beast in front of you, your only option its to attempt to reason with it to allow you to pass unharmed. You dig through you bag, finding an apple that you were saving for lunch. Carefully you approach the cow, holding the apple at as far as you can in front of you. You ask the cow, if I give you this apple will you please let me pass Mr. cow? With that said you place the apple in front hoping that the cow will be satisfied. MOOO, the cow ignores the apple and walks off the trail to go eat some nearby grass. The cow had accepted your offering and is allowing you to pass. ",
                      		"After a few seconds of panic you realize that it is just a cow. You decide to walk around the cow without any second thought. As you approach the cow, it starts to wander into the field next to the path, more interested in the grass than you. You continue on leaving the cow behind you.",
                      			"After a few seconds of though you realize there is no reasoning with such a terrifying creature. You must sneak past. You quickly drop down you your belly and low crawl towards the cow. Every time it looks in your direction you freeze in fear. When you only a few feet away, the cow decides to wander into the field next to the path to go eat some grass. You are relived that the best never noticed your approach and you are able to continue past the cow."},// outcome node 32
                         //event
                         { "You decide to pass by the stranger with a firendly nod. The man smiles at you as you pass and give you a friendly nod back. You continue on while thinking of the interesting man you encountered.",
                      		"You decide to strike up a friendly conversation with the man who introduces himself as Tony. You chat about the beautiful lake that fills your view and you talk about the journeys that you both have taken so far. As you are about to leave he stops you and hands you a random item that might be useful on the rest of your journey.",
                      		 "For some unknown reason, you decided to chose violence today. As you pass by you hit him with a sucker punch to the face. The man falls to the ground unconscious. The choice you made is a confusing one but you made the choice anyways. You continue on with the feeling that you have made the rest of the journey harder.",
                      		   "You decide to throw a creative insult at the strange man about the way he is dressed. While the man looks confused the takes it as a joke and laughs it off, even throwing one back at you. You feel lucky that the man took the insult in good spirits and you continue on your journey."},// outcome node 33
                         { "campfire placeholder 1","campfire placeholder 2","campfire placeholder 3" },// outcome node 34
                         { "indian place holder 1", "indian place holder 2", "indian place holder 3" },// outcome node 35
                         { "old man placeholder 1", "old mand placeholder 2", "Old man placeholder 3" },// outcome node 36
                         { "nerrator placeholder 1", "nerrator placeholder 2", "nerrator placeholder 3" },// outcome node 37
                         //site
                         { "You decide to stop and look around. The cabin looks long abandoned but in supprisingly good shape. As you circle the cabin you find a plaque that talks how this cabin was an old trappers cabin. This was a nice break from your trek but you must keep moving forwards.", "You decide to keep walking, leaving the cabin behind you."},// outcome node 38
                         { "You decide to take a short detour and head to the fire tower. As you approch you notice a lookout who invites you to come and have a look around. You take in the views from the tower feeling ready to continue your journey. ", "You decide to keep walking, chosing to not bother the lookout today."},// outcome node 39
           		
        };
        // Lays out questions for the player
        public static String[] questions = {
        				//path
                       "Would you like to take the path that heads left, the path that heads right, or continue on your current path?",//node 1
                       "Would you like to take the path that heads left, the path that heads right, or continue on your current path?",//node 2
                       "Would you like to take the path that heads left, the path that heads right, or continue on your current path?",//node 3
                       "Would you like to take the path that heads left, the path that heads right, or continue on your current path?",//node 4
                       //view
                       "Would you like to stop and take in the views, continue on the path ahead or would you like to go back to the fork in the road?",//node 5
                       "Would you like to stop and take in the views, continue on the path ahead or would you like to go back to the fork in the road?",//node 6
                       "Would you like to stop and take in the views, continue on the path ahead or would you like to go back to the fork in the road?",//node 7
                       "Would you like to stop and take in the views, continue on the path ahead or would you like to go back to the fork in the road?",//node 8
                       "Would you like to stop and take in the views, continue on the path ahead or would you like to go back to the fork in the road?",//node 9
                       "Would you like to stop and take in the views, continue on the path ahead or would you like to go back to the fork in the road?",//node 10
                       "Would you like to stop and take in the views, continue on the path ahead or would you like to go back to the fork in the road?",//node 11
                       "Would you like to stop and take in the views, or would you like to continue on the path ahead?",//node 12
                       "Would you like to stop and take in the views, or would you like to continue on the path ahead?",//node 13
                       "Would you like to stop and take in the views, continue on the path ahead or would you like to go back to the fork in the road?",//node 14
                       "Would you like to stop and take in the views, continue on the path ahead or would you like to go back to the fork in the road?",//node 15
                       "Would you like to stop and take in the views, continue on the path ahead or would you like to go back to the fork in the road?",//node 16
                       //loot
                       "Would you like to try and open the chest to see if it has anything of value, or should you leave it where it is and keep walking?", //node 17
                       "Would you like to try and open the chest to see if it has anything of value, or should you leave it where it is?", //node 18
                       //camp
                       "Would you like to stay and set up camp, keep going along the path, or do you want to stop and explore the surrounding area?",//node 19
                       "Would you like to stay and set up camp, keep going along the path, or do you want to stop and explore the surrounding area?",//node 20
                       "Would you like to stay and set up camp, keep going along the path, or do you want to stop and explore the surrounding area?",//node 21
                       "Would you like to stay and set up camp, keep going along the path, or do you want to stop and explore the surrounding area?",//node 22
                       "Would you like to stay and set up camp, keep going along the path, or do you want to stop and explore the surrounding area?",//node 23
                       //issue
                       "You need to get across, Would you like to try and climb on the cliff wall, Try and jump the gap, or do you climb down the washout and attempt to make it across?",//node 24
                       "You need to think what to do fast. You can try to run, maybe fight back, try to lay down and play dead, or try and make yourself as big as you can while making some noise?",//node 25
                       "What do you do. Try and run in the direction of the trail, turn back and run, or hide next to a nearby boulder?",//node 26
                       "What would you like to do. Keep walking hoping to find cover, get down onto your hands and knees, or lay down next to a nearby boulder?",//node 27
                       "What would you like to do. Climb onto a nearby large rock, attempt to sprint to the other side, Run away from the oncoming water?",//node 28
                       //blockage
                       "Would you like to attempt to cross the river, or would you like to go find another way across.",//node 29
                       "Would you like to find a new path around the landslide or attempt to climb over the rocks and debris",//node 30
                       "What would you like to do. Climb over the tree, try and crawl under the tree, or try and find a different path?",//node 31
                       "cow 1, cow 2, cow 3, cow 4 (placeholder)",//node 32
                       //event
                       "Would you like to pass him with a friendly nod, attempt to start a conversation with him, try and fight him, or make fun of his outfit as you pass?",//node 33
                       "group 1, group 2, group 3(placeholder)",//node 34
                       "Indian 1, indian 2, indian 3, indian 4,",//node 35
                       "old man placeholder",//node 36
                       "nerrator placeholder",//node 37
                       //site
                       "Would you like to look around or continue on your journey.",//node 38
                       "Would you like to visit the tower, or would you like to keep walking.",//node 39
                      

        };
        // gives choices 0 - n correspnging to a node found in pointers
        public static String[][] choices = {
        		//path
        		{"Take the left path", "Take the right path.", "Take the middle path."}, //node 1
        		{"Take the left path", "Take the right path.", "Take the middle path."}, //node 2
        		{"Take the left path", "Take the right path.", "Take the middle path."}, //node 3
        		{"Take the left path", "Take the right path.", "Take the middle path."}, //node 4
        		//view
        		{"Take in the views.", "continue walking.", "Go back to the fork in the road."}, //node 5
        		{"Take in the views.", "continue walking.", "Go back to the fork in the road."}, //node 6
        		{"Take in the views.", "continue walking.", "Go back to the fork in the road."}, //node 7
        		{"Take in the views.", "continue walking.", "Go back to the fork in the road."}, //node 8
        		{"Take in the views.", "continue walking.", "Go back to the fork in the road."}, //node 9
        		{"Take in the views.", "continue walking.", "Go back to the fork in the road."}, //node 10
        		{"Take in the views.", "continue walking.", "Go back to the fork in the road."}, //node 11
        		{"Take in the views.", "continue walking."}, //node 12
        		{"Take in the views.", "continue walking."}, //node 13
        		{"Take in the views.", "continue walking.", "Go back to the fork in the road."}, //node 14
        		{"Take in the views.", "continue walking.", "Go back to the fork in the road."}, //node 15
        		{"Take in the views.", "continue walking.", "Go back to the fork in the road."}, //node 16
        		//loot
        		{"Open the chest.", "Leave the chest."}, //node 17
        		{"Open the chest.", "Leave the chest."}, //node 18
        		//camp
        		{"Stay and make camp.", "Keep walking.", "Go explore the surrounding area."}, //node 19
        		{"Stay and make camp.", "Keep walking.", "Go explore the surrounding area."}, //node 20
        		{"Stay and make camp.", "Keep walking.", "Go explore the surrounding area."}, //node 21
        		{"Stay and make camp.", "Keep walking.", "Go explore the surrounding area."}, //node 22
        		{"Stay and make camp.", "Keep walking.", "Go explore the surrounding area."}, //node 23
        		//issue
        		{"Try and climb the cliff wall.", "Attempt to jump the gap.", "Try and scramble along the bottom."}, //node 24
        		{"Try to run away.", "Fight back.", "Play dead.", "Make yourself as big as possible."}, //node 25
        		{"Run forwards.", "Run backwards.", "Hide next to boulder"}, //node 26
        		{"Keep walking.", "Get on hands and knees.", "Hide next to boulder"},//node 27
        		{"Climb onto rock.", "Sprint to endge of the river.", "Run from the water."}, //node 28
        		//blockage
        		{"Attempt to cross.", "Find a different path."}, //node 29
        		{"Attempt to cross.", "Find a different path."}, //node 30
        		{"Climb over the tree.", "Try and crawl under.", "Try and find another path."}, //node 31
        		{"Reason with the cow.", "Walk around it.", "Find another path.", "Sneak around it."}, //node 32
        		//event
        		{"Pass him with a friendly nod.", "Attempt to start a conversation.", "Try and fight him.", "Randomly insult him."}, //node 33
        		{"camp fire 1", "campr fire 2", "camp fire 3"}, //node 34
        		{"indian 1", "indian 2", "indian 3", "indian 4"}, //node 35
        		{"old man 1", "old man 2", "old man 3"}, //node 36
        		{"nerrator 1", "nerrator 2", "nerrator 3", "nerrator 4"}, //node 37
        		//site
        		{"abandoned cabin 1", "abandoned cabin 2", "abandoned cabin 3"}, //node 38
        		{"Visit tower", "Keep walking"}, //node 39
        		
                                
        };
        // hold pointers to next nodes and a risk weight for each choice
        // this risk weight just tells us how risky it is, the higher mean more risk
        public static int[][][] metaDataChoices = {
        		//node - 1 remember
        		//empty nodes are not used but in the code
        				//camp
                        { {5,9,14}, {0,0,0} }, // Node 0
                        { {9, 11, 14}, {0,0,0} }, // Node 1
                        { {5, 14, 11}, {0,0,0} }, // Node 2
                        { {11, 5, 9}, {0,0,0} }, // Node 3
                        //views
                        { {-1, -1, -1}, {0, 0,0} }, // Node 4
                        { {25,25,-1}, {-5,0,0} }, // Node 5
                        { {}, {} }, // Node 6
                        { {}, {} }, // Node 7
                        { {}, {} }, // Node 8
                        { {32, 32, -1}, {-5,0,0} }, // Node 9
                        { {}, {} }, // Node 10
                        { {22, 22, -1}, {-5,0,0} }, // Node 11
                        { {0,0}, {-5,0} }, // Node 12
                        { {3, 3}, {-5,0} }, // Node 13
                        { {31, 31, -1}, {-5,0,0} }, // Node 14
                        { {}, {} }, // Node 15
                        //loot
                        { {2,2}, {10,5} }, // Node 16
                        { {13, 13}, {10,5} }, // Node 17
                        //camp
                        { {23,23,23}, {-25,5,10} }, // Node 18
                        { {}, {} }, // Node 19
                        { {17, 17, 17}, {-25,5,10} }, // Node 20
                        { {16, 16, 16}, {-25,5,10} }, // Node 21
                        { {30, 30, 30}, {-15,5,10} }, // Node 22
                        //issues
                        { {26, 26, 26}, {15,10,5} }, // Node 23
                        { {28, 28, 28, 28}, {25,15,10,5} }, // Node 24
                        { {29,29,29}, {15,15,10} }, // Node 25
                        { {1, 1, 1}, {25,5,10} }, // Node 26
                        { {20, 20, 20}, {20,5,20} }, // Node 27
                        //blockage
                        { {21, 21, 21}, {15,10,5} }, // Node 28
                        { {38, 38}, {10,5} }, // Node 29
                        { {34, 34, 34}, {10,5,10} }, // Node 30
                        //event
                        { {35, 35, 35, 35}, {5,10,5,15} }, // Node 31
                        { {37, 37, 37, 37}, {0,-5,25,25} }, // Node 32
                        { {12, 12, 12, 12}, {0,0,0,0} }, // Node 33
                        { {33, 33, 33}, {0,0,0} }, // Node 34
                        { {27, 27, 27}, {0,0,0} }, // Node 35
                        { {}, {} }, // Node 36
                        //site
                        { {24, 24}, {-5,0} }, // Node 37
                        { {18,18}, {-5,0} } // Node 38
        };
        
        public static String[][] deathScenarios = {
        				//path blank as no deaths
        		 		{}, //node 1
        		 		{}, //node 2
        		 		{}, //node 3
        		 		{}, //node 4
                        //view blank as no deaths
                        {}, //node 5
                        {}, //node 6
                        {}, //node 7
                        {}, //node 8
                        {}, //node 9
                        {}, //node 10
                        {}, //node 11
                        {}, //node 12
                        {}, //node 13
                        {}, //node 14
                        {}, //node 15
                        {}, //node 16
                        //loot
                        {"The chest was set up as a trap to unwary travelers. The bandits robbed you and left you for dead as you were trying to leave."}, // Node 1: Initial choice, no direct death scenario
                        {"The chest was set up as a trap to unwary travelers. The bandits robbed you and left you for dead as you were trying to leave"}, //node 2
                        //camp
                        {"As you decided not to stop and make camp, The sun set shortly after you start making you way up a hill. In the dark you didn�t notice that path being washed out causing you to fall down into the lake below.",
                    	"You unfortunately got lost while exploring the surrounding area and you were never able to find the path onwards again."}, //node 
                        {"As you decided not to stop and make camp, as the night starts to get darker you start to lose the path ahead. At some point in the night you lose the trail entirely and become hopelessly lost.",
                    	"You unfortunately got lost while exploring the surrounding area and you were never able to find the path onwards again."}, //node 
                        {"As you decided not to stop and make camp, As darkness starts to set, you start to hear rustling in the bushes along the path. Unfortunately you were never able to make it thought the night as you became somethings midnight snack.",
                    		"You unfortunately got lost while exploring the surrounding area and you were never able to find the path onwards again."}, //node 
                        {"As you decided not to stop and make camp, As darkness starts to set, you start to hear rustling in the bushes along the path. Unfortunately you were never able to make it thought the night as you became somethings midnight snack.",
                		"You unfortunately got lost while exploring the surrounding area and you were never able to find the path onwards again."}, //node 
                        {"As you decided not to stop and make camp, As darkness starts to set, You attempt to make your way across the stream. You unfortunately lose  your footing on the slippery rocks. You fall and hit your head, ending your journey.",
                    		"You unfortunately got lost while exploring the surrounding area and you were never able to find the path onwards again."}, //node 
                        //issue
                        {"You start you climb along the cliff wall. As you grab your first hand hold a rock falls but you continue onwards. When you are half way across, the rocks you are holding onto give way, causing you to fall to the rocks below.",
                    	  "As you attempt to leap across, you suddenly notice that the gap was a lot wider then you were thinking and you fail to make it across, falling down to the rocks below.",
                    		"You carefully make your way down the washed out section, making sure your find proper footings before taking each step. You suddenly start to feel the ground beneath your feet start to give out. The ground slides into the valley below, taking you with it."}, //node 
                        {"You turn your back to the bear and start sprinting away. This causes the bear to give chase. There is little to no hope outrunning a grizzly bear. Your journey ends here.",
                    	  "You plant your feet and prepare to fight, right before the bear reaches you, you make a war cry preparing to fight a bear. Unfortunately the shout doesn't scare the bear away and he pushes you to the ground. You have no chance fighting a grizzly bear.",
                    		"As the bear charges, you fall limp to the ground, trying to play dead. The bear doesn't slow its charge. The grizzly bear is in fight mode and you have no chance of defending yourself. Your journey ends here.",
                    		 "As the bear charges, you remember bears do bluff charges when startled and you go through the steps to prevent an attack. You do everything right, if the bear wasn't in defense mode. The bear makes every effort to defend its territory leaving nothing standing. Your journey ends here."}, //node 
                        {"As you attempt to run, you trip over a rock causing you to fall to the ground. As the rocks start to fall around you, you look up only to see a boulder heading right towards you. Your journey is cut short.",
                    		 "As you attempt to run, rocks start to fall around you. You start to duck and weave trying to avoid the rocks as they start to fall around you. After what seems like forever you reach the edge of where the rocks are falling. With a sigh of relief you take in the carnage around you, only to then notice the boulder heading your way. Your journey is suddenly cut short.",
                    			 "You dive under the nearest cover you can find hoping to wait out the rock fall. Around you, rocks fall like rain in a nonstop torrent. You close your eyes cowering in as the rocks continue to fall. When you finally open your eyes, you are buried under tons of rock. While your still alive, your journey ends here."}, //node 
                        {"As you start walking, you start to hear a buzzing in your ears, and the ends of your hair standing on end. You put your hand out only to see small bolts of lightning shoot from your fingertips. You keep walking, searching for any kind of cover. In an instant the world around you lights up in a blinding white light. You were never able to find protection from the storm and mother nature chose to end your journey.",
                    		"You drop to your hands and knees as the world around you explodes in a blinding white light and thunderclaps. Lightning starts to strike all around you leaving no ground untouched. The gods of fate chose to strike the ground that you occupying, ending your journey early.",
                    			"You immediately rush towards a boulder that looks like it has just enough space below it to hide. You crawl under the boulder seconds before lightning strikes the ground around you. The sounds of lightning deafen you as the boulder gets showered in debris. Suddenly the rock in which your cowering under gets struck by lightning sending the force of the strike right through you. Your journey ends here.",}, //node 
                        {"Your first instincts causes you to rush towards a large rock that is just over half way across the river bed, as you scramble up the rock water starts to flow around you. Slowly rising higher and higher up the rock. The water keeps rising over the top of the rock. The force of the water sweeps your feet from under you causing you to fall into the water below.",
                    		"As the rumble of water starts to sound, you start to sprint for your life. Within seconds a massive surge of water comes rushing at you. It crashes along the river bed like a freight train taking out everything in its path. If only you were a few seconds faster, you would have been able to make it to the other side.",
                    			"You panic, with the sounds of water thundering towards you start running, not to the shore 15 yards ahead, but away from the water in a blind sprint. The water crashes around a bend up stream racing towards you, gaining on you. You have little hope of our running the water as you start to run out of breath. The water catches up to you, taking you with it."}, //node 
                        //blockage
                        {"You attempt to cross the river. As you make you way across, the water starts to deepen and suddenly you need to start to swim. The force of the water becomes too strong stopping your progress across and forcing you down stream. You unfortunetly get swept away.",
                    		"As you attempt to look for another way across, the terrain along the river gets harder and harder to travers forcing you away from the water. You attempt to find the river again but you only get more and more lost. You are never able to find the river or the trail again."}, //node 
                        {"You attempt to cross the rock pile, slowly making your way up. When you are half way up you suddently lose your footing causing you to fall to the path below cutting your journey short.",
                            "You attempt to find another way around the rock pile. After quite a while searching you are able to find a way around the rock pile. You start to look for the trail but after what seems like hours of searching, you have become hopelessly lost and are never able to continue your journey."}, //node 
                        {"As you attempt to climb over the tree, you feel the log start to roll. Before you are able to even think, the tree starts to roll ontop of you, ending your journey here.",
                           	"After takeing a few moments to assess the situation in front of you. You see that you sould be able to crawl under the log. You remove your backpack and carfuly slide under the fallen tree making your way across. When you are about half way across, you suddenly feel the tree shift. With a sudden crash, your journey is cut short.",
                                "You decide the best option is to try and find another way across. You start making your way down the length of the tree looking for its end. Suddenly the ground under you shifts causing you to slide down into the valley below. While you are otherwise ok, you have no hope of finding your way back to the trail."}, //node 
                        {"With the terrifying beast in front of you, your only option its to attempt to reason with it to allow you to pass unharmed. You dig through you bag, finding an apple that you were saving for lunch. Carefully you approach the cow, holding the apple at as far as you can in front of you. You ask the cow, if I give you this apple will you please let me pass Mr. cow? With that said you place the apple in front hoping that the cow will be satisfied. The cow just stares at you blankley. You take that as your chance to pass the cow and you carefully make your way towards it. Just as you start to pass the cow suddenly kicks our ending your journey. That was not enough of a offering to the cow.",
                             "After a few seconds of panic you realize that it is just a cow. You decide to walk around the cow without any second thought. As you start to pass, the cow rears up kicking you. This cuts your journey short.",
                                "After a few seconds of though you realize there is no reasoning with such a terrifying creature. You must sneak past. You quickly drop down you your belly and low crawl towards the cow. Every time it looks in your direction you freeze in fear. When you only a few feet away, the cow decides to wander into the field next to the path to go eat some grass. Unfortunetly, the path that the cow chose to take happens to be right where you are laying. Unable to get out of the way in time, the cow walks right on top of you cuasing your journey to be cut short."}, //node 
                        //event
                        {"After you sucker punch the stranger, he starts to fight back knocking you to the ground. You still don�t know why you decided to punch a random person but it has become your undoing.", 
                            "After you throw your creative insult at the man, he goes into a blinding rage resulting in your untimely demise. The last words you hear, \"That�s what you get for dissing terry!\"" }, //node 
                        {"campfire death1", "campefire death 2"}, //node 
                        {"indian guy death 1", "indian guy death 2"}, //node 
                        {"old man death 1", "old man death 2"}, //node 
                        {"nerrator death 1", "nerrator death 2", "nerrator death 3"}, //node 
                        //site
                        {}, //node 
                        {}, //node 
        };

}
