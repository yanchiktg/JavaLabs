package lab1.task2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a = ");
    double a = scanner.nextDouble();

    System.out.print("Enter b = ");
    double b = scanner.nextDouble();
    double res = 0; 

    if(a > b || a == b)
      System.out.print("Invalid values!");  
    else{  
      System.out.println("line segment = [" + a + ";" + b + "]");
      System.out.print("Enter x = ");
      double x = scanner.nextDouble();
    
      if(x < a){
        if(x > 0){
          res = Math.cos(x + Math.log(x)) + Math.pow(Math.E, x);
          System.out.print("Result = " + res);
        }
        else{
          System.out.print("Error log() < 0!");
        }
      }

      else if(x >= a && x <= b){
        res = Math.pow(x, 3) + Math.pow(x, 2) - 15;
        System.out.print("Result = " + res);
      }

      else{
        if((Math.tan(Math.PI * x)) != 0){
          res = (x + 5.0)/(Math.tan(Math.PI * x));
          System.out.print("Result = " + res);
        }
        else{
          System.out.print("Error tg = 0!");
        }
      }

    }
  }
}