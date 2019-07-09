package by.stormnet.figuresfx.figures;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Objects;

public class Circle extends Figure {

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    private Circle(double cx, double cy, double lineWidth, Color color) {
        super(Figure.FIGURES_TYPE_CIRCLE, cx, cy, lineWidth, color);
    }

    public Circle(double cx, double cy, double lineWidth, Color color, double radius) {
        this(cx, cy, lineWidth, color);
        this.radius = radius < 10 ? 10 : radius;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setLineWidth(LineWidth);
        gc.setStroke(color);
        gc.strokeOval(cx - radius, cy- radius, radius*2, radius*2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append("radius=").append(radius);
        sb.append(", cx=").append(cx);
        sb.append(", cy=").append(cy);
        sb.append(", LineWidth=").append(LineWidth);
        sb.append(", color=").append(color);
        sb.append('}');

        return sb.toString();
    }
}
