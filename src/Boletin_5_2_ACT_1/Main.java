package Boletin_5_2_ACT_1;

public class Main {
    public static void main(String[] args) {
        IGamer player1 = new FPSGamer();
        IGamer player2 = new MOBAGamer();
        IGamer player3 = new SPORTSGamer();

        EsportsTournament tournament = new EsportsTournament();

        tournament.startTournament(new IGamer[]{player1, player2, player3});
    }
}
