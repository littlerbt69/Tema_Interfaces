package Examen_2022;

import java.time.LocalDate;

public class FicheroTextoFormateado extends FicheroTexto implements IAnalizable{
    private String tipoFuente;
    private int tamañoFuente;
    private String color;

    public FicheroTextoFormateado(String nombre, long tamaño, LocalDate fechaCreacion, String[] parrafo, String tipoFuente, int tamañoFuente, String color) {
        super(nombre, tamaño, fechaCreacion, parrafo);
        this.tipoFuente = tipoFuente;
        this.tamañoFuente = tamañoFuente;
        this.color = color;
    }

    public String getTipoFuente() {
        return tipoFuente;
    }

    public void setTipoFuente(String tipoFuente) {
        this.tipoFuente = tipoFuente;
    }

    public int getTamañoFuente() {
        return tamañoFuente;
    }

    public void setTamañoFuente(int tamañoFuente) {
        this.tamañoFuente = tamañoFuente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void analizar() {
        System.out.println("Analizando fichero: " + getNombre());
    }
}
