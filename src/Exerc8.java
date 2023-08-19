/*Faça um programa que lê o nome de um produto, a quantidade comprada, o valor
unitário e o percentual de desconto a ser aplicado para o pagamento. Imprima na
tela o nome do produto e o valor total da venda.*/

import java.util.Scanner;

public class Exerc8{

    //pega o nome do produto
    static String getNomeProduto(Scanner scanner){
        try {
            System.out.println("Digite o nome do produto: ");
            String nomeProduto = scanner.next();
            return nomeProduto;
        }
        catch (Exception e) {
            System.out.println("Algo deu errado. Verifique o nome do produto e tente novamente.");
            return getNomeProduto(scanner);
        }
    }

    //pega a quantidade de produtos comprados
    static Double getQuantidadeProduto(Scanner scanner){
        try {
            System.out.println("Digite a quantidade comprada: ");
            return scanner.nextDouble();
        }
        catch (Exception e) {
            System.out.println("Algo deu errado. Verifique a quantidade comprada e tente novamente.");
            scanner.next();
            return getQuantidadeProduto(scanner);
        }
    }

    //pega o valor do produto
    static Double getValorUnitario(Scanner scanner){
        try {
            System.out.println("Digite o valor unitario: ");
            return scanner.nextDouble();
        }
        catch (Exception e) {
            System.out.println("Algo deu errado. Verifique o valor unitário e tente novamente.");
            scanner.next();
            return getValorUnitario(scanner);
        }
    }

    //Pega percentual de desconto
    static Double getPercentualDesconto(Scanner scanner){
        try {
            System.out.println("Digite o percentual de desconto: ");
            return scanner.nextDouble();
        }
        catch (Exception e) {
            System.out.println("Algo deu errado. Verifique o percentual de desconto e tente novamente.");
            scanner.next();
            return getPercentualDesconto(scanner);
        }
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double quantidadeComprada, valorUnitario, percentualDesconto, valorTotalVenda;

        String nomeProduto = getNomeProduto(scanner);
        quantidadeComprada = getQuantidadeProduto(scanner);
        valorUnitario = getValorUnitario(scanner);
        percentualDesconto = getPercentualDesconto(scanner);

        valorTotalVenda = (quantidadeComprada * valorUnitario) - ((quantidadeComprada * valorUnitario) * (percentualDesconto / 100));
        System.out.printf("O valor total da venda de %s é: %.2f%nVoce comprou um total de %.0f unidade(s)",nomeProduto, valorTotalVenda, quantidadeComprada);
    }
}