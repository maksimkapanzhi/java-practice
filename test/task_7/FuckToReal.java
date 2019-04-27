package test.task_7;

import java.util.Scanner;

public class FuckToReal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the count");
        int number = in.nextInt();
        System.out.println(factorial(number));

    }

        static int factorial(int x) {
            if (x == 1) {
                return 1;
            }
            else{
                return x*factorial(x-1);
            }
        }

    }

