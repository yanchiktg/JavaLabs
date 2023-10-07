package lab3.task1;

import java.util.Scanner;

public class DispatchStation {
    private String name;

    public DispatchStation() {
        name = "";
    }

    public DispatchStation(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void fillDispatchStation(Scanner scan){
        System.out.print("Enter name: ");
        name = scan.nextLine();
    }

    @Override
    public String toString() {
        return "DispatchStation{" +
                "name='" + name + '\'' +
                '}';
    }
}
