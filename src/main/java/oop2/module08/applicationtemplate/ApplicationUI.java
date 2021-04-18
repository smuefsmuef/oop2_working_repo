package oop2.module08.applicationtemplate;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {
    private final PresentationModel model;

    private Button button;

    public ApplicationUI(PresentationModel model) { // provide pm in konstruktor
        this.model = model; // --> use PM as parameter and ...
        initializeSelf();
        initializeControls();
        layoutControls();
        setupEventHandlers();
        setupValueChangedListeners();
        setupBindings();
    }

    private void initializeSelf() {
        String stylesheet = getClass().getResource("style.css").toExternalForm();
        getStylesheets().add(stylesheet);
    }

    private void initializeControls() {
        button = new Button();
    }

    private void layoutControls() {
        getChildren().add(button);
    }

    private void setupEventHandlers() {
    }

    private void setupValueChangedListeners() {
    }

    private void setupBindings() {
        button.textProperty().bind(model.greetingProperty()); // --> ...setup bindingts *only* to properties in the pm
    }
}
