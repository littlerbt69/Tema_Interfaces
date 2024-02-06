package Examen_2022;

import java.time.LocalDate;
import java.util.Arrays;

public class FicheroBinario extends Ficheros{

    private Byte[] bytes;

    public FicheroBinario(String nombre, long tamaño, LocalDate fechaCreacion, Byte[] bytes) {
        super(nombre, tamaño, fechaCreacion);
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        return "FicheroBinario{" +
                "bytes=" + Arrays.toString(bytes) + '}';
    }
}
