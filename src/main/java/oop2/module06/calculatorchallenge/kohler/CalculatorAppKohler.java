package oop2.module06.calculatorchallenge.kohler;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
        launch(args);
    }
}