package com.example.backend;

import Calculadora from './main/java/com/example/backend/Models/Calculadora.java'
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class CalculadoraTest{
    int num1 = 5;
    int num2 = 4;
    int num3 = 3;
    int num4 = 2;
    int resultado1 = 9;
    int resultado2 = 5;
    int resultado3 = 1;
    
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