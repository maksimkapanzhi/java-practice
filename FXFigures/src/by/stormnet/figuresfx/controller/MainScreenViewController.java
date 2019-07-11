package by.stormnet.figuresfx.controller;

import by.stormnet.figuresfx.FigureException;
import by.stormnet.figuresfx.drawutils.Drawer;
import by.stormnet.figuresfx.figures.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;


import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class MainScreenViewController implements Initializable {
    private Random random;
    private ArrayList<Figure> figures;

    @FXML
    private Canvas canvas;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("MainScreenViewController!");
        figures = new ArrayList();
        random = new Random(System.currentTimeMillis());
    }

    private void addFigure(Figure figure) {
        figures.add(figure);
    }

    private Figure createFigure(double x, double y) throws FigureException {
        Figure figure = null;

        switch (random.nextInt(4)) {

            case Figure.FIGURES_TYPE_CIRCLE:
                figure = new Circle(x, y, random.nextInt(10), Color.GREEN, random.nextInt(50));
                break;
            case Figure.FIGURES_TYPE_RECTANGLE:
                figure = new Rectangle(x, y, random.nextInt(10), Color.BLUE, random.nextInt(50), random.nextInt(50));
                break;
            case Figure.FIGURES_TYPE_TRIANGLE:
                figure = new Triangle(x, y, random.nextInt(5), Color.ORANGE, random.nextInt(20));
                break;
            case Figure.FIGURES_TYPE_MYFIGURE:
                figure = new MyFigure(x, y, random.nextInt(20), Color.PURPLE, random.nextInt(50));
                break;

        }
        try {
            throw new FigureException("Unknown figure");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return figure;
    }

    private void repaint() {
        canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        for (Figure figure : figures) {
            if (figure != null) {
                figure.draw(canvas.getGraphicsContext2D());
                canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                Drawer<Figure> drawer = new Drawer<>(figures);
                drawer.draw(canvas.getGraphicsContext2D());
            }


        }
    }

    @FXML
    private void onMouseClicked(MouseEvent mouseEvent) throws FigureException {
        addFigure(createFigure(mouseEvent.getX(), mouseEvent.getY()));
        repaint();
    }
}