package AlterandoToString;


import java.util.ArrayList;

public class MainPessoa {
    public static void main(String[] args) {
        var pessoa1 = new Pessoa();
        pessoa1.setNome("Angela");
        pessoa1.setIdade(22);

        var pessoa2 = new Pessoa();
        pessoa2.setNome("Ruan");
        pessoa2.setIdade(55);

        var pessoa3 = new Pessoa();
        pessoa3.setNome("Marilia");
        pessoa3.setIdade(17);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("O tamanho dessa ArrayList é: " + listaDePessoas.size());
        System.out.println("A primeira pessoa da ArrayList é: " + listaDePessoas.get(0));
        System.out.println(listaDePessoas);

    }
}