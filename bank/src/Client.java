public class Client {

    private int acout;
    private String name;
    private double cash;

    public Client(int acout, String name, double cash) {
        this.acout = acout;
        this.name = name;
        this.cash = cash;
    }

    public Client(int acout, String name) {
        this.acout = acout;
        this.name = name;
    }

    public int getAcout() {
        return acout;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void deposit(double value){
        this.cash += value;
    }
    public void withdraw(double value){
        int tax = 5;
        double valor = value - tax;
        this.cash -= valor;
    }
    public String toString(){
        return "Accout data: \n"+"Accout: "+acout+", Holder: "+name+", Balance: "+cash;
    }
}
