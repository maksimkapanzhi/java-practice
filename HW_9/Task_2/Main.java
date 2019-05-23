package HW_9.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter summ");
        int summ = in.nextInt();

        Course courseUSD = Course.USA;
        System.out.println((courseUSD.getCount()*summ) + " USD");

        Course courseEUR = Course.EUR;
        System.out.println((courseEUR.getCount()*summ + " EUR"));

    }

}


