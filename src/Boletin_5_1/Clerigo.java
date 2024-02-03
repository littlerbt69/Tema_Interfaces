package Boletin_5_1;

import java.util.Random;

public class Clerigo extends Personaje implements IRezable {

    public static final int CLERIGO_MIN_FUERZA = 18;
    public static final int CLERIGO_MIN_INTEL = 12;
    public static final int CLERIGO_MAX_INTEL = 16;
    public static final int CLERIGO_PUNTOS_CURACION = 10;

    private String dios;
    public int puntosExtra;


    public Clerigo(String nombre, TRaza raza, int fuerza, int inteligencia, int puntos_vida_max, String dios)
            throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, puntos_vida_max);
        this.dios = dios;
        this.puntosExtra = 0;
    }

    @Override
    public void setFuerza(int fuerza) throws PersonajeException {
        //Personaje.checkValidStat(f, Personaje.MIN_STATS, MAGO_MAX_FUERZA);
        if (fuerza < Clerigo.CLERIGO_MIN_FUERZA) {
            throw new PersonajeException ("La fuerza mínima del clérigo es " + Clerigo.CLERIGO_MIN_FUERZA);
        }
        super.setFuerza(fuerza);
    }

    @Override
    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < Clerigo.CLERIGO_MIN_INTEL) {
            throw new PersonajeException ("La inteligencia mínima del clérigo es " + Clerigo.CLERIGO_MIN_INTEL);
        }
            super.setInteligencia(inteligencia);
    }

    public void curar(Personaje personaje) throws PersonajeException {
        personaje.setVidaActual(personaje.getVidaActual() + Clerigo.CLERIGO_PUNTOS_CURACION + this.puntosExtra);
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + "Clerigo [dios=" + dios + "]";
    }

    @Override
    public void rezar() {
        Random r = new Random();
        this.puntosExtra += r.nextInt(2) + 1;
    }



}