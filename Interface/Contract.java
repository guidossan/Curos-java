package Interface;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
    private Integer number;
    private LocalDate data;
    private double totalValue;
    private ArrayList<Installment> installments = new ArrayList<>();
    public Contract(Integer number, LocalDate data, Double totalValue) {
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
    public LocalDate getDate() {
        return data;
    }
    public void setDate(LocalDate data) {
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
