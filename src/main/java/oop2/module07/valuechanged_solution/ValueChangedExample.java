package oop2.module07.valuechanged_solution;

import javafx.geometry.Insets;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ValueChangedExample extends VBox {
	private TextField textField;
	private Slider    slider;

	public ValueChangedExample() {
        initializeSelf();
        initializeControls();
		layoutControls();
		setupEventHandlers();
		setupValueChangedListeners();
	}

    private void initializeSelf(){
        String stylesheet = getClass().getResource("style.css").toExternalForm();
 		getStylesheets().add(stylesheet);
    }

	private void initializeControls() {
		textField = new TextField("0");
		slider    = new Slider(0, 1000, 0);
	}

	private void layoutControls() {
		setPadding(new Insets(10));
		setSpacing(10);
		getChildren().addAll(textField, slider);
	}

    private void setupEventHandlers() {
    }

	private void setupValueChangedListeners() {
		textField.textProperty().addListener(((observable, oldValue, newValue) -> {
			slider.valueProperty().set(Double.parseDouble(newValue));
		}));

		slider.valueProperty().addListener(((observable, oldValue, newValue) -> {
			textField.textProperty().set(String.valueOf(newValue));
		}));
	}



















    //		textField.textProperty().addListener((observable, oldValue, newValue) -> {
    //			try {
    //				slider.setValue(Double.valueOf(newValue));
    //				textField.getStyleClass().remove("invalid");
    //			} catch (NumberFormatException e) {
    //				textField.getStyleClass().add("invalid");
    //			}
    //		});
    //
    //		slider.valueProperty().addListener((observable, oldValue, newValue) -> textField.setText(String.format("%.1f", newValue.floatValue())));


}
