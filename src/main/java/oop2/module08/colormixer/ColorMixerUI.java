package oop2.module08.colormixer;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.shape.Rectangle;
import oop2.module08.applicationtemplate.PresentationModel;

public class ColorMixerUI extends GridPane {

    private final ColorMixerPM pm;

    private Slider redSlider;
    private Slider greenSlider;
    private Slider blueSlider;

    private Label redLabel;
    private Label greenLabel;
    private Label blueLabel;

    private Rectangle display;

    public ColorMixerUI(ColorMixerPM pm) {
        this.pm = pm;
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

        getStyleClass().add("color-mixer");
    }

    private void initializeControls() {
        redSlider   = new Slider(0.0, 255, 0);
        greenSlider = new Slider(0.0, 255, 0);
        blueSlider  = new Slider(0.0, 255, 0);

        redLabel   = new Label();
        greenLabel = new Label();
        blueLabel  = new Label();

        display = new Rectangle();
    }

    private void layoutControls() {
        setPadding(new Insets(10));
        setHgap(10);
        setVgap(10);

        ColumnConstraints sliderColumn = new ColumnConstraints();
        sliderColumn.setHgrow(Priority.ALWAYS);

        ColumnConstraints valueColumn = new ColumnConstraints(30);
        valueColumn.setHalignment(HPos.RIGHT);

        getColumnConstraints().addAll(sliderColumn, valueColumn);

        addRow(0, redSlider,   redLabel);
        addRow(1, greenSlider, greenLabel);
        addRow(2, blueSlider,  blueLabel);

        add(display, 0, 3, 2, 1);

        setPrefHeight(getPrefHeight() + 200);
    }

    private void setupEventHandlers() {
    }

    private void setupValueChangedListeners() {
    }

    private void setupBindings() {
        redSlider.valueProperty().bindBidirectional(pm.redProperty());
        greenSlider.valueProperty().bindBidirectional(pm.greenProperty());
        blueSlider.valueProperty().bindBidirectional(pm.blueProperty());

        redLabel.textProperty().bind(pm.redProperty().asString());
        greenLabel.textProperty().bind(pm.greenProperty().asString());
        blueLabel.textProperty().bind(pm.blueProperty().asString());

        display.fillProperty().bind(pm.colorProperty());


        // damit das Rechteck die richtige Groesse behaelt (das ist ein "advanced topic")
        display.widthProperty().bind(pm.widthProperty()
                                             .subtract(2));
        display.heightProperty().bind(pm.heightProperty()
//                                              .subtract(pm.redsliderProperty().heightProperty())
//                                              .subtract(pm.greensliderProperty().heightProperty())
//                                              .subtract(pm.bluesliderProperty().heightProperty())
                                              .subtract(5));
    }
}
