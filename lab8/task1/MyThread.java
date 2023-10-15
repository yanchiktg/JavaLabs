package lab8.task1;

public class MyThread implements Runnable{
    private int number;

    public MyThread(int number){
        this.number = number;
    }

    @Override
    public void run(){
        try {
            System.out.println("Поток " + number + " начал работу");
            Thread.sleep(1000*number);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Поток " + number +" закончил работу");
    }
}
