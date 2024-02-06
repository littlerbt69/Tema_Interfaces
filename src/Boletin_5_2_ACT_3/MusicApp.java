package Boletin_5_2_ACT_3;

public class MusicApp {
    public void starMusic(IMusicPlayer[] players) {
        for (int i = 0; i < players.length; i++) {
            IMusicPlayer player = players[i];

            if (player instanceof IOnlineMusicPlayer) {
                ((IOnlineMusicPlayer) player).stream();
            } else if (player instanceof IOfflineMusicPlayer) {
                ((IOfflineMusicPlayer) player).load();
            }

            player.play();
            player.stop();
        }
    }
}
