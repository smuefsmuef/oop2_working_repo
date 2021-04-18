package oop2.module08.colormixer;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oop2.module08.applicationtemplate.ApplicationUI;
import oop2.module08.applicationtemplate.PresentationModel;

public class ColorMixerApp extends Application {

	@Override
	public void start(Stage primaryStage) {

		ColorMixerPM pm = new ColorMixerPM(); // instanzieren
		Parent rootPanel = new ColorMixerUI(pm); // provide pm in konstruktor app ui


		Scene scene = new Scene(rootPanel);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Mix It!");

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
