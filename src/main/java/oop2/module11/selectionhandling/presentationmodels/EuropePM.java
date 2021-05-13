package oop2.module11.selectionhandling.presentationmodels;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class EuropePM {
    private final StringProperty applicationTitle = new SimpleStringProperty("Selection Handling");

    private final ObservableList<CountryPM> allCountries = FXCollections.observableArrayList();

    public EuropePM() {
        allCountries.addAll(createCountryList());
    }

    private List<CountryPM> createCountryList() {
        return List.of(new CountryPM(0, "Schweiz",      41_285.00),
                       new CountryPM(1, "Deutschland", 357_121.41),
                       new CountryPM(2, "Frankreich",  668_763.00),
                       new CountryPM(3, "Italien",     301_338.00),
                       new CountryPM(4, "Oesterreich",  83_878.99));
    }

    public CountryPM getCountry(int id) {
        return allCountries.stream()
                           .filter(countryPM -> countryPM.getId() == id)
                           .findAny()
                           .orElse(null);
    }

    // alle getter und setter
    public ObservableList<CountryPM> getAllCountries() {
        return allCountries;
    }

    public String getApplicationTitle() {
        return applicationTitle.get();
    }

    public StringProperty applicationTitleProperty() {
        return applicationTitle;
    }

    public void setApplicationTitle(String applicationTitle) {
        this.applicationTitle.set(applicationTitle);
    }

}
