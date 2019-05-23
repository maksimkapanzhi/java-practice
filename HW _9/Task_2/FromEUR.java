package HW_9.Task_2;

public class FromEUR implements Converter {
    Course valcourse;
    FromEUR(Course course){
        valcourse = Course.USA;
    }
    @Override
    public double toBYN() {
        return 0;
    }
}