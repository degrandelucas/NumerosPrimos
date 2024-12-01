package matematica.primos.application;

import matematica.primos.model.NumerosPrimos;
import matematica.primos.service.VerificadorPrimo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Digite o numero que deseja verificar a primalidade: ");
        Scanner leitura = new Scanner(System.in);
        VerificadorPrimo numero = new VerificadorPrimo(leitura.nextInt());
        numero.verificarSeEhPrimo();

    }
}