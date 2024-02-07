package Boletin_5_2_ACT_2;

public class Main {
    public static void main(String[] args) throws FormaException {
        Forma[] formas = new Forma[4];
        formas[0] = new Rectangulo();
        formas[1] = new Circulo();
        formas[2] = new CirculoMovible();
        formas[3] = new Linea();

        Canvas canvas = new Canvas();

        canvas.dibujaYAnimaFormas(formas);

        for (int i = 0; i < formas.length; i++) {
            if (formas[i] instanceof Rectangulo || formas[i] instanceof Circulo || formas[i] instanceof CirculoMovible) {
                System.out.println("El area de la figura de la clase: " + formas[i].getClass().getSimpleName() + " " + formas[i].calcularArea());
            }
        }
    }
}
