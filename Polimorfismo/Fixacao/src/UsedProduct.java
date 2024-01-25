import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactured;

    public UsedProduct(String name, double price, Date manufactured) {
        super(name, price);
        this.manufactured = manufactured;
    }
    @Override
    public String priceTag(){
        return super.getName() + "(used)     $ " +super.getPrice()+"(Manufactured date: "+manufactured+")";
    }

    public Date getManufactured() {
        return manufactured;
    }

    public void setManufactured(Date manufactured) {
        this.manufactured = manufactured;
    }
}
