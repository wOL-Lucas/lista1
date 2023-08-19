import java.util.Scanner;

public class Exerc7 { //Recebendo nome, idade, altura e nacionalidade e imprimindo
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String nome,nacionalidade;
        int idade;
        double altura;

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble();

        System.out.println("Digite sua nacionalidade: ");
        nacionalidade = scanner.next();

        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nNacionalidade: " + nacionalidade);


    }
}
