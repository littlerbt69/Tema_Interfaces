package Boletin_5_1_ACT_6;

import java.util.Arrays;

public class Mago extends Personaje {

    public static final int MAX_HECHIZOS = 4;
    public static final int MIN_INTELIGENCIA = 17;
    public static final int MAX_FUERZA = 15;
    public static final int DAÑO_HECHIZO = 10;

    private String[] hechizos;

    public Mago(String nombre, TRaza raza, int fuerza, int inteligencia, int vidaMax) throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, vidaMax);
        hechizos = new String[MAX_HECHIZOS];
    }

    @Override
    public void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza > MAX_FUERZA) {
            throw new PersonajeException("Valor de fuerza no permitido para personaje mago");
        }

        super.setFuerza(fuerza);
    }

    @Override
    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < MIN_INTELIGENCIA) {
            throw new PersonajeException("Valor de inteligencia no permitido para personaje mago");
        }

        super.setInteligencia(inteligencia);
    }

    public void aprendeHechizo(String hechizo) throws PersonajeException {
        boolean encontrado = false;
        int posicionVacia = -1;

        for (int i = 0; i < hechizos.length && !encontrado; i++) {
            if (hechizo.equals(hechizos[i])) {
                encontrado = true;
            }

            if (hechizos[i] == null && posicionVacia == -1) {
                posicionVacia = i;
            }
        }

        if (encontrado) {
            throw new PersonajeException("El mago no puede aprender dos veces el mismo hechizo.");
        }

        if (posicionVacia == -1) {
            throw new PersonajeException("El mago no tiene mas slots para aprender un hechizo nuevo.");
        }

        hechizos[posicionVacia] = hechizo;
    }

    public void lanzaHechizo(Personaje personaje, String hechizo) throws PersonajeException {
        int posicionHechizo = -1;

        for (int i = 0; i < hechizos.length && posicionHechizo == -1; i++) {
            if (hechizo.equals(hechizos[i])) {
                posicionHechizo = i;
            }

            if (posicionHechizo == -1) {
                throw new PersonajeException("El mago no conoce el hechizo");
            }

            if (this == personaje) {
                throw new PersonajeException("No puedes lanzar un hechizo a tu mismo personaje");
            }

            if (personaje.getVidaActual() == MIN_VIDA) {
                throw new PersonajeException("El personaje al que quieres atacar esta muerto");
            }

            personaje.setVidaActual(personaje.getVidaActual() - DAÑO_HECHIZO);

            hechizos[posicionHechizo] = null;

        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mago{");
        sb.append("hechizos=").append(Arrays.toString(hechizos));
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
