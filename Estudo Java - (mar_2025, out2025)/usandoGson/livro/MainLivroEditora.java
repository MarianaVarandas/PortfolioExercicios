package usandoGson.livro;

import com.google.gson.Gson;

public class MainLivroEditora {
    public static void main(String[] args) {
    Gson gson = new Gson();
    String jsonLivro = """
                {
                    "titulo": "O Senhor dos Anéis",
                    "autor": "J.R.R. Tolkien",
                    "editora": {
                        "nome": "HarperCollins",
                        "cidade": "Londres"
                    }
                }
                """;

    Livro livro1 = gson.fromJson(jsonLivro, Livro.class);
        System.out.println(livro1);



    }
}
