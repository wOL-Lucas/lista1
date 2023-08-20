
/*Faça um programa que lê um valor em reais e calcule o valor equivalente em dólares.
O usuário deve informar, além do valor em reais da compra, o valor da cotação do
dólar. Imprima na tela o valor em dólares.*/

import com.google.gson.Gson;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.io.IOException;

public class Exerc9 {
    static double pegarValorEmReais(Scanner scanner){
        try {
            System.out.println("Insira o valor em reais para conversao");
            double valor = scanner.nextDouble();
            if(valor < 5.00){
                System.out.println("Valor mínimo para conversao é de 5.00 reais");
                return pegarValorEmReais(scanner);
            }

            return valor;

        }catch (Exception e) {
            System.out.println("Insira um valor válido");
            scanner.next();
            return pegarValorEmReais(scanner);
        }
    }

    static Cotation getCotacaoDolar() throws java.net.URISyntaxException, java.io.IOException, java.lang.InterruptedException{
        String apiURL = "https://economia.awesomeapi.com.br/last/USD-BRL";
        HttpRequest getCotacao = HttpRequest.newBuilder()
                .uri(new URI(apiURL))
                .header("accept", "application/json")
                .GET()
                .build();

        Gson gson = new Gson();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = httpClient.send(getCotacao, HttpResponse.BodyHandlers.ofString());
        String formatedBody = "{"+response.body().replace("{", "")
                .replace("}", "")
                .replace("USDBRL", "")
                .replaceFirst("\"", "")
                .replaceFirst("\"", "")
                .replaceFirst(":", "")
                +"}";

        Cotation cotacao = new Cotation();
        cotacao = gson.fromJson(formatedBody, Cotation.class);
        return cotacao;
    }

    public static void main(String[]args) throws URISyntaxException, IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        try {
            Cotation cotacao = getCotacaoDolar();
            double valorDolar = cotacao.getHigh();
            String dataAtualizacao = cotacao.getCreate_date();
            double valorReais = pegarValorEmReais(scanner);

            double valorConvertido = valorReais / valorDolar;
            System.out.printf("Equivalente em dolar: %.2f\nUltima atualizacao do dolar: %s", valorConvertido, dataAtualizacao);

        }
        catch (Exception e){
            System.out.println("Erro ao pegar cotação do dolar\n\n"+e);
        }
        finally {
            scanner.close();
        }
    }
}
