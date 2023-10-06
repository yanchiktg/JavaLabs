package lab2.task1;

import java.util.Scanner;
import java.util.Arrays;

/*
Дан массив A[n]. Найти сумму модулей элементов, расположенных между первым и вторым нулевыми элементами массива.
 */

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = { {1, 2, 3, 4}, { 6, 7, 8, 9, 10} };
        System.out.println(arr[1][1]);

        float a = 5;
        int b = 0;
        float r = a/b;

        int num = 0;
        for (int i = 0; i < 100; i++)
            num += num;
        System.out.println(num);

        int n = 0;
        while (n < 1) {
            System.out.print("Enter n = ");
            n = scanner.nextInt();
        }
        int[] array = new int[n];

        System.out.println("Enter: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int first = 0, second = 0, k = 0;
        for (int i = 0; i < n; i++){
            if(k < 2) {
                if (array[i] == 0) {
                    second = i;
                    k++;
                    if(k == 1)
                        first = i;
                }
            }
        }

        int res = 0;
        for (int i = first; i < second; i++){
            res = res + Math.abs(array[i]);
        }
        System.out.println("Result " + res);
        System.out.println("First position " + first);
        System.out.println("Second position " + second);
    }
}
