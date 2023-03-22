package exemplos;

import java.util.Scanner;

public class Saudacao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("digite uma mensagem: ");
        String mensagem = teclado.nextLine();
        System.out.println(mensagem);
        teclado.close();


        System.out.println("Media final do aluno:");

        double nota1 = 2;
        double nota2 = 3;
        double nota3 = 5;

       double total = nota1 + nota2 + nota3;
       double Resultado = total / 3;
        System.out.println(Resultado);


    }
}
