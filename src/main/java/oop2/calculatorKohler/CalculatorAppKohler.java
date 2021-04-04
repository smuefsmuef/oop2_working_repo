package oop2.calculatorKohler;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oop2.module03.abcd.C;

import java.util.Scanner;

public class CalculatorAppKohler extends Application {


    @Override
    public void start(Stage primaryStage) {
        CalculatorUIKohler kalkui = new CalculatorUIKohler();

        Scene scene = new Scene(kalkui);
        primaryStage.setTitle("Kalkulator");
        primaryStage.setScene(scene);

        primaryStage.show();

    }


    public static void main(String[] args) {

        // atm 1 run,a + b

        Scanner scanner = new Scanner(System.in);
        Calculations calc = new Calculations();


        // ui
        launch(args);


        calc.setFirst(scanner.nextDouble());
        calc.setOperator(scanner.next().charAt(0));
        calc.setSecond(scanner.nextDouble());

        calc.calculate();
        calc.print();

        // until press equal, then break


    }
}