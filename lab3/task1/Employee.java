package lab3.task1;

import java.util.Scanner;

public class Employee {
    private String fio;

    public Employee() {
        fio = "";
    }

    public Employee(String fio) {
        this.fio = fio;
    }

    public void setFio(String fio){
        this.fio = fio;
    }
    public String getFio(){
        return fio;
    }

    public void fillEmployee(Scanner scan){
        System.out.print("Enter FIO: ");
        fio = scan.nextLine();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                '}';
    }
}
