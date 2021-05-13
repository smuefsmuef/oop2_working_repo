package oop2.module11.selectionhandling;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oop2.module11.selectionhandling.presentationmodels.EuropePM;
import oop2.module11.selectionhandling.views.ApplicationUI;

public class AppStarter extends Application {

	@Override
	public void start(Stage primaryStage) {
		EuropePM rootPM = new EuropePM();

		Parent rootPanel = new ApplicationUI(rootPM);

		Scene scene = new Scene(rootPanel);

		primaryStage.titleProperty().bind(rootPM.applicationTitleProperty());
		primaryStage.setScene(scene);

		primaryStage.setResizable(false);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
