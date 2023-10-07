package lab3.task2;

import java.util.Scanner;

public abstract class Man implements InputOutput{
    private String fio;

    public Man() {
        fio = "";
    }

    public Man(String fio) {
        this.fio = fio;
    }

    public void setFio(String fio){
        this.fio = fio;
    }
    public String getFio(){
        return fio;
    }

    @Override
    public void fill(Scanner scanner) {
        System.out.print("fio: ");
        fio = scanner.nextLine();
    }

    @Override
    public void output() {
        System.out.println(this);
    }

    public abstract void aboutMe();

    @Override
    public String toString() {
        return "fio = " + fio;
    }
}
