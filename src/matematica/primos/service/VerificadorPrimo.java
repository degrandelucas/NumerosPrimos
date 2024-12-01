package matematica.primos.service;

import matematica.primos.model.NumerosPrimos;

public class VerificadorPrimo extends NumerosPrimos {

    public VerificadorPrimo(int numero) {
        super(numero);
    }

    @Override
    public void verificarSeEhPrimo(){
        if (verificarPrimalidade()){ //se o return true, nao eh primo
            System.out.println(String.format("O numero %d não é primo.",numero));
        } else
            System.out.println(String.format("O numero %d é primo.",numero));
    }

}
