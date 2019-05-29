package Test2.task_2;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Scholar {
    public static void main(String[] args) {
      Scholar pasha = new Scholar();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of week");
        String day = scanner.nextLine().toUpperCase();
        //String day2 = day.toUpperCase();
        DayOfWeek f = DayOfWeek.valueOf(day);
        if ((f.equals(DayOfWeek.SUNDAY))||(f.equals(DayOfWeek.SATURDAY))){
            System.out.println("Stay at home!");

            }
        else{
            System.out.println("Go to school");
        }

    }
}
