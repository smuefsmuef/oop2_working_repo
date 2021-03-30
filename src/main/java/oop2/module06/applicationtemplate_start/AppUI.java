package oop2.module06.applicationtemplate_start;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class AppUI extends StackPane { // UI Klasse --> des Grundlayouts (StackPane) . 0. select vbase layout
    private Button button; // alle Control elemente definieren

    public AppUI() { // Konstruktur, 1. declaration of all controls
        initializeControls();
        layoutControls();
    }

    private void initializeControls() { // 2. init of all controls
        button = new Button("Hello Petra!");
    }

    private void layoutControls() { //3. arrange controls
        getChildren().add(button);
    }
}
