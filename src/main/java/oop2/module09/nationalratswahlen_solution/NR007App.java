package oop2.module09.nationalratswahlen_solution;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import oop2.module09.nationalratswahlen_solution.presentationmodels.GesamtResultatPM;
import oop2.module09.nationalratswahlen_solution.views.ApplicationUI;

public class NR007App extends Application {

	@Override
	public void start(Stage primaryStage) {
		GesamtResultatPM model = new GesamtResultatPM();

		Parent rootPanel = new ApplicationUI(model);

		Scene scene = new Scene(rootPanel);

		primaryStage.titleProperty().bind(model.applicationTitleProperty());
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
