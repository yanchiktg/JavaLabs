package lab3.task2;

import java.util.Scanner;

public class Wagon implements InputOutput{
    private WagonType wagonType;
    private Flight flight;
    private int number;

    public Wagon() {
        wagonType = WagonType.PASSENGER;
        flight = new Flight();
        number = 0;
    }

    public Wagon(int number) {
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

    @Override
    public void fill(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Choose wagonType (PASSENGER, HIGHSPEED, TOURIST, EXPRESS) = ");
        wagonType = WagonType.valueOf(scanner.nextLine().toUpperCase());
        flight.fill(scanner);
        System.out.print("Enter numberWagon: ");
        number = scanner.nextInt();
    }

    @Override
    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Wagon's number = " + number + "\n" + wagonType + flight;
    }
}
