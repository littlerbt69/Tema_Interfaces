package modelo;

import exceptions.JugueteException;

public class VehiculoPlastico extends JuguetePlastico {
    private int numRuedas;

    public VehiculoPlastico(String nombre, String marca, int numRuedas) throws JugueteException {
        super(nombre, marca, TPlastico.PVC);
        this.setNumRuedas(numRuedas);
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    private void setNumRuedas(int numRuedas) throws JugueteException {
        if (numRuedas < 1) {
            throw new JugueteException("Un juguete con ruedas debe tener alguna rueda");
        }
        this.numRuedas = numRuedas;
    }
    
    @Override
    public String toString() {
        return this.getNombre() + ". Con " + numRuedas + " ruedas";
    }
    
}
