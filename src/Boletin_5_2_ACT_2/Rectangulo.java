package Boletin_5_2_ACT_2;

public class Rectangulo extends Forma implements IDibujable{
    private double lado1 = 20, lado2 = 10;

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Rectangulo.");
    }
}
