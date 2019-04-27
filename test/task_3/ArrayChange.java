package test.task_3;

import java.util.Arrays;

public class ArrayChange {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int count = 0; count<array.length-1; count++){
            int temp = array[count];
            array[count] = array[count+1];
            array[count+1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
