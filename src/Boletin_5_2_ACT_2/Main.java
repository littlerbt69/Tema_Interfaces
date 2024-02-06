package Boletin_5_2_ACT_2;

public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[4];
        formas[0] = new Rectangulo();
        formas[1] = new Circulo();

        Canvas canvas = new Canvas();

        canvas.dibujaYAnimaFormas(formas);

        for (int i = 0; i < formas.length; i++) {
            if (formas[i] instanceof Rectangulo || formas[i] instanceof Circulo) {
                System.out.println("El area de la forma: " + formas[i].calcularArea());
            }
        }
    }
}
