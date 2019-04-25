package HW_4.task_1;

import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();
        int max = 10;
        int min = 1;
        for (int element = 0; element<array.length; element++){
            array[element] = random.nextInt((max-min)+1)+min;
        }
        System.out.println(Arrays.toString(array));
        for (int element = 1; element<array.length; element = element+2){
            array[element] = 0;
        }
        System.out.println(Arrays.toString(array));
    }

}



