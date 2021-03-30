package oop2.module06.applicationtemplate_styled;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {
    private Button button;

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
    }

    private void layoutControls() {
        getChildren().add(button);
        button.getStyleClass().add("test-button"); // adding new class to button class
//        button.setId("testId");
    }
}
