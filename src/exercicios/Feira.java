package exercicios;

import java.util.Scanner;

public class Feira {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         double precoMaca;
         double quiloMaca;
         double quiloLaranja;
         double precoLaranja;

        System.out.println("Quantos quilos de Maça? ");
        quiloMaca = scan.nextDouble();

        System.out.println("Quantos quilos de Laranja? ");
        quiloLaranja = scan.nextDouble();

        System.out.println("Valor do quilo da Maça? ");
        precoMaca = scan.nextDouble();

        System.out.println("Valor do quilo da laranja? ");
        precoLaranja = scan.nextDouble();

        System.out.println("Quilo da Maça " + quiloMaca );
        System.out.println("Preço da Maça " + precoMaca);
        System.out.println("Quilo da laraja " + quiloLaranja);
        System.out.println("Preço da Laranja " + precoLaranja);

        double totalLaranja = (quiloLaranja * precoLaranja);
        double totalMaca = (quiloMaca * precoMaca);

        System.out.println("Valor gasto na feira: " + (totalMaca + totalLaranja));
    }
}
