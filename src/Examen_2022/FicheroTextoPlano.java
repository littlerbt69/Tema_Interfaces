package Examen_2022;

import java.time.LocalDate;

public class FicheroTextoPlano extends FicheroTexto implements IRepresentable{
    public FicheroTextoPlano(String nombre, long tamaño, LocalDate fechaCreacion, String[] parrafo) {
        super(nombre, tamaño, fechaCreacion, parrafo);
    }

    @Override
    public void representar() {
        for (int i = 0; i < parrafo.length; i++) {
            System.out.println(parrafo[i]);
        }
    }
}
