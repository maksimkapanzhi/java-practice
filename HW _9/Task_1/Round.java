package HW_9.Task_1;

public class Round implements Figure{
    double radius;
    Round(double radius){
        this.radius = radius;
    }

    @Override
    public double perimetr() {
       return (radius*Math.PI*2);
    }

    @Override
    public double area() {
    return ((Math.pow(radius, 2))*Math.PI);
    }

}
