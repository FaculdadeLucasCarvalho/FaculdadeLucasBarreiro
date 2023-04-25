package lista_repeticao.extra;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int produto;
        double preco;
        int contador =0;
        double valorTotal =0;
        String alternativa;

        do {
            System.out.print("Informe a quantidade de produtos que deseja comprar: ");
            produto = scan.nextInt();
            scan.nextLine();

            for (int i = 1; i <= produto; i++) {
                contador++;
                System.out.print("Digite o preço do " + contador + " produto :");
                preco = scan.nextInt();

                valorTotal += preco;
            }

            System.out.println("Você deseja adicionar mais algum produto?\n" +
                    "S - Sim, desejo adicionar um produto." +
                    "\nN - Não, não irei adicionar mais nenhum produto.");

            alternativa = scan.next();

            if (alternativa.equalsIgnoreCase("N")) {
                double mediaValorMercadoria = valorTotal / produto;

                System.out.println("Você comprou " + contador + " produto!");
                System.out.println("Valor total é de: " + valorTotal);
                System.out.println("Média dos produtos comprados foi de: " + mediaValorMercadoria);
                break;
            }
        } while (produto > contador || alternativa.equalsIgnoreCase("S"));
    }
}

