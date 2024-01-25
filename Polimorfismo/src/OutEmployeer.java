public class OutEmployeer extends Employeer{

    private double addValue;

    public OutEmployeer() {
        super();
    }

    public OutEmployeer(String name, Integer hours, double valuePerHour, double addValue) {
        super(name, hours, valuePerHour);
        this.addValue = addValue;
    }
    @Override
    public double payment(){
        return super.payment() + addValue * 1.1;
    }

    public double getAddValue() {
        return addValue;
    }

    public void setAddValue(double addValue) {
        this.addValue = addValue;
    }
}
