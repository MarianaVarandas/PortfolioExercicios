package Construtores;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade ) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }


    @Override
    public String toString() {
        return this.getNome() +
                ", preco = " + this.getPreco() +
                ", quantidade = " + this.getQuantidade() + ", data de validade = " + this.dataValidade;
    }
}
