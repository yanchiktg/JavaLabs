package lab3.task2;

import java.util.Scanner;

public class Passenger extends Man implements InputOutput{

    public Passenger(String fio) {
        super(fio);
    }

    public Passenger() {

    }

    @Override
    public void fill(Scanner scanner){
        scanner.nextLine();
        super.fill(scanner);
    }

    public void output(){
        System.out.println(this);
    }

    @Override
    public void aboutMe() {
        System.out.println("You are a Passenger!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
