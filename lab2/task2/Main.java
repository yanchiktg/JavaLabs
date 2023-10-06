package lab2.task2;

import java.util.Scanner;
import java.util.Arrays;
/*
Дана матрица A[n][m]. Сформировать вектор В из четных элементов матрицы из заданного диапазона [a,b]. Отсортировать вектор В по возрастанию.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0, m = 0, k = 0;
        while(m <= 1 || n <= 1) {
            System.out.print("Enter n = ");
            n = scanner.nextInt();
            System.out.print("Enter m = ");
            m = scanner.nextInt();
        }
        int[][] array = new int[n][m];

        System.out.println("Enter: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                array[i][j] = scanner.nextInt();

        System.out.println("Your array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter a = ");
        int a = scanner.nextInt();
        System.out.print("Enter b = ");
        int b = scanner.nextInt();
        System.out.println("Line segment = [" + a + ";" + b + "]");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] % 2 == 0 && (array[i][j] >= a && array[i][j] <= b)) {
                    k++;
                }
            }
        }

        int[] arrayB = new int[k];
        k = 0;
        System.out.println("Array B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] % 2 == 0 && (array[i][j] >= a && array[i][j] <= b)) {
                    arrayB[k++] = array[i][j];
                    System.out.print(arrayB[k-1] + " ");
                }
            }
        }

        int c = 0;
        for (int i = 0; i < k; i++)
            for (int j = 0; j < k-1; j++)
                if (arrayB[j] > arrayB[j+1]) {
                    c = arrayB[j];
                    arrayB[j] = arrayB[j + 1];
                    arrayB[j + 1] = c;
                }


        System.out.println();
//        Arrays.sort(arrayB);
        System.out.println("Sorted array B:");
        for (int i = 0; i < k; i++)
            System.out.print(arrayB[i] + " ");
    }
}
