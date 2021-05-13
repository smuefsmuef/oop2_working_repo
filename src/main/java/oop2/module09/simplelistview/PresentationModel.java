package oop2.module09.simplelistview;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Dieter Holz
 */
public class PresentationModel {

	private final StringProperty applicationTitle = new SimpleStringProperty("A very simple list");


	// all getters and setters

	public String getApplicationTitle() { // needs a getter
		return applicationTitle.get();
	}

	public StringProperty applicationTitleProperty() {
		return applicationTitle;
	}

	public void setApplicationTitle(String applicationTitle) {
		this.applicationTitle.set(applicationTitle);
	}

}
