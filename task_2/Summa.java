package hw_3.task_1.task_2;

import java.math.BigDecimal;

public class Summa {
    public static void main(String[] args) {
        double first = 1.2;
        double second = 1.4;
        
        // а зачем эта строка?
        System.out.println(first+second);

        /*BigDecimal bigDecimal = new BigDecimal(first);
        BigDecimal bigDecimal2 = new BigDecimal(second);*/
        System.out.println(new BigDecimal("1.2").add (new BigDecimal("1.4")));
    }
}
