package by.stormnet.figuresfx.figures;

import by.stormnet.figuresfx.drawutils.Drawable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Figure implements Drawable {

    public static final int FIGURES_TYPE_CIRCLE = 0;
    public static final int FIGURES_TYPE_RECTANGLE = 1;
    public static final int FIGURES_TYPE_TRIANGLE = 2;
    public static final int FIGURES_TYPE_MYFIGURE = 3;

    private int type;

    protected double cx;
    protected double cy;
    protected double LineWidth;
    protected Color color;

    public Figure(int type, double cx, double cy, double lineWidth, Color color) {
        this.type = type;
        this.cx = cx;
        this.cy = cy;
        LineWidth = lineWidth;
        this.color = color;
    }

    public int getType() {
        return type;
    }

    public double getCx() {
        return cx;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public double getCy() {
        return cy;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }

    public double getLineWidth() {
        return LineWidth;
    }

    public void setLineWidth(double lineWidth) {
        LineWidth = lineWidth;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(GraphicsContext gc);

}
