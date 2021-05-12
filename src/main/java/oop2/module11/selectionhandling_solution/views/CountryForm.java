package oop2.module11.selectionhandling_solution.views;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.util.converter.NumberStringConverter;
import oop2.module11.selectionhandling_solution.presentationmodels.CountryPM;
import oop2.module11.selectionhandling_solution.presentationmodels.EuropePM;

import java.util.Locale;

public class CountryForm extends GridPane implements ViewMixin {

	private final EuropePM europe;

	private Label     idLabel;
	private Label     idField;
	private Label     nameLabel;
	private TextField nameField;
	private Label     areaLabel;
	private TextField areaField;

	public CountryForm(EuropePM europe) {
		this.europe = europe;
		init();
	}

    @Override
    public void initializeSelf() {
        getStyleClass().add("form");
    }

    @Override
	public void initializeControls() {
		idLabel = new Label("Id");
		idField = new Label();

		nameLabel = new Label("Name");
		nameField = new TextField();

		areaLabel = new Label("Fl\u00e4che in km\u00B2");  //unicode character verwenden
		areaField = new TextField();
	}

	@Override
	public void layoutControls() {
		ColumnConstraints grow = new ColumnConstraints();
		grow.setHgrow(Priority.ALWAYS);
        ColumnConstraints fixed = new ColumnConstraints();
        getColumnConstraints().addAll(fixed, grow);

		addRow(0, idLabel  , idField);
		addRow(1, nameLabel, nameField);
		addRow(2, areaLabel, areaField);
	}

	@Override
	public void setupValueChangedListeners() {
		europe.selectedCountryIdProperty().addListener((observable, oldValue, newValue) -> {
			CountryPM oldSelection = europe.getCountry(oldValue.intValue());
			CountryPM newSelection = europe.getCountry(newValue.intValue());

			if (oldSelection != null) {
				idField.textProperty()  .unbind();
				nameField.textProperty().unbindBidirectional(oldSelection.nameProperty());
				areaField.textProperty().unbindBidirectional(oldSelection.areaProperty());
			}

			if (newSelection != null) {
				idField.textProperty()  .bind             (newSelection.idProperty().asString());
				nameField.textProperty().bindBidirectional(newSelection.nameProperty());
				areaField.textProperty().bindBidirectional(newSelection.areaProperty(), new NumberStringConverter(new Locale("de", "CH")));
			}
		});
	}
}
