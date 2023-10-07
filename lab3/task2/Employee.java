package lab3.task2;

import java.util.Scanner;

public class Employee extends Man implements InputOutput{

    public Employee(String fio) {
        super(fio);
    }

    public Employee() {

    }

    @Override
    public void fill(Scanner scanner){
        super.fill(scanner);
    }

    public void output(){
        System.out.println(this);
    }

    @Override
    public void aboutMe() {
        System.out.println("You are Employee!");
    }

    @Override
    public String toString() {
        return "Employee{}";
    }
}
