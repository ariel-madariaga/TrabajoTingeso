package com.example.backend;

import com.example.backend.Models.Calculadora;
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
    public void testSuma1(){
        Assertions.assertEquals(resultado1, calculo.Sumar(num1,num2), "Se espera un 9");
    }
    @Test
    public void testSuma2(){
        Assertions.assertEquals(resultado2, calculo.Sumar(num3,num4), "Se espera un 5");
    }
    @Test
    public void testResta1(){
        Assertions.assertEquals(resultado3, calculo.Restar(num1,num2), "Se espera un 1");
    }
    @Test
    public void testResta2(){
        Assertions.assertEquals(resultado3, calculo.Restar(num3,num4), "Se espera un 1");
    }
}