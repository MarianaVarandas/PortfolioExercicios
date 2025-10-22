package estudandoClasses;
/*Crie uma classe Pessoa com um metodo que exibe "Olá, mundo!" no console.*/

public class Pessoa {
    String nome;
    int idade;
    String genero;

    void exibeOlaMundo(){

        System.out.println(String.format("""
                            Olá, Mundo!
                            meu nome é %s, tenho %d anos e sou do gênero %s
                            """, nome, idade,genero));
    }
}
