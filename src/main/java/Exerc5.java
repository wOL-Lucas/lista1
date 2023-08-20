import java.util.Scanner;

public class Exerc5 { // Calculando a area de um circulo e imprimindo
    public static void main(String[]args){
        double raio, area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        raio = scanner.nextDouble();
        area = Math.PI * Math.pow(raio,2);
        System.out.printf("A area do circulo é: %.2f%n", area);
    }
}
