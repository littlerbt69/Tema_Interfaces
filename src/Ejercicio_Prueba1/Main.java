package Ejercicio_Prueba1;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de las subclases
        Automovil auto = new Automovil("Toyota", "Corolla");
        Motocicleta moto = new Motocicleta("Honda", "CBR600RR");

        // Llamar métodos de la interfaz Conducible
        auto.acelerar();
        moto.acelerar();

        // Llamar método de la clase base Vehiculo
        auto.mostrarInformacionVehiculo();
        moto.mostrarInformacionVehiculo();
    }
}
