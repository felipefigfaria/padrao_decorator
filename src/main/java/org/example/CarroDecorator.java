package org.example;

public abstract class CarroDecorator implements Carro{
    protected Carro carroDecorado;

    public CarroDecorator(Carro carroDecorado) {
        this.carroDecorado = carroDecorado;
    }

    public double getCusto() {
        return carroDecorado.getCusto();
    }

    public String getDescricao() {
        return carroDecorado.getDescricao();
    }
}
