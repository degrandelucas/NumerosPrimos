package matematica.primos.service;

import matematica.primos.model.NumerosPrimos;

public class GeradorPrimo extends NumerosPrimos {

    public GeradorPrimo(int numero) {
        super(numero);
    }

    @Override
    public void gerarProximoPrimo(){
        System.out.println(String.format("O proximo numero primo é %d",listarPrimos()));
    }
}
