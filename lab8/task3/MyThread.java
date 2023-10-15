package lab8.task3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MyThread implements Runnable{

    private String fileN;
    private int[] mas;

    public MyThread(String fileN, int[] mas){
        this.fileN = fileN;
        this.mas = mas;
    }

    @Override
    public void run(){
        try {
            fileWrite(fileN);
            fileRead(fileN);
            Arrays.sort(mas);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void fileRead(String fileN) throws IOException {
        FileReader fileReader = new FileReader(fileN);
        Scanner scan = new Scanner(fileReader);
        for (int i = 0; i < mas.length; i++){
            mas[i] = scan.nextInt();
        }
        fileReader.close();
    }

    public void fileWrite(String fileN) throws Exception{
        FileWriter fileWriter = new FileWriter(fileN);
        fileWriter.write("");
        for (int i = 0; i < mas.length; i++){
            fileWriter.write(mas[i] + " ");
        }
        fileWriter.close();
    }
}
