package Boletin_5_2_ACT_2;

public class Canvas {
    public void dibujaYAnimaFormas(Forma[] formas) {
        for (int i = 0; i < formas.length; i++) {
            if (formas[i] instanceof IDibujable) {
                ((IDibujable) formas[i]).dibujar();
            }

            if (formas[i] instanceof IAnimable) {
                ((IAnimable) formas[i]).animar();
            }
        }
    }
}
