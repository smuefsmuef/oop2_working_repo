package oop2.module11.stableselection_solution.presentationmodels;

import javafx.beans.property.*;

public class CountryPM {
	private final IntegerProperty id   = new SimpleIntegerProperty();
	private final StringProperty  name = new SimpleStringProperty();
	private final DoubleProperty  area = new SimpleDoubleProperty();

	public CountryPM() {
	}

	public CountryPM(int id, String name, double area) {
		setId(id);
		setName(name);
		setArea(area);
	}

	@Override
	public String toString() {
		return getName();
	}

	public int getId() {
		return id.get();
	}

	public IntegerProperty idProperty() {
		return id;
	}

	public void setId(int id) {
		this.id.set(id);
	}

	public String getName() {
		return name.get();
	}

	public StringProperty nameProperty() {
		return name;
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public double getArea() {
		return area.get();
	}

	public DoubleProperty areaProperty() {
		return area;
	}

	public void setArea(double area) {
		this.area.set(area);
	}
}
