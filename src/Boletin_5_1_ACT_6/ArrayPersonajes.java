package Boletin_5_1_ACT_6;

public class ArrayPersonajes implements ICreableEstadisticas {

    public static final int MAX_PERSONAJES = 100;
    private Personaje[] personajes;

    public ArrayPersonajes() {
        this.personajes = new Personaje[MAX_PERSONAJES];
    }

    @Override
    public double minimo() throws PersonajeException {
        double valorVidaMin = Personaje.MAX_VIDA;
        int contador = 0;

        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] != null) {
                contador++;

                if (valorVidaMin > personajes[i].getVidaActual())
                    valorVidaMin = personajes[i].getVidaActual();
            }
        }

        if (contador == 0) {
            throw new PersonajeException("No existen personajes guardados");
        }

        return valorVidaMin;
    }

    @Override
    public double maximo() throws PersonajeException {
        double valorVidaMax = Personaje.MIN_VIDA;
        int contador = 0;

        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] != null) {
                contador++;

                if (valorVidaMax < personajes[i].getVidaActual()) {
                    valorVidaMax = personajes[i].getVidaActual();
                }
            }
        }

        if (contador == 0) {
            throw new PersonajeException("No existen personajes guardados");
        }

        return valorVidaMax;
    }

    @Override
    public double media() throws PersonajeException {
        double valorVida = 0;
        int contador = 0;

        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] != null) {
                contador++;
                valorVida += personajes[i].getVidaActual();
            }
        }

        if (contador == 0) {
            throw new PersonajeException("No existen personajes guardados");
        }

        return valorVida;
    }
}
