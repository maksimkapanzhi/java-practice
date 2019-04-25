package HW_4.task_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = 0;
        int for2size = 0;
        size = sc.nextInt();
        if (size>=3){
            int[] array = new int[size];
            Random random = new Random();
            int max = size ;
            int min = 0;
            for (int element = 0; element<array.length; element++){
                array[element] = random.nextInt((max-min)+1)+min;
            }
            {
                for (int elem = 0; elem<array.length; elem++)
                    if (array[elem]%2 == 0){
                        for2size++;
                    }
            }
            System.out.println(Arrays.toString(array));
            {
                int[] array2 = new int[for2size];
                int elem2 = 0;
                for (int elem = 0; elem<array.length; elem++)
                    if (array[elem]%2 == 0){
                        array2[elem2] = array[elem];
                        elem2++;

                    }
                System.out.println(Arrays.toString(array2));
            }

        }
        else{
            System.out.println("Значение не может быть меньше 3-х. Пожалуйста, повторите попытку");
        }

    }
}
