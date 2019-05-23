package HW_9.Task_2;

import java.util.Scanner;

public class FromUSA implements Converter {
    Course valcourse;
    FromUSA(Course course){
        valcourse = Course.USA;
    }
    @Override
    public double toBYN() {
        return 0;
    }
}



