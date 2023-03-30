package exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorDeCarrosVendidos = 2500;
        double valorTotalDeVendas;
        double salarioFixo = 2000.00;
        double valorPorCarroVendido;
        double porcentagemDeVendas = 5 / 100;

        System.out.println("Quantos carros você vendeu?");
        valorDeCarrosVendidos = scan.nextInt();

        System.out.println("Qual foi o seu valor total de vendas?");
        valorTotalDeVendas = scan.nextInt();

        System.out.print("Qual valor do seu salário fixo: ");
        salarioFixo = scan.nextDouble();

        System.out.println("Informe a comissão por carro ventido: ");
        double comissaoPorcarro = scan.nextDouble();

         double salario = salarioFixo + (valorDeCarrosVendidos * comissaoPorcarro) + (valorTotalDeVendas * 0.05);

        System.out.println("O salario do funcionario:");





    }
}