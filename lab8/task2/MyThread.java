package lab8.task2;

import java.util.Arrays;

public class MyThread implements Runnable{
    private int number;
    private int size;
    private int[] mas;
    private int k;

    public MyThread(int number, int size, int k){
        this.number = number;
        this.size = size;
        this.k = k;
        mas = new int[size];
        for (int i = 0; i < size; i++){
            mas[i] = (int)(Math.random()*101);
        }
    }

    public void kol(int [] A, int k){
        int kol = 0;
        for (int i = 0; i < size; i++){
            if (i%2 == 0 && A[i] > Math.abs(k)){
                kol++;
            }
        }
        System.out.println("количество элементов массива " + number + " с четными индексами = " + kol);
    }

    public void print() {
        System.out.println("Поток " + number + " " + Arrays.toString(mas));
    }

    @Override
    public void run(){
        try {
            System.out.println("Поток " + number + " начал работу");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        print();
        kol(mas, k);
        System.out.println("Поток " + number +" закончил работу");
    }
}

//    public void kol(){
//        int kol = 0;
//        for (int i = 0; i < size; i++){
//            if (mas[i]%2 == 0 && mas[i] > k){
//                kol++;
//            }
//        }
//        System.out.println("kol elem = " + kol);
//        return kol;
//    }
