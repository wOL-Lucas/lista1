import java.util.Scanner;
public class Exerc4 { //calculando o valor da conta de luz de uma pessoa, onde o Kilowatt custa R$0.55
    public static void main(String[]args){
        double kilowatt = 0.55;
        double consumo,valorconta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de Kilowatts consumidos: ");
        consumo = scanner.nextDouble();
        valorconta = consumo * kilowatt;
        System.out.printf("O valor da conta é: %.2f%n", valorconta);
    }
}
