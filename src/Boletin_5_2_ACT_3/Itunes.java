package Boletin_5_2_ACT_3;

public class Itunes implements IOnlineMusicPlayer, IOfflineMusicPlayer{
    @Override
    public void play() {
        load();
        System.out.println("Reproduciendo musica en Itunes");
    }

    @Override
    public void stop() {
        System.out.println("Pausando musica en Itunes");
    }

    @Override
    public void load() {
        System.out.println("Cargando musica en Itunes");
    }

    @Override
    public void stream() {
        System.out.println("Stremeando musica en Itunes");
    }
}
