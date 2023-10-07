package lab3.task1;

import java.util.Scanner;

public class TrainType {
    private String name;

    public TrainType() {
    }

    public TrainType(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void fillTrainType(Scanner scan){
        System.out.print("Enter name: ");
        name = scan.nextLine();
    }

    @Override
    public String toString() {
        return "TrainType{" +
                "name='" + name + '\'' +
                '}';
    }
}
