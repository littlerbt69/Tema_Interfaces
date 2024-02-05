package Boletin_5_1_ACT_2;

public class Clerigo extends Personaje {

    public static final int CLERIGO_MIN_FUERZA = 18;
    public static final int MIN_INTEL = 12;
    public static final int CLERIGO_MAX_INTEL = 16;
    public static final int CLERIGO_PUNTOS_CURACION = 10;

    private String dios;

    public Clerigo(String nombre, TRaza raza, int fuerza, int inteligencia, int vidaMax, String dios)
            throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, vidaMax);
        this.dios = dios;
    }

    public String getDios() {
        return dios;
    }

    public void curar(Personaje personaje) throws PersonajeException {

        if (this == personaje) {
            throw new PersonajeException("No puedes curarte a ti mismo");
        }

        if (personaje.getVidaActual() == MIN_VIDA) {
            throw new PersonajeException("El personaje al que quieres atacar esta muerto");
        }

        personaje.setVidaActual(personaje.getVidaActual() + Clerigo.CLERIGO_PUNTOS_CURACION);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clerigo{");
        sb.append("dios='").append(dios).append('\'');
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}