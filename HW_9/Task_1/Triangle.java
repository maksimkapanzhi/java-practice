package HW_9.Task_1;

public class Triangle implements Figure{
        double a;
    double b;
    double c;
    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double perimetr() {
        return (a+b+c);
    }

    @Override
    public double area() {
        double p = a+b+c;
        return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
