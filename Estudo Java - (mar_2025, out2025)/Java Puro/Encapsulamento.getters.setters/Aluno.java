//Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.

//Para resolver esse exercício escolhi ousar e usar ArrayList, que é um conceito que ainda não domino mas gostaria de praticar.
import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas; // para não quebrar o encapsulamento precisando que o main faça a soma das notas, insiro uma ArrayList (obs: diferente em java de um array "normal" porque não tem limite de indices) que já vai fazer isso dentro da própria classe

    public Aluno() {
        this.notas = new ArrayList<>(); // Crio um construtor para que assim que uma instância (new.Aluno) for criada, já criar também a lista de notas
    }

    public void adicionarNota(double nota) { // metodo para adicionar notas à lista (porta segura, não quebra o encapsulamento).
        this.notas.add(nota);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Double> getNotas() { // Método getter: uma porta segura para ler a lista de notas.
        return notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double notaDaVez : this.notas) { // passando em cada nota da array e somando
                soma = soma + notaDaVez;
            }
        int totalDeNotas = this.notas.size(); // desconbrindo quantas notas existem na lista

            if (totalDeNotas == 0) { // evitando a fadiga caso não haja nota nenhuma
                return 0.0;
            }

            return soma / totalDeNotas; // retonando a média
        }
    }
