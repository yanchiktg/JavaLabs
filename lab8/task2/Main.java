package lab8.task2;
//Дан массив A[n]. Подсчитать количество элементов массива с четными индексами, больших по абсолютной величине, чем k.
import lab8.task2.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        int threadCount = 4, size = 10 , k = 50;
        Thread [] threads = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++){
            threads[i] = new Thread(new MyThread(i+1, size, k));
        }

        System.out.println("Hello from " + Thread.currentThread().getName());
        threads[0].start();
        threads[1].start();
        threads[2].start();

        threads[0].join();
        threads[1].join();

        threads[3].start();
        threads[3].join();
        threads[2].join();
        System.out.println("Main is going to sleep..");
    }
}
