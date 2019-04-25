package HW_4.task_2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        Random random = new Random();
        int max = 5;
        int min = 0;
        for (int element = 0; element < array1.length; element++) {
            array1[element] = random.nextInt((max - min) + 1) + min;

        }
        System.out.println(Arrays.toString(array1) + "Это первый массив");
        {
            int[] array2 = new int[5];
            Random random2 = new Random();
            int max2 = 5;
            int min2 = 0;
            for (int element2 = 0; element2 < array2.length; element2++) {
                array2[element2] = random.nextInt((max - min) + 1) + min;
            }
            System.out.println(Arrays.toString(array2) + "Это второй массив");
            {
                double avg1 = 0;
                int sum1 = 0;
                int dlina = array1.length;
                for (int i = 0; i<dlina; i++){
                    sum1 += array1[i];
                }
                avg1 = (double)sum1/dlina;
                System.out.println(avg1 + "      Это среднее арифметическое первого массива");

                double avg2 = 0;
                int sum2 = 0;
                int dlina2 = array2.length;//новая переменная для представления длины строки в int
                for (int i = 0; i<dlina2; i++){
                    sum2 += array2[i];
                }
                avg2 = (double)sum2/dlina2;
                System.out.println(avg2 + "      Это среднее арифметическое второго массива");
                if (avg1>avg2) {
                    System.out.println("Среднее арифметическое ПЕРВОГО массива больше");
                }
                if (avg1<avg2){
                    System.out.println("Среднее арифметическое ВТОРОГО массива больше");
                }
                if  (avg1 == avg2)    {
                    System.out.println("Средние арифметические равны");
                }
            }


        }

    }
}

