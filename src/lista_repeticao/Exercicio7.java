package lista_repeticao;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int mercadoriaEstoque;
        double mediaMercadorias;
        double valorTotal = 0;
        double valorMercadoria = 0;

        System.out.println("Informe o numero total de mercadoria no estoque:");
        mercadoriaEstoque = scan.nextInt();
        for (int i = 1; i <= mercadoriaEstoque; i++) {
            System.out.println("Informe o valor da mercadoria:");
            valorMercadoria = scan.nextDouble();

            valorTotal += valorMercadoria;
        }

        mediaMercadorias = valorTotal / mercadoriaEstoque;

        System.out.println("Valor total em estoque: " + valorTotal);
        System.out.println("Media do valor das mercadorias " + mediaMercadorias);


    }
}
