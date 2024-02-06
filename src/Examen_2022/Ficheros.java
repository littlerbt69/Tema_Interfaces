package Examen_2022;

import java.time.LocalDate;

public class Ficheros {
    private String nombre;
    private long tamaño;
    private LocalDate fechaCreacion;

    //Constructor
    public Ficheros(String nombre, long tamaño, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.fechaCreacion = fechaCreacion;
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

    public void setTamaño(long tamaño) {
        this.tamaño = tamaño;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void mostrarDatos() throws FicheroException {
        System.out.printf("El nombre del archivo es: \n", getNombre());
        System.out.printf("El tamaño del archivo es: \n", getTamaño());
        System.out.printf("La fecha de creación es: \n", getFechaCreacion());
    }
}
