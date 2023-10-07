package lab3.task1;

import java.util.Scanner;

public class RailwayCarriage {
    private WagonType wagonType;
    private Flight flight;
    private int number;

    public RailwayCarriage() {
        number = 0;
    }

    public RailwayCarriage(int number) {
        this.number = number;
    }

    public void setWagonType(WagonType wagonType) {
        this.wagonType = wagonType;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public WagonType getWagonType() {
        return wagonType;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void fillRailwayCarriage(Scanner scan){
        System.out.print("Enter number: ");
        number = scan.nextInt();
    }

    @Override
    public String toString() {
        return "RailwayCarriage{" +
                "Number=" + number +
                '}';
    }
}
