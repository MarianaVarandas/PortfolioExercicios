/*Crie uma classe Aluno com atributos nome, idade, e um metodo para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o metodo para exibir as informações.*/

package classes.estudo;

public class Aluno {
    String nome;
    int idade;

    void exibeInfo(){
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Idade do Aluno: " + idade);
    }

}
