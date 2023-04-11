package extra;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double altura;
        int sexo;
        double pesoIdeal;

        System.out.println("Informe se voce e homem ou mulher \n" +
                "1 - homem\n" +
                "2 - mulher\n");
        sexo = scan.nextInt();

        switch (sexo) {
            case 1: {
                System.out.println("Informe sua altura: ");
                altura = scan.nextDouble();

                pesoIdeal = ((62.1 * altura) - 44.7);
                System.out.println("o peso ideal e de: " + pesoIdeal + "kg.");
                break;
            }
            case 2: {
                System.out.println("Informe sua altura: ");
                altura = scan.nextDouble();

                pesoIdeal = ((72.7 * altura) - 58);
                System.out.println("o peso ideal e de: " + pesoIdeal + "kg.");
                break;
            }
            default: {
                System.out.println("opcao invalida");
                break;
            }
        }
    }
}
