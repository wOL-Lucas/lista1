
/*Faça um programa que lê um valor em reais e calcule o valor equivalente em dólares.
O usuário deve informar, além do valor em reais da compra, o valor da cotação do
dólar. Imprima na tela o valor em dólares.*/

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.Scanner;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class Exerc9 {

    static double pegarValorEmReais(Scanner scanner){
        try {
            double valor = scanner.nextDouble();
            if(valor < 10.00){
                System.out.println("Valor mínimo para conversao é de 10 reais");
                return pegarValorEmReais(scanner);
            }

            return scanner.nextDouble();

        }catch (Exception e) {
            System.out.println("Insira um valor válido");
            return pegarValorEmReais(scanner);
        }
    }

    static double getCotacaoDolar() throws java.net.URISyntaxException, java.io.IOException, java.lang.InterruptedException{
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

        System.out.println(cotacao.getHigh());


        return  5.13;
    }
    public static void main(String[]args) throws URISyntaxException, IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        try {
            double dolarValue = getCotacaoDolar();
        }
        catch (Exception e){
            System.out.println("Erro ao pegar cotação do dolar\n\n"+e);
        }
    }
}
