package lab3.task1;

import java.security.Provider;
import java.util.Scanner;

public class CashBox {
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

    public void fillCashBox(Scanner scan){
        System.out.print("Enter language: ");
        serviceLanguage = scan.nextLine();
        System.out.print("Enter number: ");
        number = scan.nextInt();
    }

    @Override
    public String toString() {
        return "CashBox{" +
                "ServiceLanguage='" + serviceLanguage + '\'' +
                ", Number=" + number +
                '}';
    }
}
