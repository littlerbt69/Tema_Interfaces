package Ejercicio_Prueba1;

public class Motocicleta extends Vehiculo implements IConducible{

    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("La motocicleta esta acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("La motocicleta esta frenando.");
    }
}
