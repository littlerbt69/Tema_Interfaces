package Examen_2022;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ficheros {
    private String nombre;
    private long tamaño;
    private LocalDateTime fechaCreacion;

    //Constructor
    public Ficheros(String nombre, long tamaño) {
        this.nombre = nombre;
        setTamaño(tamaño);
        this.fechaCreacion = LocalDateTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTamaño() {
        return tamaño;
    }

    /**
     *
     * @param tamaño
     * @throws IllegalArgumentException
     */
    private void setTamaño(long tamaño) {
        if (tamaño < 0) {
            throw new IllegalArgumentException("El fichero no puede tener un tamaño negativo");
        }

        this.tamaño = tamaño;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void mostrarDatos() throws FicheroException {
        System.out.printf("El nombre del archivo es: \n", getNombre());
        System.out.printf("El tamaño del archivo es: \n", getTamaño());
        System.out.printf("La fecha de creación es: \n", getFechaCreacion());
    }
}
