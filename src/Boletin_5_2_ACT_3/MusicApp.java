package Boletin_5_2_ACT_3;

public class MusicApp {
    public void starMusic(IMusicPlayer[] players) {
        for (int i = 0; i < players.length; i++) {
            IMusicPlayer player = players[i];

            player.play();
            player.stop();
        }
    }
}
