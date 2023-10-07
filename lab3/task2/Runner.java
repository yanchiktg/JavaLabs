package lab3.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Stations[] values = Stations.values();
        for (Stations c: values){
            System.out.println(c.ordinal() + " " + c.name());
        }

        Stations stations = Stations.valueOf(new Scanner(System.in).nextLine());
        System.out.println(stations);
        
    }
}
