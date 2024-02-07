package Examen_2022;

import java.time.LocalDate;

public class FicheroEjecutable extends Ficheros{
    private Byte[] contenido;
    private int permisos;

    public FicheroEjecutable(String nombre, long tamaño, LocalDate fechaCreacion, Byte[] contenido, int permisos) {
        super(nombre, tamaño, fechaCreacion);
        this.contenido = contenido;
        this.permisos = permisos;
    }
}
