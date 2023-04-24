package lista_repeticao;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalEstoque = 0.0;
        int numMercadorias = 0;

        do {
            System.out.print("Digite o nome da mercadoria: ");
            String nome = sc.next();
            System.out.print("Digite a quantidade em estoque: ");
            int quantidade = sc.nextInt();
            System.out.print("Digite o valor unitário: ");
            double valorUnitario = sc.nextDouble();

            double valorTotal = quantidade * valorUnitario;
            totalEstoque += valorTotal;
            numMercadorias++;

            System.out.print("Deseja informar mais uma mercadoria? (s/n) ");
            String resposta = sc.next();
            if (resposta.equals("n")) {
                break;
            }
        } while (true);

        double mediaValor = totalEstoque / numMercadorias;

        System.out.println("Valor total em estoque: " + totalEstoque);
        System.out.println("Média do valor das mercadorias: " + mediaValor);

    }

}
