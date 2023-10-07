package lab3.task1;

import java.util.Date;
import java.util.Scanner;

public class GoingToWork {
    private Employee employee;
    private CashBox cashBox;
    private Date dateBegin;
    private Date dateEnd;

    public GoingToWork() {
        dateBegin = null;
        dateEnd = null;
    }

    public GoingToWork(Date dateBegin, Date dateEnd) {
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setCashBox(CashBox cashBox) {
        this.cashBox = cashBox;
    }

    public Employee getEmployee() {
        return employee;
    }

    public CashBox getCashBox() {
        return cashBox;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void fillGoingToWork(Scanner scan){
        System.out.print("Enter Data begin and end: dd/mm/yyyy");
        dateBegin = new Date(scan.nextInt());
        dateEnd = new Date(scan.nextInt());
    }

    @Override
    public String toString() {
        return "GoingToWork{" +
                "DateBegin=" + dateBegin +
                ", DateEnd=" + dateEnd +
                '}';
    }
}
