import java.util.Scanner;

public class Exerc3 {//lendo o nome do usuario e imprimindo uma saudação
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + ", seja bem vindo!");
    }
}
