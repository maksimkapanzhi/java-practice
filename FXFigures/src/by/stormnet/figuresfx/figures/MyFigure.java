package by.stormnet.figuresfx.figures;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Objects;

public class MyFigure extends Figure{

    public MyFigure(double cx, double cy, double lineWidth, Color color, double base) {
        this(cx, cy, lineWidth, color);
        this.base = base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyFigure myFigure = (MyFigure) o;
        return Double.compare(myFigure.base, base) == 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyFigure{");
        sb.append("base=").append(base);
        sb.append(", cx=").append(cx);
        sb.append(", cy=").append(cy);
        sb.append(", LineWidth=").append(LineWidth);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(base);
    }

    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    private MyFigure(double cx, double cy, double lineWidth, Color color) {
        super(Figure.FIGURES_TYPE_MYFIGURE, cx, cy, lineWidth, color);
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setLineWidth(LineWidth);
        gc.setStroke(color);
        gc.strokePolygon(new double[]{
                cx-base/2,
                cx-base/2,
                cx - base*0.13,
                cx - base*0.13,
                cx + base*0.13,
                cx + base*0.13,
                cx + base/2,
                cx + base/2,
                cx + base*0.13,
                cx + base*0.13,
                cx - base*0.13,
                cx - base*0.13,
        }, new double[]{
                cy - base*0.13,
                cy + base*0.13,
                cy + base*0.13,
                cy + base / 2,
                cy + base / 2,
                cy + base * 0.13,
                cy + base * 0.13,
                cy - base * 0.13,
                cy - base * 0.13,
                cy - base / 2,
                cy - base / 2,
                cy - base * 0.13
        }, 12);
    }
}

