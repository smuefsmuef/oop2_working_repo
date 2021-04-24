package oop2.module09.colormemory_solution.views;

import javafx.collections.ListChangeListener;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import oop2.module09.colormemory_solution.presentationmodels.CoolColorMemoryPM;

public class ApplicationUI extends VBox {
    private final CoolColorMemoryPM pm;

    private ColorMixerPane  colorMixer;
    private Button          isCoolButton;
    private ListView<Color> listView;

    public ApplicationUI(CoolColorMemoryPM model) {
        this.pm = model;
        initializeSelf();
        initializeControls();
        layoutControls();
        setupEventHandlers();
        setupValueChangedListeners();
        setupBindings();
    }

    private void initializeSelf() {
        String stylesheet = getClass().getResource("style.css").toExternalForm();
        getStylesheets().add(stylesheet);
    }

    private void initializeControls() {
        colorMixer   = new ColorMixerPane(pm);
        isCoolButton = new Button("This is cool");

        listView = new ListView<>(pm.getCoolColors());
        listView.setCellFactory(param -> new ColorCell());
    }

    private void layoutControls() {
        setPadding(new Insets(10));
        setSpacing(10);

        isCoolButton.setMaxWidth(Double.MAX_VALUE);
        setVgrow(listView, Priority.ALWAYS);

        getChildren().addAll(colorMixer, isCoolButton, listView);
    }

    private void setupEventHandlers() {
        isCoolButton.setOnAction(event -> pm.addColor());
    }

    private void setupValueChangedListeners() {
        pm.getCoolColors().addListener((ListChangeListener<Color>) c -> {
            while (c.next()) {
                listView.scrollTo(c.getFrom());
            }
        });
    }

    private void setupBindings() {
    }
}
