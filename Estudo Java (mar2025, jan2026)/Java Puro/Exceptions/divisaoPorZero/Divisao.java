package Exceptions.divisaoPorZero;

//para me desafiar, optei por fazer o exercício orientado a objetos e não simples como sugerido no enunciado

public class Divisao {
    private int divisor; // apesar da problemática de int/int ser int, opto por manter para forçar o erro a acontecer
    private int dividendo;
    private int resultado;

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    int daOResultado() {
        resultado = dividendo/divisor;
        return resultado;
    }
}
