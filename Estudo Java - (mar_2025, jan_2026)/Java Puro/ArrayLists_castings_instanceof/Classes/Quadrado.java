package ArrayLists_castings_instanceof.Classes;

import ArrayLists_castings_instanceof.Interface.Forma;

public class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calculaArea() {
        double area = this.lado * this.lado;
        return area;
    }
}
