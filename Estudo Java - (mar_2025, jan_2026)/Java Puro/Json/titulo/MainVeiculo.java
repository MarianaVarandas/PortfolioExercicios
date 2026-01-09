package Json.titulo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Volkswagen", "Gol", 2003,1562);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(veiculo1);
        System.out.println(json);

    }
}
