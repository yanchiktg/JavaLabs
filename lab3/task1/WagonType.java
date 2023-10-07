package lab3.task1;

import java.util.Scanner;

public class WagonType {
    private int numberOfSeats;
    private String type;

    public WagonType() {
        numberOfSeats = 0;
        type = "";
    }

    public WagonType(int numberOfSeats, String type) {
        this.numberOfSeats = numberOfSeats;
        this.type = type;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getType() {
        return type;
    }

    public void fillNumberOfSeats(Scanner scan){
        System.out.print("Enter number of seats: ");
        numberOfSeats = scan.nextInt();
        System.out.print("Enter type: ");
        type = scan.nextLine();
    }

    @Override
    public String toString() {
        return "WagonType{" +
                "NumberOfSeats=" + numberOfSeats +
                ", Type='" + type + '\'' +
                '}';
    }
}
