package oop2.module08.applicationtemplate;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppStarter extends Application { // bleibt immer ziemlich gleich, kreieirt Instanz der Applikation

	@Override
	public void start(Stage primaryStage) throws Exception {
		PresentationModel pm = new PresentationModel(); // instanzieren

		Parent rootPanel = new ApplicationUI(pm); // provide pm in konstruktor app ui

		Scene scene = new Scene(rootPanel);

		primaryStage.titleProperty().bind(pm.applicationTitleProperty());
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
