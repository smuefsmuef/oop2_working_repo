package oop2.module11.selectionhandling_solution.views;

import javafx.scene.layout.BorderPane;
import oop2.module11.selectionhandling_solution.presentationmodels.EuropePM;

public class ApplicationUI extends BorderPane implements ViewMixin {
	private final EuropePM model;

	private CountryHeader countryHeader;
	private CountryForm   countryForm;
	private SelectorBar   toolbar;

	public ApplicationUI(EuropePM model) {
		this.model = model;
		init();
	}

    @Override
    public void initializeSelf() {
        addStylesheetFiles("style.css");
    }

	@Override
	public void initializeControls() {
		countryHeader = new CountryHeader(model);
		countryForm   = new CountryForm(model);
		toolbar       = new SelectorBar(model);
	}

	@Override
	public void layoutControls() {
		setTop(toolbar);
		setCenter(countryHeader);
		setBottom(countryForm);
	}

}
