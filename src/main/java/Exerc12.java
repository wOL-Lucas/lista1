/*
Faça um programa que informe a distância em quilômetros de um raio para o observador.

    • O observador deve informar o tempo (em segundos) transcorrido entre ver o
    raio e ouvir o trovão;

    • Assuma que a velocidade do som seja 340 m/s.

 */
import java.util.Scanner;
public class Exerc12 {

    static double getTempoEntreVerOuvir(Scanner scanner){
        try{
            System.out.println("Informe o tempo (*em segundos*) transcorrido entre ver o raio e ouvir o trovao");
            double tempoEntreVerOuvir = scanner.nextDouble();
            if(tempoEntreVerOuvir < 0.00){
                System.out.println("Por favor, digite um valor valido");
                return getTempoEntreVerOuvir(scanner);
            }
            return tempoEntreVerOuvir;
        }
        catch(Exception e) {
            if (e instanceof java.util.InputMismatchException) {
                System.out.println("Por favor, digite um valor valido");
                scanner.next();
                return getTempoEntreVerOuvir(scanner);
            }
            throw e;
        }
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double tempoVerOuvir,velocidadeSom,distanciaEmKm;
        tempoVerOuvir = getTempoEntreVerOuvir(scanner);
        velocidadeSom = 340.00 / 1000.00;

        distanciaEmKm = tempoVerOuvir * velocidadeSom;
        System.out.printf("A distancia em Km entre voce e o raio e de %.3fkm%n",distanciaEmKm);
    }
}
