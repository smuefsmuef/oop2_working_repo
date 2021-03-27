package oop2.module06.buttonstyling;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StyledButtonApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent rootPanel = new StyledButton();

		Scene scene = new Scene(rootPanel);

		primaryStage.setTitle("JavaFX App");
		primaryStage.setScene(scene);
		primaryStage.setWidth(400);
		primaryStage.setHeight(300);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
