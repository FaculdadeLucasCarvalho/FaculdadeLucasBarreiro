package exemplos;

import java.util.Scanner;

public class UsandoWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int contador = 0;

        while(contador < 2) {

            System.out.println("Informe o nome do aluno:");
            String nome = scan.nextLine();

            System.out.println("Informe a nota da primeira avaliaçao:");
            double nota1 = scan.nextDouble();

            System.out.println("Informe a nota da segunda avaliaçao:");
            double nota2 = scan.nextDouble();

            double media = (nota1 + nota2) /2;

            System.out.println("O aluno" + nome + " - Media:" + media);
            contador++;
            scan.nextLine();
        }


    }
}
