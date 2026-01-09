package ArrayLists_castings_instanceof.Classes;

import ArrayLists_castings_instanceof.Interface.Forma;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calculaArea() {
        double area = (this.raio * this.raio) * Math.PI;
        return area;
    }

    }
