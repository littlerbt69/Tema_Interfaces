package Ejercicio_Prueba1;

public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInformacionVehiculo() {
        System.out.println("Marca del vehiculo: " + marca + " , Modelo del vehiculo: " + modelo);
    }
}
