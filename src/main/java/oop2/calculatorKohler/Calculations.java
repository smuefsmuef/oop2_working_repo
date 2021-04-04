package oop2.calculatorKohler;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

import java.util.Scanner;
import java.util.function.DoublePredicate;

public class Calculations {

    double first;
    double second;
    double result;
    char operator;


    public void setFirst(double first) {
        this.first = first;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double calculate() {
        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
        }
        return result;
    }


    public void print() {
        System.out.println(result);
    }

    private final DoubleProperty test = new SimpleDoubleProperty(result);

    public double getResult() {
        return test.get();
    }

    public void setResult(double result) {
        this.test.set(result);
    }

    public DoubleProperty resultProperty() {
        return test;
    }
}