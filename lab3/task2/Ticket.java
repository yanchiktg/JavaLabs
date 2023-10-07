package lab3.task2;

import java.util.Date;
import java.util.Scanner;

public class Ticket implements InputOutput{
    private CashBox cashBox;
    private Wagon wagon;
    private int price;
    private Man passenger;
    private int placeNumber;

    public Ticket() {
        cashBox = new CashBox();
        wagon = new Wagon();
        passenger = new Passenger();
        price = 0;
        placeNumber = 0;
    }

    public Ticket(CashBox cashBox, Wagon wagon, int price, Man passenger, int placeNumber) {
        this.cashBox = cashBox;
        this.wagon = wagon;
        this.price = price;
        this.passenger = passenger;
        this.placeNumber = placeNumber;
    }

//    public Ticket(int price, int placeNumber, Date dateOfSale) {
//        this.price = price;
//        this.placeNumber = placeNumber;
//        this.dateOfSale = dateOfSale;
//    }

//    public Ticket(){
//        this(new CashBox(), new Wagon(), new Date());
//    }

    public void setCashBox(CashBox cashBox) {
        this.cashBox = cashBox;
    }

    public void setPassenger(Man passenger) {
        this.passenger = passenger;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }

    public CashBox getCashBox() {
        return cashBox;
    }

    public Man getPassenger() {
        return passenger;
    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }


    public int getPrice() {
        return price;
    }


    public int getPlaceNumber() {
        return placeNumber;
    }

    @Override
    public void fill(Scanner scanner) {
        System.out.print("Enter price: ");
        price = scanner.nextInt();
        cashBox.fill(scanner);
        wagon.fill(scanner);
        passenger.fill(scanner);
        System.out.print("Enter place number: ");
        placeNumber = scanner.nextInt();
    }

    @Override
    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Ticket: " + "\n" +
                cashBox + "\n" +
                wagon + "\n" +
                "price = " + price + "\n" +
                "pwassenger: " + passenger + "\n" +
                "placeNumber = " + placeNumber;
    }
}
