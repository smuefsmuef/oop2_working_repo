package oop2.module08.applicationtemplate;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

	// enthält alle properties, z.B integerProperties, StringProperties. Namen aller Buttons, Titel etc
	private final StringProperty applicationTitle = new SimpleStringProperty("JavaFX Application");
	private final StringProperty greeting         = new SimpleStringProperty("Hello World!");

	public PresentationModel() {
		// create Bindings for greeting in Konstruktor, f.e. as bidirectional binding:
		// greetingProperty(bind(applicationTitleProperty().concat(",").concat(applicationTitleProperty()));
		// or create Bindings for applicationTitle in Konstruktor
	}

	// enthält alle benötigten getter/setters
	public String getApplicationTitle() {
		return applicationTitle.get();
	}

	public StringProperty applicationTitleProperty() {
		return applicationTitle;
	}

	public void setApplicationTitle(String applicationTitle) {
		this.applicationTitle.set(applicationTitle);
	}

	public String getGreeting() {
		return greeting.get();
	}

	public StringProperty greetingProperty() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting.set(greeting);
	}
}
