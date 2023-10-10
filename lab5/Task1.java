package lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double r1 = 1, r2 = 1, l = 1;

        try{
            System.out.print("Enter r1 = ");
            r1 = scanner.nextDouble();
            if(r1 < 0){
                throw new IllegalArgumentException("IllegalArgumentException! (r1 < 0): " + r1);
            }

            System.out.print("Enter r2 = ");
            r2 = scanner.nextDouble();
            if (r2 < 0){
                throw new IllegalArgumentException("IllegalArgumentException! (r2 < 0): " + r2);
            }

            System.out.print("Enter l = ");
            l = scanner.nextDouble();
            if (l < 0){
                throw new IllegalArgumentException("IllegalArgumentException! (l < 0): " + l);
            }
            double S = Math.PI * (r1 + r2) * l;
            System.out.print("Result lab1: " + S);

        } catch (ArithmeticException e){
            System.err.println(e.getMessage() + " try again");
        } catch (InputMismatchException e){
            System.err.println("invalid data type!");
        } catch (IllegalArgumentException e){
            System.err.println("Illegal Argument Exception! try again");
        }
    }
}
