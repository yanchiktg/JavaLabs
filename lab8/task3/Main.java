package lab8.task3;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void fileRead(String fileN, int[] mas) throws Exception{
        FileReader fileReader = new FileReader(fileN);
        Scanner scan = new Scanner(fileReader);
        for (int i = 0; i < mas.length; i++){
            mas[i] = scan.nextInt();
        }
        fileReader.close();
    }

    public static void fileWrite(String fileN, int[] mas) throws Exception{
        FileWriter fileWriter = new FileWriter(fileN);
        fileWriter.write("");
        for (int i = 0; i < mas.length; i++){
            fileWriter.write(mas[i] + " ");
        }
        fileWriter.close();
    }

    public static int[] randElements(int n){
        int[] mas = new int[n];
        for (int i = 0; i < n; i++){
            mas[i] = (int)(Math.random()*101);
        }
        return mas;
    }

    public static void main(String[] args) throws Exception{
        int size = (100-15)/2;

        int[] mas1 = randElements(size);
        int[] mas2 = randElements(size);
        int[] mas3 = randElements(size);

        int[] m1 = Arrays.copyOf(mas1, size);
        int[] m2 = Arrays.copyOf(mas2, size);
        int[] m3 = Arrays.copyOf(mas3, size);

        int [][] massive = {m1, m2, m3};
        int j = 0;
        long globalTime = 0, globalTimeThread = 0, time = 0, firstT = 0, firstThredT = 0;
        while (j <= 50){
            time = System.currentTimeMillis();
            fileWrite("file1.txt", mas1);
            fileRead("file1.txt", mas1);
            fileWrite("file2.txt", mas2);
            fileRead("file2.txt", mas2);
            fileWrite("file3.txt", mas3);
            fileRead("file3.txt", mas3);

            Arrays.sort(mas1);
            Arrays.sort(mas2);
            Arrays.sort(mas3);

            time = System.currentTimeMillis() - time;
            if (j == 0){
                firstT = time;
            }
            globalTime += time;

            Thread[] threads = new Thread[3];
            for (int i = 0; i < 3; i++){
                threads[i] = new Thread(new MyThread("file_thread_" + i + ".txt", Arrays.copyOf(massive[i], size)));
            }

            time = System.currentTimeMillis();
            threads[0].start();
            threads[1].start();
            threads[2].start();
            threads[0].join();
            threads[1].join();
            threads[2].join();
            time = System.currentTimeMillis()-time;
            if (j == 0){
                firstThredT = time;
            }
            globalTimeThread += time;
            j++;
        }
        System.out.println("Среднее время выполнения в 1 потоке: " + globalTime/50 + " мс");
        System.out.println("Среднее время выполнения в параллельных потоках: " + globalTimeThread/50 + " мс");

        System.out.println("Время за 1 проход для одного потока = " + firstT);
        System.out.println("Время за 1 проход для трёх потоков = " + firstThredT);
    }
}
