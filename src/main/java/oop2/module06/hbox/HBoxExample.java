package oop2.module06.hbox;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class HBoxExample extends HBox {
	private Button button1;
	private Button button2;
	private Button button3;

	public HBoxExample() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		button1 = new Button("first");
		button2 = new Button("second");
		button3 = new Button("third");
	}

	private void layoutControls() {
        setPadding(new Insets(10, 10, 10, 10));
        setSpacing(5);

		getChildren().addAll(button1, button2, button3);
	}
}