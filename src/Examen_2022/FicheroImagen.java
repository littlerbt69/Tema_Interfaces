package Examen_2022;

import java.time.LocalDate;

public class FicheroImagen extends Ficheros{
    private String formato;
    private Byte[] contenido;

    public FicheroImagen(String nombre, long tamaño, LocalDate fechaCreacion, String formato, Byte[] contenido) {
        super(nombre, tamaño, fechaCreacion);
        this.formato = formato;
        this.contenido = contenido;
    }
}
