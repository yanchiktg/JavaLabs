package lab3;

import lab3.task2.*;

import java.util.Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Man p = new Passenger();
        p.aboutMe();

        Ticket t = new Ticket();
        t.fill(scanner);
        System.out.println(t.toString());
        
    }
}
