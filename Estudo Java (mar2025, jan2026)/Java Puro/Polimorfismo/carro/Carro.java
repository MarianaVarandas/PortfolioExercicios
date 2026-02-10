// Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
package Polimorfismo.carro;

public class Carro {
    private String nome;
    private double precoAno2005;
    private double precoAno2006;
    private double precoAno2007;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoAno2005() {
        return precoAno2005;
    }

    public void setPrecoAno2005(double precoAno2005) {
        this.precoAno2005 = precoAno2005;
    }

    public double getPrecoAno2006() {
        return precoAno2006;
    }

    public void setPrecoAno2006(double precoAno2006) {
        this.precoAno2006 = precoAno2006;
    }

    public double getPrecoAno2007() {
        return precoAno2007;
    }

    public void setPrecoAno2007(double precoAno2007) {
        this.precoAno2007 = precoAno2007;
    }

    public void maiorPreco(){
        if (precoAno2005 >= precoAno2006 && precoAno2005>=precoAno2007){
            System.out.println("A maior média do modelo " + getNome() + " ocorreu no ano de 2005 e foi de: " + getPrecoAno2005());
        } else if (precoAno2006 >= precoAno2005 && precoAno2006 >= precoAno2007){
            System.out.println("A maior média do modelo " + getNome() + " ocorreu no ano de 2006 e foi de: " + getPrecoAno2006());
        } else{
            System.out.println("A maior média do modelo " + getNome() + " ocorreu no ano de 2007 e foi de: " + getPrecoAno2007());
        }
    }

    public void menorPreco(){ // mas só funciona se não der empate. Se der, ele mostra o valor da primeira instancia que apareceu com o valor menor
        if (precoAno2005 <= precoAno2006 && precoAno2005 <= precoAno2007){
            System.out.println("A menor média do modelo " + getNome() + " ocorreu no ano de 2005 e foi de: " + getPrecoAno2005());
        } else if (precoAno2006 <= precoAno2005 && precoAno2006 <= precoAno2007){
            System.out.println("A menor média do modelo " + getNome() + " ocorreu no ano de 2006 e foi de: " + getPrecoAno2006());
        } else{
            System.out.println("A menor média do modelo " + getNome() + " ocorreu no ano de 2007 e foi de: " + getPrecoAno2007());
        }
    }



}
