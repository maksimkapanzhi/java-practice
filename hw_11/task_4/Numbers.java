package hw_11.task_4;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);

        List rever = new ArrayList(numbers);
        Collections.reverse(rever);
        System.out.println("В обратном порядке: " + rever);
    }

}



