package oop2.module06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) { // main app window
        Button button = new Button("Hello World"); // button erstellen, aber noch nirgends abgelegt

        StackPane rootPane = new StackPane(); // neuer stackpane
        rootPane.getChildren().add(button); // hier hängen wir nun den button der stack pane als chuld an

        Scene myScene = new Scene(rootPane); // erstellen sceneobjekt und übergeben root objekt als layout element

        //scenegraphen übergeben ..
        primaryStage.setTitle("JavaFX App");
        primaryStage.setScene(myScene);
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.show();
    }

    public static void main(String[] args) { // main method
        launch(args);
    }
}
