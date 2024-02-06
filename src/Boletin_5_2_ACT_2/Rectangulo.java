package Boletin_5_2_ACT_2;

public class Rectangulo extends Forma implements IDibujable{
    @Override
    public double calcularArea() {
        return 20 * 10;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Rectangulo.");
    }
}
