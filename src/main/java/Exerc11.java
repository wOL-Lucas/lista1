/*
Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
Sabendo-se que o preço do combustível é de R$ 1,90, escreva um programa para ler:
a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia, o

número de litros de combustível gasto e o valor total (R$) recebido dos passageiros.
Calcular e escrever: a média do consumo em Km/L e o lucro (líquido) do dia.
*/

import java.util.Scanner;
public class Exerc11 {
    static double getKmInicial(Scanner scanner){
        try{
            System.out.println("Insira a kilometragem inicial:");
            double kmInicial = scanner.nextDouble();
            if(kmInicial < 0.00){
                System.out.println("Insira um valor valido");
                return getKmInicial(scanner);
            }
            return kmInicial;
        }
        catch(Exception e){
            if(e instanceof java.util.InputMismatchException){
                System.out.println("insira um valor valido");
                scanner.next();
                return getKmInicial(scanner);
            }
            throw e;
        }
    }
    static double getKmFinal(Scanner scanner){
        try{
            System.out.println("Insira a kilometragem final");
            double kmFinal = scanner.nextDouble();
            if(kmFinal < 0.00){
                System.out.println("Insira um valor valido");
                return getKmFinal(scanner);
            }
            return kmFinal;
        }
        catch(Exception e){
            if(e instanceof java.util.InputMismatchException){
               System.out.println("insira um valor valido");
               scanner.next();
               return getKmInicial(scanner);
            }
            throw e;
        }
    }

    static double getLitrosGastos(Scanner scanner){
        try{
            System.out.println("Insira a quantidade de litros gastos");
            double litrosGastos = scanner.nextDouble();
            if(litrosGastos < 0.00){
                System.out.println("Insira um valor valido");
                return getLitrosGastos(scanner);
            }
            return litrosGastos;
        }
        catch(Exception e){
            if(e instanceof java.util.InputMismatchException){
                System.out.println("Insira um valor valido");
                scanner.next();
                return getLitrosGastos(scanner);
            }
            throw e;
        }
    }

    static double getValorRecebido(Scanner scanner){
        try{
            System.out.println("Insira o valor total recebido durante o dia");
            double totalRecebido = scanner.nextDouble();
            if(totalRecebido < 0.00){
                System.out.println("Insira um valor valido");
                return getValorRecebido(scanner);
            }
            return totalRecebido;
        }
        catch(Exception e){
            if(e instanceof java.util.InputMismatchException){
                System.out.println("insira um valor valido");
                scanner.next();
                return getValorRecebido(scanner);
            }
            throw e;
        }
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double kmInicial,kmFinal,totalRecebido,litrosGastos,mediaConsumo,lucroLiquido,valorGasolina;

        kmInicial = getKmInicial(scanner);
        kmFinal = getKmFinal(scanner);
        totalRecebido = getValorRecebido(scanner);
        litrosGastos = getLitrosGastos(scanner);
        valorGasolina = 1.90;

        mediaConsumo = (kmFinal - kmInicial) / litrosGastos;
        lucroLiquido = (valorGasolina * (kmFinal - kmInicial)) - totalRecebido;
        System.out.printf("A sua media de consumo foi: %.2f km p/ litro\nE seu lucro liquido do dia foi: R$ %.2f",mediaConsumo,lucroLiquido);
    }
}
