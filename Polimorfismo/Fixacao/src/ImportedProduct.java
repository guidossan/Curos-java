public class ImportedProduct extends Product{
    private double customFee;

    public ImportedProduct() {

    }

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }
    @Override
    public String priceTag(){
        return super.getName() + " $ " +super.getPrice()+"(Custom fee: $"+customFee+")";
    }

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }
}
