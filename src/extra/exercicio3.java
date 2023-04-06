package extra;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ano;

        System.out.println("Digite o ano para saber se e bixssexto:");
        ano = scan.nextInt();

        if(ano % 4 == 0 ){
            System.out.println("e um ano bissexto:");
        }
        else{
            System.out.println("Nao e um ano bissexto.");
        }
    }
}
