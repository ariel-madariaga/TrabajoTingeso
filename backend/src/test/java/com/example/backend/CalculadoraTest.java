package com.example.backend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class CalculadoraTest{
    Int num1 = 5;
    Int num2 = 4;
    Int num3 = 3;
    Int num4 = 2;
    Int resultado1 = 9;
    Int resultado2 = 5;
    Int resultado3 = 1;
    
    Calculadora calculo = new Calculadora();

    @Test
    public int testSuma1(){
        Assertions.asserEquals(resultado1, calculo.Sumar(num1,num2), "Se espera un 9");
    }
    @Test
    public int testSuma2(){
        Assertions.asserEquals(resultado2, calculo.Sumar(num3,num4), "Se espera un 5");
    }
    @Test
    public int testResta1(){
        Assertions.asserEquals(resultado3, calculo.Restar(num2,num1), "Se espera un 1");
    }
    @Test
    public int testResta2(){
        Assertions.asserEquals(resultado3, calculo.Restar(num4,num3), "Se espera un 1");
    }
}