package matematica.primos.application;

import matematica.primos.model.NumerosPrimos;
import matematica.primos.service.GeradorPrimo;
import matematica.primos.service.VerificadorPrimo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Digite o numero que deseja verificar a primalidade: ");
        Scanner leitura = new Scanner(System.in);
        int numero = leitura.nextInt();

        VerificadorPrimo verificarPrimo = new VerificadorPrimo(numero);
        verificarPrimo.verificarSeEhPrimo();

        GeradorPrimo geradorPrimo = new GeradorPrimo(numero);
        geradorPrimo.gerarProximoPrimo();

        leitura.close();
    }
}