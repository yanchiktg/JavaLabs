package lab3.task2;

import java.util.Scanner;

public class CashBox implements InputOutput{
    private String serviceLanguage;
    private int number;

    public CashBox() {
        serviceLanguage = "";
        number = 0;
    }

    public CashBox(String serviceLanguage, int number) {
        this.serviceLanguage = serviceLanguage;
        this.number = number;
    }

    public void setServiceLanguage(String serviceLanguage) {
        this.serviceLanguage = serviceLanguage;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getServiceLanguage() {
        return serviceLanguage;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void fill(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Enter language: ");
        serviceLanguage = scanner.nextLine();
        System.out.print("Enter number of cashbox: ");
        number = scanner.nextInt();
    }

    @Override
    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CashBox: " +
                "\nServiceLanguage = " + serviceLanguage +
                "\nNumber of cashbox = " + number;
    }
}
