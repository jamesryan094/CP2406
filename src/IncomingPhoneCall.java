/**
 * Created by james on 12/09/2016.
 */
public class IncomingPhoneCall extends PhoneCall{
    protected double rate = 0.02;
    public IncomingPhoneCall(String phoneNumber){
        super(phoneNumber);
        setPrice(rate, 1);
    }

    public String toString(){
        return(super.toString() + "\nRate: $" + rate + "/minute" + "\nPrice: $" + price);
    }
}
