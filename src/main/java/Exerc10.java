/*Escreva um programa para ler as dimensões de uma cozinha retangular
(comprimento, largura e altura), calcular e escrever a quantidade de caixas de
azulejos para se colocar em todas as suas paredes (considere que não será
descontada a área ocupada por portas e janelas). Cada caixa de azulejos possui 1,5
m2.*/

import java.util.Scanner;
public class Exerc10 {

    static double getComprimento(Scanner scanner){
        try{
            System.out.println("Insira o comprimento da cozinha");
            double comprimento = scanner.nextDouble();
            if(comprimento < 0.0) {
                System.out.println("Insira um valor válido");
                return getComprimento(scanner);
            }
            return comprimento;
        }
        catch(Exception e){
            if(e instanceof java.util.InputMismatchException){
                System.out.println("Insira um valor válido");
                scanner.next();
                return getComprimento(scanner);
            }
            else{
                throw e;
            }
        }
    };
    static double getLargura(Scanner scanner){
        try{
            System.out.println("Insira a largura da cozinha");
            double largura = scanner.nextDouble();
            if(largura < 0.0) {
                System.out.println("Insira um valor válido");
                return getLargura(scanner);
            }
            return largura;
        }
        catch(Exception e){
            if(e instanceof java.util.InputMismatchException){
                System.out.println("Insira um valor válido");
                scanner.next();
                return getLargura(scanner);
            }
            else{
                throw e;
            }
        }
    };
    static double getAltura(Scanner scanner){
        try{
            System.out.println("Insira a altura da cozinha");
            double altura = scanner.nextDouble();
            if(altura < 0.0) {
                System.out.println("Insira um valor válido");
                return getAltura(scanner);
            }
            return altura;
        }
        catch(Exception e){
            if(e instanceof java.util.InputMismatchException){
                System.out.println("Insira um valor válido");
                scanner.next();
                return getAltura(scanner);
            }
            else{
                throw e;
            }
        }
    };

    public static void main(String[]args){
        double altura, areaParedes, areaAzulejos, qtdCaixasAzulejos, areaComprimento, areaLargura;
        Scanner scanner = new Scanner(System.in);

        areaAzulejos = 1.5;
        altura = getAltura(scanner);

        areaComprimento = getComprimento(scanner) * altura;
        areaLargura = getLargura(scanner) * altura;

        areaParedes = (areaComprimento +areaLargura) * 2;
        qtdCaixasAzulejos = areaParedes / areaAzulejos;

        System.out.printf("A quantidade de caixas necessarias para cobrir o seu comodo e %.0f caixas\nSeu comodo tem um total de %.0f metros quadrados\n",qtdCaixasAzulejos,areaParedes);
    };
}
