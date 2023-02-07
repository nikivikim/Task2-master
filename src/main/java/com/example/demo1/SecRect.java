package com.example.demo1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

    public class SecRect extends Shaped {
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

    public SecRect(double xb, double yb) {
        this.xb = xb;
        this.yb = yb;
    }

    public String toString() {
        return "SecRect{xb=" + this.xb + ", yb=" + this.yb + ", weight=" + this.weight + ", color=" + this.color + ", x=" + this.x + ", y=" + this.y + "}";
    }

    public SecRect(double weight, Color color, double x, double y, double xb, double yb) {
        super(weight, color, x, y);
        this.xb = xb;
        this.yb = yb;
    }

    public void draw(GraphicsContext gr) {
        gr.setLineWidth(this.weight);
        gr.setStroke(this.color);
        gr.strokeRect(this.x, this.y, this.xb, this.yb);
        gr.setFill(Color.RED);
        gr.fillRect(this.x, this.y, this.xb, this.yb);
    }
}