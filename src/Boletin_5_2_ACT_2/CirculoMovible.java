package Boletin_5_2_ACT_2;

public class CirculoMovible extends Forma implements IDibujable, IAnimable {
    @Override
    public void animar() {
        System.out.println("Animando Circulo Movible.");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Circulo Movible.");
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(5, 2);
    }
}
