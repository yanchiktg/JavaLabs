package lab3.task1;

import java.util.Date;
import java.util.Scanner;

public class Train {
    private TrainType trainType;
    private ArrivalStation arrivalStation;
    private DispatchStation dispatchStation;
    private Date dispatchTime;
    private Date arrivalTime;

    public Train() {
        trainType = new TrainType();
 //       arrivalTime = new ArrivalStation();
        dispatchTime = null;
        arrivalTime = null;
    }

    public Train(Date dispatchTime, Date arrivalTime) {
        this.dispatchTime = dispatchTime;
        this.arrivalTime = arrivalTime;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public void setArrivalStation(ArrivalStation arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public void setDispatchStation(DispatchStation dispatchStation) {
        this.dispatchStation = dispatchStation;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public ArrivalStation getArrivalStation() {
        return arrivalStation;
    }

    public DispatchStation getDispatchStation() {
        return dispatchStation;
    }

    public void setDispatchTime(Date dispatchTime){
        this.dispatchTime = dispatchTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getDispatchTime(){
        return dispatchTime;
    }

    public Date getArrivalTime(){
        return arrivalTime;
    }

    public void fillTrain(Scanner scan){
        System.out.print("Enter Dispatch time and Arrival time: ");
        dispatchTime = new Date(scan.nextInt());
        arrivalTime = new Date(scan.nextInt());
    }

    @Override
    public String toString() {
        return "Train{" +
                "DispatchTime=" + dispatchTime +
                ", ArrivalTime=" + arrivalTime +
                '}';
    }
}
