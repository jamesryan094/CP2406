/**
 * Created by james on 12/09/2016.
 */
public class OutgoingPhoneCall extends PhoneCall {
    protected double rate = 0.04;

    double callTime;
    public OutgoingPhoneCall(String phoneNumber, double callTime){
        super(phoneNumber);
        this.callTime = callTime;
        setPrice(rate, this.callTime);
    }

    public String toString(){
        return (super.toString() + "\nRate: $" + rate + "/minute" + "\nPrice: $" + price);
    }
}
