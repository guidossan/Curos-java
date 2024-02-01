package Interface;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
    private Integer number;
    private LocalDate data;
    private double totalValue;
    private ArrayList<Installment> installments = new ArrayList<>();
    public Contract(Integer number, Date data, Double totalValue) {
        this.number = number;
        this.data = data;
        this.totalValue = totalValue;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public Date getDate() {
        return data;
    }
    public void setDate(Date data) {
        this.data = data;
    }
    public Double getTotalValue() {
        return totalValue;
    }
    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
    public ArrayList<Installment> getInstallments() {
        return installments;
    }
    
}
