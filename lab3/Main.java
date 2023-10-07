package lab3;

import lab3.task2.*;

import java.util.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Man p = new Passenger();
        p.aboutMe();

//        Man m = new Employee();
//        m.aboutMe();
//        Stations[] values = Stations.values();
//        for (Stations c: values){
//            System.out.println(c.ordinal() + " " + c.name());
//        }
//
//        Stations stations = Stations.valueOf(new Scanner(System.in).nextLine());
//        stations.output();

        Ticket t = new Ticket();
        t.fill(scanner);
        System.out.println(t.toString());


//        System.out.println("input wagonType: ");
//        WagonType[] values = WagonType.values();
//        for (WagonType value : values) {
//            System.out.println(value.ordinal() + " " + value.name());
//        }
//
//        WagonType userWagonType = null;
//        String inputWagonType = scanner.next();
//
//        switch (inputWagonType){
//            case "0" :
//            case "PASSENGER" :
//                userWagonType = WagonType.PASSENGER; break;
//            case "1":
//            case "HIGHSPEED":
//                userWagonType = WagonType.HIGHSPEED; break;
//            case "2":
//            case "TOURIST":
//                userWagonType = WagonType.TOURIST; break;
//            case "3":
//            case "EXPRESS":
//                userWagonType = WagonType.EXPRESS; break;
//        }
//
//        System.out.println("User wagonType is " + userWagonType.name());
    }
}