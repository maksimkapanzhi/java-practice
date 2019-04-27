package test.task_6;

import test.task_2.Array;

import java.util.Arrays;

public class LearnContinue {
    public static void main(String[] args) {
        int[] array = {12, 47, 53, 5, 9, 44};
        for(int count = 0; count<array.length; count++){
            if(array[count] == 5){
                continue;
            }
            System.out.println(array[count]);
        }



    }
}
