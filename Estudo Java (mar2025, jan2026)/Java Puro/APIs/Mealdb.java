package APIs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Mealdb {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite em inglês o nome do prato que deseja cozinhar");
        var nomeReceita = input.nextLine();

        String endereco = ("https://www.themealdb.com/api/json/v1/1/search.php?s=" + nomeReceita.replace(" ", "%20")); // transformando possíveis espaços em texto para não dar erro em nomes compostos
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
