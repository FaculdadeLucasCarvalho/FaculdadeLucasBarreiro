package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1;
        double nota2;

        System.out.println("Insira sua primeira nota:");
        nota1 = scan.nextDouble();

        System.out.println("Insira sua segunda nota:");
        nota2 = scan.nextDouble();

        double totalnotas = (nota1 + nota2) / 2;

        if (totalnotas >=7) {
            System.out.println("Parabens voce foi aprovado com a media de:" + totalnotas);
        }
        else {
            System.out.println("Voce foi reprovado com a media de:" + totalnotas);

        }



    }
}
