import java.util.ArrayList;
import java.util.List;

public class Scenario {
    String introText;
    String headerText;
    String[] choices;
    String[] deathScenarios;
    int[][] metaData;

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

    public int[][] getMetaData() {
        return metaData;
    }

    public void setMetaData(int[][] metaData) {
        this.metaData = metaData;
    }

    // public static Scenario getDummyScenario() {
    // List<String> optionHeaders = new ArrayList<>();
    // optionHeaders.add("This is a test header");
    // optionHeaders.add("This is a test header");
    // optionHeaders.add("This is a test header");
    // optionHeaders.add("This is a test header");
    // List<Integer> pointers = new ArrayList<>();
    // pointers.add(1);
    // pointers.add(2);
    // pointers.add(3);
    // pointers.add(4);

    // return new Scenario("This is a test intro text", "header text header text
    // header text", optionHeaders,
    // pointers);
    // }

}
