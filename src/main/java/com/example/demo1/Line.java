package com.example.demo1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shaped {
    private double xb;
    private double yb;

    public double getXb() {
        return 50.0;
    }

    public void setXb(double xb) {
        this.xb = xb;
    }

    public double getYb() {
        return 150.0;
    }

    public void setYb(double yb) {
        this.yb = yb;
    }

    public Line(double xb, double yb) {
        this.xb = xb;
        this.yb = yb;
    }

    public String toString() {
        return "Line{xb=" + this.xb + ", yb=" + this.yb + ", weight=" + this.weight + ", color=" + this.color + ", x=" + this.x + ", y=" + this.y + "}";
    }

    public Line(double weight, Color color, double x, double y, double xb, double yb) {
        super(weight, color, x, y);
        this.xb = xb;
        this.yb = yb;
    }

    public void draw(GraphicsContext gr) {
        gr.setLineWidth(this.weight);
        gr.setStroke(this.color);
        gr.strokeLine(this.x, this.y, this.xb, this.yb);
    }
}