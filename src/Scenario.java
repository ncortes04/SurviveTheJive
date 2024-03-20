import java.util.ArrayList;
import java.util.List;

public class Scenario {
    String introText;
    String headerText;
    String[] choices;
    String[] deathScenarios;
    int[][] metaData;
    String survivalText;
    int requiredItem = -1;

    public Scenario(String introText, String headerText, String[] choices, int[][] metaData, String[] deathScenarios,
            int requiredItem, String survivalText) {
        this.introText = introText;
        this.headerText = headerText;
        this.choices = choices;
        this.deathScenarios = deathScenarios;
        this.metaData = metaData;
        this.requiredItem = requiredItem;
    }

    public Scenario(String introText, String headerText, String[] choices, int[][] metaData, String[] deathScenarios) {
        this.introText = introText;
        this.headerText = headerText;
        this.choices = choices;
        this.deathScenarios = deathScenarios;
        this.metaData = metaData;
    }

    public String getHeaderText() {
        return headerText;
    }

    public boolean doesPlayerHaveitem(Player player) {
        if (this.requiredItem == -1) {
            return true;
        }
        return player.resources.getItemByIndex(this.requiredItem);
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public String[] getChoices() {
        return choices;
    }

    public int getChoicesLength() {
        return choices.length;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    public String getOneChoice(int i) {
        return this.choices[i];
    }

    public int getWeight(int i) {
        return metaData[1][i - 1];
    }

    public int getPointer(int i) {
        return metaData[0][i - 1];
    }

    public String getIntroText() {
        return introText;
    }

    public void setIntroText(String introText) {
        this.introText = introText;
    }

    public String[] getDeathScenarios() {
        return deathScenarios;
    }

    public String getDeathScenarios(int i) {
        return deathScenarios[i];
    }

    public String getRandomDeathScenarios() {
        return deathScenarios[(int) (Math.random() * deathScenarios.length)];
    }

    public void setDeathScenarios(String[] deathScenarios) {
        this.deathScenarios = deathScenarios;
    }

    public boolean hasDeathScenarios() {
        return this.deathScenarios.length != 0;
    }

    public int[][] getMetaData() {
        return metaData;
    }

    public void setMetaData(int[][] metaData) {
        this.metaData = metaData;
    }

}
