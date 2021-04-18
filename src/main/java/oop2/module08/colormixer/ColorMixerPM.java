package oop2.module08.colormixer;

import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.scene.paint.Color;

import java.awt.*;

public class ColorMixerPM {
    private StringProperty applTitle = new SimpleStringProperty("Pe's ColorMixer");

    private IntegerProperty red = new SimpleIntegerProperty(0);
    private IntegerProperty blue = new SimpleIntegerProperty(0);
    private IntegerProperty green = new SimpleIntegerProperty(0);

    private final ObjectProperty<Color> color = new SimpleObjectProperty<>();

    private DoubleProperty height = new SimpleDoubleProperty(250.00);
    private DoubleProperty width = new SimpleDoubleProperty(200.00);



    public ColorMixerPM() {
        // bindings
        color.bind(Bindings.createObjectBinding(() -> Color.rgb(getred(), getgreen(), getblue()),
                red, green, blue));
    }


    public double getWidth() {
        return width.get();
    }

    public DoubleProperty widthProperty() {
        return width;
    }

    public void setWidth(double width) {
        this.width.set(width);
    }

    public double getHeight() {
        return height.get();
    }

    public DoubleProperty heightProperty() {
        return height;
    }

    public void setHeight(double height) {
        this.height.set(height);
    }

    public String getApplTitle() {
        return applTitle.get();
    }

    public StringProperty applTitleProperty() {
        return applTitle;
    }

    public void setApplTitle(String applTitle) {
        this.applTitle.set(applTitle);
    }

    public int getred() {
        return red.get();
    }

    public IntegerProperty redProperty() {
        return red;
    }

    public void setred(int red) {
        this.red.set(red);
    }

    public int getblue() {
        return blue.get();
    }

    public IntegerProperty blueProperty() {
        return blue;
    }

    public void setblue(int blue) {
        this.blue.set(blue);
    }

    public int getgreen() {
        return green.get();
    }

    public IntegerProperty greenProperty() {
        return green;
    }

    public void setgreen(int green) {
        this.green.set(green);
    }

    public Color getColor() {
        return color.get();
    }

    public ObjectProperty<Color> colorProperty() {
        return color;
    }

    public void setColor(Color color) {
        this.color.set(color);
    }
}
