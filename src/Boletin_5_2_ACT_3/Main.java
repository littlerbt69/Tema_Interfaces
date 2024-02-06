package Boletin_5_2_ACT_3;

public class Main {
    public static void main(String[] args) {
        IMusicPlayer[] players = new IMusicPlayer[3];

        players[0] = new Spotify();
        players[1] = new Itunes();
        players[2] = new MP3player();

        MusicApp app = new MusicApp();

        app.starMusic(players);
    }
}
