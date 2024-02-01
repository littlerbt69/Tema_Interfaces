package Boletin_5_1;

public class Personaje {

    public static final int MAX_FUERZA = 20;
    public static final int MAX_INTELIGENCIA = 20;
    public static final int MAX_VIDA = 100;

    public static final int MIN_FUERZA = 0;
    public static final int MIN_INTELIGENCIA = 0;
    public static final int MIN_VIDA = 0;

    private String nombre;
    private TRaza raza;
    private int fuerza;
    private int inteligencia;
    private int vidaMax;
    private int vidaActual;

    public Personaje(String nombre, TRaza raza, int fuerza, int inteligencia, int vidaMax) throws PersonajeException {
        this.nombre = nombre;
        this.raza = raza;
        setFuerza(fuerza);
        setInteligencia(inteligencia);
        setVidaMax(vidaMax);
        setVidaActual(vidaMax);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza < MIN_FUERZA || fuerza > MAX_FUERZA) {
            throw new PersonajeException("Los valores de fuerza deben estar comprendidos entre 0-20");
        }

        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) throws PersonajeException{
        if (inteligencia < MIN_INTELIGENCIA || inteligencia > MAX_INTELIGENCIA) {
            throw new PersonajeException("Los valores de inteligencia deben estar comprendidos entre 0-20");
        }

        this.inteligencia = inteligencia;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) throws PersonajeException {
        if (vidaMax < MIN_VIDA || vidaMax > MAX_VIDA) {
            throw new PersonajeException("Los valores de vida maxima deben estar comprendidos entre 0-100");
        }

        this.vidaMax = vidaMax;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) throws PersonajeException {
        if (vidaActual < MIN_VIDA || vidaActual > vidaMax) {
            throw new PersonajeException("Los valores de vida actual deben estar comprendidos entre 0-Maximo");
        }

        this.vidaActual = vidaActual;
    }

    @Override
    public String   toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", raza=" + raza +
                ", fuerza=" + fuerza +
                ", inteligencia=" + inteligencia +
                ", vidaMax=" + vidaMax +
                ", vidaActual=" + vidaActual +
                '}';
    }
}
