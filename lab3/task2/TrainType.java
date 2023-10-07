package lab3.task2;

public enum TrainType {
    RESERVED_SEAT(50),
    SHARED(25),
    COMPARTMENT(30),
    SV(10),
    SITTING(40);

    private int amountPlaces;

    TrainType(int amountPlaces) {
        this.amountPlaces = amountPlaces;
    }

    public int getAmountPlaces() {
        return amountPlaces;
    }

    public void amountPlus(int col){
        switch (this){
            case RESERVED_SEAT: this.amountPlaces += col;
            case SHARED: this.amountPlaces += col;
            case SITTING: this.amountPlaces += col;
            default:
        }
    }

    @Override
    public String toString() {
        return this.name();
    }
}
