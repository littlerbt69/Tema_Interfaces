package Boletin_5_2_ACT_3;

public class MP3player implements IOnlineMusicPlayer, IOfflineMusicPlayer{
    @Override
    public void play() {
        load();
        System.out.println("Reproduciendo musica en MP3player");
    }

    @Override
    public void stop() {
        System.out.println("Pausando musica en MP3player");
    }

    @Override
    public void load() {
        System.out.println("Cargando musica en MP3player");
    }

    @Override
    public void stream() {
        System.out.println("Stremeando musica en MP3player");
    }
}
