public class Karma {

    int playerKarma = 10;
    int scenarioKarma = 10;

    public static boolean isBadThing(int playerKarma, int scenarioKarma)
    {
        // this is not completely random but random enough
        return (Math.random() * 550 + Math.pow(playerKarma, 2) / 2) > 600 - scenarioKarma;
    }

}