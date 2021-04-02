package oop2.module06.calculatorchallenge.kohler;

import java.util.Scanner;

public class Calculations {

    Scanner reader = new Scanner(System.in);
    double result = 0.0;

    double first = reader.nextDouble();
    double second = reader.nextDouble();

    public void setOperator(char operator) {
        this.operator = operator;
    }

    char operator = reader.next().charAt(0);

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
        } return result;
    }

}

