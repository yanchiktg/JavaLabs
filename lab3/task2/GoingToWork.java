package lab3.task2;

import java.util.Date;
import java.util.Scanner;

public class GoingToWork implements InputOutput{
    private Man employee;
    private CashBox cashBox;

    public GoingToWork() {
        employee = new Employee();
        cashBox = new CashBox();
    }

    public void setMan(Employee employee) {
        this.employee = employee;
    }

    public void setCashBox(CashBox cashBox) {
        this.cashBox = cashBox;
    }

    public Man getMan() {
        return employee;
    }

    public CashBox getCashBox() {
        return cashBox;
    }

    @Override
    public void fill(Scanner scanner) {
        System.out.print("Enter Employee's fio: ");
        employee.fill(scanner);
        System.out.print("Enter cashBox: ");
        cashBox.fill(scanner);
        System.out.print("Enter Data begin and end: dd/mm/yyyy");
    }

    @Override
    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "GoingToWork - " + "employee: " + employee + "cashbox: " + cashBox;
    }
}
