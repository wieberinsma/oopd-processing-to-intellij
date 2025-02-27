package main.java.lottomachine;

public class Lottomachine {
    void voerTrekkingUit() {
        GlazenBol glazenBol = new GlazenBol();

        glazenBol.verzamelAlleBallen();
        glazenBol.schepBal();

        ScoreBord scoreBord = new ScoreBord();
        scoreBord.printScoreBord();
    }
}
