package test.task_4;

public class ArrayDouble {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {1, 2}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
