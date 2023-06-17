package org.example;

public class CarroBasico implements Carro {

    public double valor;

    public double getCusto() {
        return this.valor;
    }

    public String getDescricao() {
        return "Carro básico";
    }

    public CarroBasico(double valor){
        this.valor = valor;

    }
}
