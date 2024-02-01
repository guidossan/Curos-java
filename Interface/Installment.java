package Interface;


import java.sql.Date;
import java.time.format.DateTimeFormatter;

public class Installment{
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Date dueDate;
    private double amount;
    public Installment(Date dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }
    public Date getDueDate() {
        return dueDate;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return  dueDate.format(fmt) + " - " + String.format("%.2f", amount);
    }

    
}