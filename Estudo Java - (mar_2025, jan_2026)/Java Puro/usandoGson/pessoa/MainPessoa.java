package usandoGson.pessoa;

import com.google.gson.Gson;

public class MainPessoa {
    public static void main(String[] args){
        Gson gson = new Gson();
        String json = "{\"nome\":\"Carolina\",\"idade\":35,\"cidade\":\"Ubatuba\"}";

        Pessoa pessoa1 = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa1);





    }
}
