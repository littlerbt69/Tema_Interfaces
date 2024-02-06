package Boletin_5_2_ACT_1;

public class EsportsTournament {

    public void startTournament(IGamer[] gamers) {
        for (int i = 0; i < gamers.length; i++) {
            gamers[i].playGame();
        }
    }
}
