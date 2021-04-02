package oop2.module06.calculatorchallenge.kohler;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static java.lang.Math.random;
import static java.time.format.DateTimeFormatter.ISO_DATE;

public class CalculatorUI extends GridPane {

    private ArrayList<Button> numberButtons = new ArrayList<>();

    private Button dot;

    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;

    private Button plusminus;

    private Button equal;
    private Button ac;
    private Button today;

    private Label display;

//    private Rectangle colors = createRectangle();


    public CalculatorUI() {
        initializeSelf();
        initializeControls();
        layoutControls();
        setupEventHandlers(); // neww
    }


    private void initializeSelf() {
        String stylesheet = getClass().getResource("style.css").toExternalForm();
        getStylesheets().add(stylesheet);
    }

    private void initializeControls() {
        for (int i = 0; i < 10; i++) {
            Button b = createButton(String.valueOf(i));
            b.getStyleClass().add("button--number");
            numberButtons.add(b);
        }

        dot = createButton(".");
        plus = createButton("+");
        minus = createButton("-");
        multiply = createButton("*");
        divide = createButton("/");

        plusminus = createButton("±");
        equal = createButton("=");
        ac = createButton("C");
//        today = createButton(getToday());

        display = new Label("0");
        display.setMaxWidth(Double.MAX_VALUE);
    }

//    private String getToday() {
//
//        return (java.time.LocalTime.now()).toString() ;
//    }

    private Rectangle createRectangle() {
        Rectangle rectangle =  new Rectangle(200, 300);
        rectangle.getStyleClass().add("rectangle");
        return rectangle;
    }

    private Button createButton(String text) {
        Button button = new Button(text);
        button.setMaxWidth(Double.MAX_VALUE);
        button.setMaxHeight(Double.MAX_VALUE);
        button.setPrefSize(48,48);

        return button;
    }

    private void layoutControls() {
        setHgap(5);
        setVgap(5);
        setPadding(new Insets(150, 5, 150,5));

        ColumnConstraints cc = new ColumnConstraints();
        cc.setHgrow(Priority.ALWAYS);
        getColumnConstraints().addAll(cc, cc, cc, cc);

        RowConstraints rc = new RowConstraints();
        rc.setVgrow(Priority.ALWAYS);
        getRowConstraints().addAll(new RowConstraints(), rc, rc, rc, rc, rc);

        add(display, 0, 0, 4, 1);

        add(ac, 0, 1);
        add(plusminus, 1, 1);
        add(divide, 2, 1);
        add(multiply, 3, 1);

        add(numberButtons.get(7), 0, 2);
        add(numberButtons.get(8), 1, 2);
        add(numberButtons.get(9), 2, 2);
        add(minus, 3, 2, 1, 2);

        add(numberButtons.get(4), 0, 3);
        add(numberButtons.get(5), 1, 3);
        add(numberButtons.get(6), 2, 3);
        add(plus, 3, 4, 1,2);

        add(numberButtons.get(1), 0, 4);
        add(numberButtons.get(2), 1, 4);
        add(numberButtons.get(3), 2, 4);

        add(numberButtons.get(0), 0, 5, 2, 1);
        add(dot, 2, 5);

        add(equal, 0, 7, 5, 1);

    }

    private void setupEventHandlers() {
    }

}