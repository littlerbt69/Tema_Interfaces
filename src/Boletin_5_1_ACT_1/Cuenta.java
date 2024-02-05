package Boletin_5_1_ACT_1;

import Boletin_5_1_ACT_1.CuentaCreditoException;
import Boletin_5_1_ACT_1.CuentaException;

public class Cuenta {
    public static final double SALDO_DEFAULT = 0;
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta() {
        saldo = SALDO_DEFAULT;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresarDinero(double dineroIngresar) throws CuentaException {
        if (dineroIngresar < 0) {
            throw new CuentaException("La cantidad introducida no puede ser menor a 0.");
        }

        saldo += dineroIngresar;
    }

    public void sacarDinero(double dineroRetirar) throws CuentaException, CuentaCreditoException {
        if (dineroRetirar < 0) {
            throw new CuentaException("La cantidad a retirar no puede ser negativa.");
        }

        if (dineroRetirar > saldo) {
            throw new CuentaException("No tienes fondos suficientes para retirar la cantidad introducida.");
        }

        saldo -= dineroRetirar;
    }


}
