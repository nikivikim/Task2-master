package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    public Canvas canvas;
    public ColorPicker colorpicker;
    public TextField textfield;
    @FXML
    public GraphicsContext gc;
    public TextField tf_fabric;
    @FXML
    private Label welcomeText;
    @FXML
    public Shaped shp;

    public HelloController() {
    }
    public void onDrawClick(MouseEvent mouseEvent) {
        try {
            double x = mouseEvent.getX();
            double y = mouseEvent.getY();
            Color j = (Color)this.colorpicker.getValue();
            double z = Double.parseDouble(this.textfield.getText());
            this.gc.clearRect(0.0, 0.0, this.canvas.getWidth(), this.canvas.getHeight());
            Line retc = new Line(z, j, x, y, 75.0, 400.0);
            retc.draw(this.gc);
        } catch (NumberFormatException var10) {
            System.out.println("Введены неверные данные");
        }
    }
    public Shaped getShape(int i) {
        if (i == 1) {
            return new Line(75.0, 400.0);
        } else {
            return (Shaped)(i == 2 ? new Rect(40.0, 80.0) : new SecRect(50.0, 20.0));
        }
    }
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.gc = this.canvas.getGraphicsContext2D();
    }

    public void drawShape(KeyEvent keyEvent) {
        try {
            this.gc.clearRect(0.0, 0.0, this.canvas.getWidth(), this.canvas.getHeight());
            if (!this.tf_fabric.getText().equals("")) {
                int shape_type = Integer.parseInt(this.tf_fabric.getText());
                this.shp = this.getShape(shape_type);
                this.shp.setColor((Color)this.colorpicker.getValue());
                this.shp.draw(this.gc);
                System.out.println(this.getShape(shape_type));
            }
        } catch (NumberFormatException var3) {
            System.out.println("Введены неверные данные");
        }

    }
}