package lab8.task1;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        int threadCount = 4;
        Thread [] threads = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++){
            threads[i] = new Thread(new MyThread(i+1));
        }
//        Thread t2 = new Thread(new MyThread(threadCount));
//        t2.start();
        System.out.println("Hello from " + Thread.currentThread().getName());
        threads[0].start();
        threads[1].start();
        threads[2].start();

        threads[0].join();
        threads[1].join();

        threads[3].start();
        threads[3].join();
        threads[2].join();

        //threads[1].join();

        System.out.println("Main is going to sleep..");
    }
}


//class MyThread implements Runnable{
//    private int num;
//    public MyThread(int num){
//        this.num = num;
//    }
//
//    public
//}

//threads[0].start();
//        threads[2].start();
//
//        threads[2].join();
//        threads[0].join();
//        threads[1].start();
//        threads[1].join();
//        threads[3].start();
//        threads[3].join();