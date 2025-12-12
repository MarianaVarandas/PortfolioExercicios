package Json.arquivo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
    public static void main(String[] args) throws IOException {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter escrita = new FileWriter("Json/arquivo/arquivo.txt");
        escrita.write(gson.toJson("Conteúdo a ser gravado no arquivo."));
        escrita.close();

    }
}
