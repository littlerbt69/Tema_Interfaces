package Boletin_5_2_ACT_2;

public class Circulo extends Forma implements IDibujable{
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(7, 4);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Circulo.");
    }
}
