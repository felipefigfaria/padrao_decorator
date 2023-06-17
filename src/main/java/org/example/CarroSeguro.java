package org.example;

public class CarroSeguro extends CarroDecorator {

    public CarroSeguro(Carro carroDecorado) {
        super(carroDecorado);
    }

    public double getCusto() {
        return carroDecorado.getCusto() + 1000.00;
    }

    public String getDescricao() {
        return carroDecorado.getDescricao() + " + Seguro";
    }
}
