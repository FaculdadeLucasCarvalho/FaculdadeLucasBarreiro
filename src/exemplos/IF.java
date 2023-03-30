package exemplos;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Informe um numero inteiro: ");
        numero = teclado.nextInt();

        System.out.println("O numero é: " + numero);

        if (numero >= 0) {
            System.out.println("O numero é positivo!");
        } else {
            System.out.println("O numero é negativo!");
        }





    }
}
