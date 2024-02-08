package Examen_2022;

import java.time.LocalDate;

public class FicheroAudio extends FicheroBinario implements IReproducible{
    private int duracion_segundos;

    public FicheroAudio(String nombre, long tamaño, LocalDate fechaCreacion, Byte[] bytes, int duracion_segundos) {
        super(nombre, tamaño, fechaCreacion, bytes);
        this.duracion_segundos = duracion_segundos;
    }

    public int getDuracion_segundos() {
        return duracion_segundos;
    }

    public void setDuracion_segundos(int duracion_segundos) throws FicheroException {
        if (duracion_segundos < 0) {
            throw new FicheroException("La duracion de los ficheros de video no puede ser menor a 0");
        }
        this.duracion_segundos = duracion_segundos;
    }


    @Override
    public void reproducir() {
        System.out.println("Reproduciendo fichero: " + getNombre());
    }
}
