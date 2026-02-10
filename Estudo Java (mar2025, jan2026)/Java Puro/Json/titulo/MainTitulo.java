package Json.titulo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainTitulo {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("Se eu fosse você", "2006", "Filme", "60 min");

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(titulo1); // criando uma nova string pra armazenar o objeto em Json

        System.out.println(json);

    }
}
