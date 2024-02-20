package Ejercicio_Prueba1;

public class Automovil extends Vehiculo implements IConducible{

    public Automovil(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("El automovil esta acelerando.");
    }

    @Override
    public void frenar() {
        System.out.println("El automovil esta frenando.");
    }
}
