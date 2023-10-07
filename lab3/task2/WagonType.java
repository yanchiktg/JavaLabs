package lab3.task2;

public enum WagonType {
    PASSENGER(20),
    HIGHSPEED(8),
    TOURIST(15),
    EXPRESS(10);

    private int numberOfWagons;

    WagonType(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void numberPlus(int col){
        switch (this){
            case PASSENGER: this.numberOfWagons += col;
            case TOURIST: this.numberOfWagons += col;
            default:
        }
    }

    public void numberMinus(int col){
        switch (this){
            case PASSENGER: this.numberOfWagons -= col;
            case TOURIST: this.numberOfWagons -= col;
            default:
        }
    }

    public String chooseWType(String inputWagonType){
        System.out.println("input wagonType: ");
        WagonType[] values = WagonType.values();
        for (WagonType value : values) {
            System.out.println(value.ordinal() + " " + value.name());
        }

        String name = null;

        switch (inputWagonType){
            case "0" :
            case "PASSENGER" :
                name = "PASSENGER"; break;
            case "1":
            case "HIGHSPEED":
                name = "HIGHSPEED"; break;
            case "2":
            case "TOURIST":
                name =  "TOURIST"; break;
            case "3":
            case "EXPRESS":
                name = "EXPRESS"; break;
        }

        return name;
    }

    @Override
    public String toString() {
        return "WagonType = " + this.name();
    }
}
