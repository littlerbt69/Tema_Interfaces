package Boletin_5_1_ACT_1;

public class CuentaCredito extends Cuenta {
    public static final double CREDITO_DEFAULT = 100;
    public static final double CREDITO_MAXIMO = 300;
    private double credito;

    public CuentaCredito(double saldo, double credito) throws CuentaCreditoException {
        super(saldo);
        setCredito(credito);
    }

    public CuentaCredito(double credito) throws CuentaCreditoException{
        setCredito(credito);
    }

    public CuentaCredito() {
        credito = CREDITO_DEFAULT;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) throws CuentaCreditoException {
        if (this.credito > CREDITO_MAXIMO) {
            throw new CuentaCreditoException("El credito no puede superar la cantidad de 300 Euros.");
        }

        if (this.credito < 0) {
            throw new CuentaCreditoException("El credito no puede contener valores negativos.");
        }

        this.credito = this.credito;
    }

    @Override
    public void ingresarDinero(double dineroIngresar) throws CuentaException {

    }

    @Override
    public void sacarDinero(double dineroRetirar) throws CuentaException, CuentaCreditoException {
        if (dineroRetirar > getSaldo() + getCredito()) {
            throw new CuentaCreditoException("Has llegado a tu limite de credito disponible.");
        }

        if (dineroRetirar <= getSaldo()) {
            super.sacarDinero(dineroRetirar);
        } else {
            dineroRetirar -= getSaldo();
            super.sacarDinero(getSaldo());
            this.credito -= dineroRetirar;
        }
    }
}
