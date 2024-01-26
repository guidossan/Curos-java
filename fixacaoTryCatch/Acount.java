package fixacaoTryCatch;
public class Acount {
    private Integer number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Acount(Integer number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount) throws Exception{
        if(amount > withdrawLimit){
            throw new Exception("The withdraw limit pass");
        }
        balance -= amount;
    }
    @Override
    public String toString(){
        return ": "
        +balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
