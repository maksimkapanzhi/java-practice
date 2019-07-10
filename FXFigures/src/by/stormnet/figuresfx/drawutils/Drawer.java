package by.stormnet.figuresfx.drawutils;

import by.stormnet.figuresfx.figures.Figure;
import javafx.scene.canvas.GraphicsContext;


import java.util.ArrayList;
import java.util.List;

public class Drawer<T extends Figure & Drawable>  {

    private ArrayList<Figure> figures;

    public Drawer(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    public void draw(GraphicsContext gc) {
        for (Figure figure : figures) {
            if (figures != null){
                figure.draw(gc);
            }
        }

    }

}



