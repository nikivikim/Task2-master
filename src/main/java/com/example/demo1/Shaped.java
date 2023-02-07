package com.example.demo1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shaped {
    protected double weight;
    protected Color color;
    protected double x;
    protected double y;

    public Shaped(double weight, Color color, double x, double y) {
        this.weight = weight;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Shaped() {
        this.weight = 2.0;
        this.color = Color.BLUE;
        this.x = 50.0;
        this.y = 150.0;
    }


    public abstract void draw(GraphicsContext var1);

    public void setColor(Color color) {
        this.color = color;
    }
}
