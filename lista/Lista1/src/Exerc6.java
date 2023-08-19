import java.util.Scanner;

/*Escreva um programa para calcular e imprimir o número de lâmpadas necessárias
para iluminar um determinado cômodo de uma residência. Dados de entrada: a
potência da lâmpada utilizada (em watts), as dimensões (largura e comprimento, em
metros) do cômodo. Considere que a potência necessária é de 18 watts por metro
quadrado.*/

public class Exerc6 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        double potencia, largura, comprimento, area, potenciaNecessaria, numeroLampadas;
        potenciaNecessaria = 18;

        System.out.println("Digite a largura do comodo: ");
        largura = scanner.nextDouble();

        System.out.println("Digite o comprimento da lampada: ");
        comprimento = scanner.nextDouble();
        area = largura * comprimento;

        System.out.println("Digite a potencia da lampada: ");
        potencia = scanner.nextDouble();

        numeroLampadas = (area * potenciaNecessaria) / potencia;
        System.out.printf("O numero de lampadas necessarias é: %.2f%n",numeroLampadas);
    }
}
