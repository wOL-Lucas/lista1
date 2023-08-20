import java.util.Scanner;

public class Exerc1 { //calculando a media de dois valores e imprimindo o resultado
    public static void main(String[] args) {
            double valor1,valor2,media;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o primeiro valor: ");
            valor1 = scanner.nextDouble();
            System.out.println("Otimo. Digite o segundo valor: ");
            valor2 = scanner.nextDouble();

            media = (valor1 + valor2) / 2;
            System.out.println("A media dos valores é: " + media);

        }
}