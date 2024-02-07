package Boletin_5_2_ACT_3;

public class Spotify implements IOnlineMusicPlayer, IOfflineMusicPlayer{
    @Override
    public void play() {
        stream();
        System.out.println("Reproduciendo musica en Spotify");
    }

    @Override
    public void stop() {
        System.out.println("Pausando musica en Spotify");
    }

    @Override
    public void load() {
        System.out.println("Cargando musica en Spotify");
    }

    @Override
    public void stream() {
        System.out.println("Stremeando musica en Spotify");
    }

}
