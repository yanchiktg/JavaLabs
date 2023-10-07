package lab3.task2;

import java.util.Locale;

public enum Stations {
    GOMEL,
    BREST,
    MINSK,
    MOGILEV,
    GRODNO;

    Stations() {
    }

    public void rusLanguage(){
        switch (this) {
            case GOMEL: System.out.println("Гомель");
            case BREST: System.out.println("Брест");
            case MINSK: System.out.println("Минск");
            case MOGILEV: System.out.println("Могилев");
            case GRODNO: System.out.println("Гродно");
        }

    }

    public void output(){
        System.out.println("Station: " + this);
    }

    @Override
    public String toString(){
        return this.name();
    }
}
