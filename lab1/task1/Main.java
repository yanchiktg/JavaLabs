package lab1.task1;

import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter r1 = ");
    double r1 = scanner.nextDouble();

    System.out.print("Enter r2 = ");
    double r2 = scanner.nextDouble();

    System.out.print("Enter l = ");
    double l = scanner.nextDouble();


    double S = Math.PI * (r1 + r2) * l;
    System.out.print("Result: " + S);
  }
}