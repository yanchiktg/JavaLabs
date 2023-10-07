package lab3.task1;

import java.util.Scanner;

public class ArrivalStation {
    private String name;

    public ArrivalStation() {
        name = "";
    }

    public ArrivalStation(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void fillArrivalStation(Scanner scan){
        System.out.print("Enter name: ");
        name = scan.nextLine();
    }

    @Override
    public String toString() {
        return "ArrivalStation{" +
                "name='" + name + '\'' +
                '}';
    }
}
