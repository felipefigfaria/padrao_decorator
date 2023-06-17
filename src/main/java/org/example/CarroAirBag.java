package org.example;

public class CarroAirBag extends CarroDecorator {

        public CarroAirBag(Carro carroDecorado) {
        super(carroDecorado);
    }

        public double getCusto() {
        return carroDecorado.getCusto() + 500.00;
    }

        public String getDescricao() {
        return carroDecorado.getDescricao() + " + Airbag";
    }
}
