package com.example.backend.Models;

import com.google.gson.annotations.SerializedName;

public class Calculadora {
    @SerializedName("operandA")
    private int operandA;
    @SerializedName("operandB")
    private int operandB;
    @SerializedName("result")
    private int result;

    public int getOperandA() {
        return operandA;
    }

    public int getOperandB() {
        return operandB;
    }

    public void setOperandA(int operandA) {
        this.operandA = operandA;
    }

    public void setOperandB(int operandB) {
        this.operandB = operandB;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int Sumar(int operandA, int operandB) {
        int result = operandA + operandB;
        return result;
    }
    public int Restar(int operandA, int operandB) {
        int result = operandA - operandB;
        return result;
    }
}