package Examen_2022;

import java.time.LocalDate;

public abstract class FicheroTexto extends Ficheros implements IConvertible {
    public String[] parrafo;

    public FicheroTexto(String nombre, long tamaño, LocalDate fechaCreacion, String[] parrafo) {
        super(nombre, tamaño, fechaCreacion);
        this.parrafo = parrafo;
    }


    private static long calcularTamañoFichero(String[] parrafo){
        long acumulador = 0;
        for (int i = 0; i < parrafo.length; i++) {
            acumulador += parrafo[i].length();
        }
        return acumulador;
    }

    /**
     * StringBuilder se utiliza para optimizar la concatenación de cadenas en el método convertir(),
     * donde se está construyendo una única cadena de texto a partir de múltiples elementos del array parrafo.
     * @return
     */
    @Override
    public String convertir() {
        StringBuilder acumulador = new StringBuilder();
        for (int i = 0; i < parrafo.length; i++) {
            acumulador.append(parrafo[i]);
        }
        return acumulador.toString();
    }
}