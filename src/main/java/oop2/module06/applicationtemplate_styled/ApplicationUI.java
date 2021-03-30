package oop2.module06.applicationtemplate_styled;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {
    private Button button;
    private Button button2;

    public ApplicationUI() {
        initializeSelf(); // für css
        initializeControls();
        layoutControls();
    }

    private void initializeSelf() {
        String stylesheet = getClass().getResource("style.css").toExternalForm(); // get css stylesheet
        getStylesheets().add(stylesheet);
    }

    private void initializeControls() {
        button = new Button("Hello World");
        button2 = new Button("Hoi");
    }

    private void layoutControls() {
        getChildren().add(button);
        button.getStyleClass().add("test-button"); // adding new class to button class
//        button.setId("testId");
        button2.setId("yellowbutton");
        button2.getStyleClass().add("test-button"); // adding new class to button class

    }
}
