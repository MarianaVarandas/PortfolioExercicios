package Exceptions.github;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainGithub {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva o username do usuário que quer pesquisar: ");
        var nomeUsuario = input.nextLine();

        try {
            String endereco = ("https://api.github.com/users/" + nomeUsuario.replace(" ", ""));
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            if (response.statusCode() == 404){
                throw new ErroConsultaGitHubException("Usuário não encontrado");
            }

            Gson gson = new Gson();
            UsuarioAPI usuarioAPI = gson.fromJson(json,UsuarioAPI.class);
            Usuario usuario = new Usuario(usuarioAPI);

            System.out.println(usuario);
        }catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }


    }
}
