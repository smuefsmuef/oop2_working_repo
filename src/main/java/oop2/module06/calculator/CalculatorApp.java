package oop2.module06.calculator;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Parent rootPanel = new CalculatorUI();

        Scene scene = new Scene(rootPanel);

        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
