package exemplos;

import java.util.Scanner;

public class Saudacao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("digite uma mensagem: ");
        String mensagem = teclado.nextLine();
        System.out.println(mensagem);
        teclado.close();


        


    }
}
