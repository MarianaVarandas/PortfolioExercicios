package APIs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva o nome da criptomoeda: ");
        var nomeCripto = input.nextLine();

        String endereco = ("https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd&ids="+ nomeCripto+ "&x_cg_demo_api_key=CG-ASy5NJLhDRictBgybHp4yLMu");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


    }
}
