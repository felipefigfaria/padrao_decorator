package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarvalorCarroBasico(){
        Carro carro  = new CarroBasico(20000.00);
        assertEquals(20000.00,carro.getCusto());
    }
    @Test
    void deveRetornarvalorCarroBasicoComSeguro(){
        Carro carro  = new CarroSeguro(new CarroBasico(20000.00));
        assertEquals(21000.00,carro.getCusto());
    }

    @Test
    void deveRetornarvalorCarroBasicoComAirbag(){
        Carro carro  = new CarroAirBag(new CarroBasico(20000.00));
        assertEquals(20500.00,carro.getCusto());
    }

    @Test
    void deveRetornarvalorCarroBasicoComSeguroMaisAirbag(){
        Carro carro  = new CarroAirBag(new CarroSeguro(new CarroBasico(20000.00)));
        assertEquals(21500.00,carro.getCusto());
    }

    @Test
    void deveRetornarDescricao(){
        Carro carro  =new CarroBasico(20000.00);
        assertEquals("Carro básico",carro.getDescricao());

    }
    @Test
    void deveRetornarDescricaoComSeguro(){
        Carro carro  = new CarroSeguro(new CarroBasico(20000.00));
        assertEquals("Carro básico + Seguro",carro.getDescricao());

    }
    @Test
    void deveRetornarDescricaoComArCondicionado(){
        Carro carro  = new CarroAirBag(new CarroBasico(20000.00));
        assertEquals("Carro básico + Airbag",carro.getDescricao());

    }

    @Test
    void deveRetornarDescricaoComSeguroMaisAirbag(){
        Carro carro  = new CarroAirBag(new CarroSeguro(new CarroBasico(20000.00)));
        assertEquals("Carro básico + Seguro + Airbag",carro.getDescricao());

    }

}