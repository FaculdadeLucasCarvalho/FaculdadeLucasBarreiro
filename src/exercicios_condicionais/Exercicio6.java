package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        String time1;
        String time2;

        System.out.println("Insira o nome do primerio time");
        time1 = scan.nextLine();

        System.out.println("Insira o nome do segundo time:");
        time2 = scan.nextLine();

        System.out.println("Quantos gols o time 1 fez");
        int golstime1 = scan.nextInt();

        System.out.println("Quantos gols o time 2 fez");
        int golstime2 = scan.nextInt();

        if (golstime1 > golstime2) {
            System.out.println("Time 1 ganhou!");

        }
        if(golstime2 > golstime1) {
            System.out.println("Time 2 ganhou!");
        }
        else {
            System.out.println("Empate!");
        }

    }
}
