package test.task_2;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[11];
        for (int count = 0; count < array.length; count++) {
            array[count] = count;
            System.out.println(array[count]);
        }
    }


}
