package com.example.backend.model;

public class Suma {
    public int numero1;
    public int numero2;

    public Suma(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int Sumar(){
        return this.numero1 + this.numero2;
    }
}
