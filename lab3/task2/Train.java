package lab3.task2;

import java.util.Date;
import java.util.Scanner;

public class Train implements InputOutput{
    private TrainType trainType;
    private Stations enumStationFrom;
    private Stations enumStationTo;

    public Train() {
        trainType = TrainType.RESERVED_SEAT;
        enumStationFrom = Stations.MINSK;
        enumStationTo = Stations.GOMEL;
    }

    public void setEnumStationFrom(Stations enumStationFrom) {
        this.enumStationFrom = enumStationFrom;
    }

    public void setEnumStationTo(Stations enumStationTo) {
        this.enumStationTo = enumStationTo;
    }

    public Stations getEnumStationFrom() {
        return enumStationFrom;
    }

    public Stations getEnumStationTo() {
        return enumStationTo;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    @Override
    public void fill(Scanner scanner) {
        System.out.println("TrainType (RESERVED_SEAT, SHARED, COMPARTMENT, SV, SITTING) = ");
        trainType = TrainType.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("StationTo (GOMEL, BREST, MINSK, MOGILEV, GRODNO) = ");
        enumStationTo = Stations.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("StationFrom (GOMEL, BREST, MINSK, MOGILEV, GRODNO) = ");
        enumStationTo = Stations.valueOf(scanner.nextLine().toUpperCase());
    }

    @Override
    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "\nstation from = " + enumStationFrom + "\nstation to = " + enumStationTo + "\ntrain type = " + trainType;
    }
}
