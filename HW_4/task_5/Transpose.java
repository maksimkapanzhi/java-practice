package HW_4.task_5;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        int[][]array = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                array[i][j] = n*i+j;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        {
            System.out.println("");// вот этот блок просто чтобы визуально отделить матрицы,
            System.out.println("А теперь новая матрица");
            System.out.println("");
        }
        for (int j = 0; j < n; j++){
            for (int i = 0; i < n; i++){
                System.out.print(array [i][j] + " ");
            }
            System.out.println();
        }
    }
}
