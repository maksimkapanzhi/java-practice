package HW_9.Task_1;

public class Rectangle implements Figure {
    double a;
    double b;
    Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double perimetr() {
        return ((a+b)*2);
    }

    @Override
    public double area() {
        return (a*b);
    }
}
