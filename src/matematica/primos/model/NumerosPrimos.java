package matematica.primos.model;

import java.util.Scanner;

public class NumerosPrimos {
    protected int numero;

    public NumerosPrimos(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public boolean verificarPrimalidade() {
        if (numero < 2) {
            return false;
        } else {
            double raizDoNumero = Math.sqrt(getNumero()); //metodo do java para calculo da raiz quadrada de numero
            for (int i = 2; i <= raizDoNumero; i++) {
                if (numero % i == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public void listarPrimos() {

    }
}
