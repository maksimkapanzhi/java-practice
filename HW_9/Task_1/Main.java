package HW_9.Task_1;

public class Main {
    public static void main(String[] args) {
    Triangle vasiliy = new Triangle(5, 6, 7);
    vasiliy.perimetr();
    vasiliy.area();
        System.out.println(vasiliy.perimetr());
        System.out.println(vasiliy.area());
        System.out.println();
        System.out.println();

        Round alexey = new Round(4);
        alexey.perimetr();
        alexey.area();
        System.out.println(alexey.perimetr());
        System.out.println(alexey.area());
        System.out.println();
        System.out.println();


        Rectangle dmitry = new Rectangle(4, 2);
        dmitry.perimetr();
        dmitry.area();
        System.out.println(dmitry.perimetr());
        System.out.println(dmitry.area());
        System.out.println();
        System.out.println();
    }

}
