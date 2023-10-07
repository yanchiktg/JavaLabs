package lab3.task1;

import java.util.Date;
import java.util.Scanner;

public class Flight {
    private Train train;
    private Date flightDate;

    public Flight() {

        flightDate = null;
    }

    public Flight(Date flightDate) {
        this.flightDate = flightDate;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Train getTrain() {
        return train;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void fillFlight(Scanner scan){
        System.out.print("Enter flight Date: ");
        flightDate = new Date();
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightDate=" + flightDate +
                '}';
    }
}
