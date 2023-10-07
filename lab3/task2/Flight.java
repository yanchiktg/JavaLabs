package lab3.task2;

import java.util.Date;
import java.util.Scanner;

public class Flight implements InputOutput{
    private Train train;

    public Flight() {
        train = new Train();
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Train getTrain() {
        return train;
    }

    @Override
    public void fill(Scanner scanner) {
        train.fill(scanner);
    }

    @Override
    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "" + train;
    }
}
