package Examen_2022;

import java.time.LocalDate;

public class FicheroImagen extends FicheroBinario{
    private String formato;

    public FicheroImagen(String nombre, long tamaño, LocalDate fechaCreacion, Byte[] bytes) {
        super(nombre, tamaño, fechaCreacion, bytes);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) throws FicheroException {
        if (formato.equalsIgnoreCase("jpg") || formato.equalsIgnoreCase("png")) {
            this.formato = formato.toLowerCase(); // Convierte a minúsculas para uniformidad
        } else {
            throw new FicheroException("Los formatos permitidos son JPG O PNG");
            // Aquí podrías lanzar una excepción o realizar otra acción según tus necesidades.
        }
    }

}
