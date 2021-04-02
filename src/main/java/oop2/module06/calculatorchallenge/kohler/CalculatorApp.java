package oop2.module06.calculatorchallenge.kohler;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        CalculatorUI kalkui = new CalculatorUI();

        Scene scene = new Scene(kalkui);
        primaryStage.setTitle("Kalkulator");
        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}