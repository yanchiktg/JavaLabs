package lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double a = 1, b = 0, res = 0;

        do {
            System.out.print("[a, b] = ");
            try{
                a = scanner.nextDouble();
                b = scanner.nextDouble();
            } catch (InputMismatchException ex){
                System.out.println("invalid data type! try again\n");
                scanner.nextLine();
            } catch (Exception e){
                e.printStackTrace();
            }
        } while (a >= b);

        System.out.println("line segment = [" + a + ";" + b + "]");

        double x = 0;
        boolean check = true;
        do {
            try {
                System.out.print("\nEnter x = ");
                x = scanner.nextDouble();
                check = false;
            }
            catch (InputMismatchException e){
                System.out.println("invalid data type! try again");
                scanner.nextLine();
            }
            catch (Exception e){
                System.out.println(e.getMessage() + "\ntry again");
            }
        } while (check);
        System.out.println("You enter x = " + x + "\n");

        if(x < a){
            try{
                if (x == 0 || x < 0)
                    throw new ArithmeticException("ln <= 0!");
                else {
                    res = Math.cos(x + Math.log(x)) + Math.pow(Math.E, x);
                    System.out.print("Result = " + res);
                }
            } catch (ArithmeticException e){
                System.out.println(e.getMessage() + " try again");
            }
        }
        else if(x >= a && x <= b){
            res = Math.pow(x, 3) + Math.pow(x, 2) - 15;
            System.out.print("Result = " + res);
        }
        else{
            try{
                if ((x * 2) % 2 == 1){
                    throw new ArithmeticException("tan() is not determined!");
                }
                if (x % 1 == 0){
                    throw new ArithmeticException("division by zero!");
                }
                res = (x + 5.0)/(Math.tan(Math.PI * x));
                System.out.print("Result = " + res);
            } catch (ArithmeticException e){
                System.out.println(e.getMessage() + " try again");
            }
        }
    }
}
