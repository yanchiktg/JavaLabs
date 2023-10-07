package lab3.task1;

import java.util.Date;
import java.util.Scanner;

public class Ticket {
    private CashBox cashBox;
    private RailwayCarriage railwayCarriage;
    private int price;
    private String passengersFio;
    private int placeNumber;
    private Date dateOfSale;

    public Ticket() {
        price = 0;
        passengersFio = "";
        placeNumber = 0;
        dateOfSale = null;
    }

    public Ticket(int price, String passengersFio, int placeNumber, Date dateOfSale) {
        this.price = price;
        this.passengersFio = passengersFio;
        this.placeNumber = placeNumber;
        this.dateOfSale = dateOfSale;
    }

    public void setCashBox(CashBox cashBox) {
        this.cashBox = cashBox;
    }

    public void setRailwayCarriage(RailwayCarriage railwayCarriage) {
        this.railwayCarriage = railwayCarriage;
    }

    public CashBox getCashBox() {
        return cashBox;
    }

    public RailwayCarriage getRailwayCarriage() {
        return railwayCarriage;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPassengersFio(String passengersFio) {
        this.passengersFio = passengersFio;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }


    public int getPrice() {
        return price;
    }

    public String getPassengersFio() {
        return passengersFio;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void fillTicket(Scanner scan){
        System.out.print("Enter price: ");
        price = scan.nextInt();
        System.out.print("Enter passenger's fio: ");
        passengersFio = scan.nextLine();
        System.out.print("Enter place number: ");
        placeNumber = scan.nextInt();
        System.out.print("Enter date of sale: ");
        dateOfSale = new Date(scan.nextInt());
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                ", passengersFio='" + passengersFio + '\'' +
                ", PlaceNumber=" + placeNumber +
                ", DateOfSale=" + dateOfSale +
                '}';
    }
}
