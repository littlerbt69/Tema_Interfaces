package Examen_2022;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LocalDate fecha = LocalDate.now();

        Ficheros[] ficheros = {
                new FicheroTextoPlano("FicheroTP1.txt", 30, fecha, new String []{"Contenido fichero texto plano1, hola"}),
                new FicheroTextoPlano("FicheroTP2.txt", 40, fecha, new String []{"Contenido fichero texto plano2, hola"}),
                new FicheroTextoFormateado("FicheroTF1.txt", 50, fecha, new String []{"Contenido fichero texto formateado1, hola"}, "Arial", 12,"Rojo" ),
                new FicheroVideo("FicheroV1.mp4", 20, fecha, new Byte[]{2,2,1}, 50),
                new FicheroAudio("FicheroA1.mp3", 40, fecha, new Byte []{0,4,2}, 20),
                new FicheroImagen("FicheroI1.png", 10, fecha, new Byte []{2,4,2}),
                new FicheroEjecutable("FicheroE1.exe", 70, fecha, new Byte[]{4,6,2})
        };

        int opcion;
        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.println("Mostrar información básica de los ficheros");
                    // Llamar al método correspondiente
                    break;
                case 2:
                    System.out.println("Mostrar contenido de los ficheros de texto");
                    // Llamar al método correspondiente
                    break;
                case 3:
                    System.out.println("Reproducir ficheros de audio y video");
                    // Llamar al método correspondiente
                    break;
                case 4:
                    System.out.println("Analizar ficheros de texto formateado y ejecutables");
                    // Llamar al método correspondiente
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 5.");
                    break;
            }
        } while (opcion != 5);

        for (int i = 0; i < ficheros.length; i++) {
            Ficheros fichero = ficheros[i];
            if (fichero instanceof IAnalizable) {
                // Esto convierte en analizable el fichero, y luego se le ejecuta analizar
                ((IAnalizable) fichero).analizar();
            }
            if (fichero instanceof IConvertible) {
                // Le ponemos un syso porque devuelve un string
                System.out.println(((IConvertible) fichero).convertir());
            }
            if (fichero instanceof IReproducible) {
                ((IReproducible) fichero).reproducir();
            }
            if (fichero instanceof IRepresentable) {
                ((IRepresentable) fichero).representar();
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("Menú de Gestión de Ficheros");
        System.out.println("1. Mostrar información básica de los ficheros");
        System.out.println("2. Mostrar contenido de los ficheros de texto");
        System.out.println("3. Reproducir ficheros de audio y video");
        System.out.println("4. Analizar ficheros de texto formateado y ejecutables");
        System.out.println("5. Salir");
    }
}
