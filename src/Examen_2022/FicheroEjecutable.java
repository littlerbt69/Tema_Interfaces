package Examen_2022;

import java.time.LocalDate;

public class FicheroEjecutable extends FicheroBinario implements IAnalizable{
    private int permisos;

    public FicheroEjecutable(String nombre, long tamaño, LocalDate fechaCreacion, Byte[] bytes) {
        super(nombre, tamaño, fechaCreacion, bytes);
        this.permisos = permisos;
    }

    @Override
    public void analizar() {
        System.out.println("Analizando fichero: " + getNombre());
    }
}
