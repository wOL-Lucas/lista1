import java.util.Scanner;

public class Exerc2 { //Calculando a area de um trapezio qualquer
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double baseMaior, baseMenor, altura, area;
        System.out.println("Digite o valor da base maior: ");
        baseMaior = scanner.nextDouble();
        System.out.println("Digite o valor da base menor: ");
        baseMenor = scanner.nextDouble();
        System.out.println("Digite o valor da altura: ");
        altura = scanner.nextDouble();


        area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("A area do trapezio é: " + area);
    }
}
