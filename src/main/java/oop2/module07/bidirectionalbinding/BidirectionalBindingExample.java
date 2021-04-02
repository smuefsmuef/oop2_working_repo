package oop2.module07.bidirectionalbinding;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class BidirectionalBindingExample extends VBox {
	private Slider s1;
	private Slider s2;

	private TextField t1;
	private TextField t2;

	private Label label;


	public BidirectionalBindingExample() {
	    initializeSelf();
		initializeControls();
		layoutControls();
        setupEventHandlers();
        setupValueChangedListeners();
        setupBindings();
	}

    private void initializeSelf(){
        String stylesheet = getClass().getResource("style.css").toExternalForm();
 		getStylesheets().add(stylesheet);
    }

	private void initializeControls() {
		s1 = new Slider();
		s2 = new Slider();

		t1 = new TextField();
		t2 = new TextField();

		label = new Label();
	}

	private void layoutControls() {
		setPadding(new Insets(10));
		setSpacing(5);
		getChildren().addAll(s1, s2, t1, t2, label);
	}

    private void setupValueChangedListeners() {
    }

    private void setupEventHandlers() {
    }


	private void setupBindings(){

	}
}
