package test.task_5;

public class LearnBreak {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int count = 0; count < array.length; count++) {

            if (count == 5) {
                break;
            }

            System.out.println(array[count]);
        }
    }
}
