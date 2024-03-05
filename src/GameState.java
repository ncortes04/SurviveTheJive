import java.util.ArrayList;

public class GameState {
    public ArrayList<Scenario> gameArray; // Instance variable

    public GameState(){
        gameArray = new ArrayList<>(); // Initialize the array list
        populateState(); // Populate game state upon instance creation
    }

    private void populateState(){ // Now a non-static method
        for(int i = 0; i < GameValues.introTexts.length; i++){
            Scenario tempScenario = new Scenario(GameValues.introTexts[i], GameValues.questions[i], GameValues.choices[i], GameValues.metaDataChoices[i]);
            gameArray.add(tempScenario);
        }
    }
}
