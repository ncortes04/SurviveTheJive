import java.util.ArrayList;

public class GameState {
    public ArrayList<Scenario> gameArray;

    public GameState() {
        gameArray = new ArrayList<>(); // initialize the array list
        populateState(); // populate game state upon instance creation
    }

    private void populateState() {
        // loops over all arrays at once and creates a new scenario. it is guaranteed that all arrays are the same length
        for (int i = 0; i < GameValues.introTexts.length; i++) {
            Scenario tempScenario = new Scenario(GameValues.introTexts[i], GameValues.questions[i], GameValues.choices[i], GameValues.metaDataChoices[i], GameValues.deathScenarios[i], GameValues.outcomes[i], i);
            gameArray.add(tempScenario);
        }
    }
}
