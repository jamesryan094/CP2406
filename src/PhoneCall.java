/**
 * Created by james on 12/09/2016.
 */
public abstract class PhoneCall {

    protected String phoneNumber;
    protected double price;
    protected double rate = 0.00;

    public PhoneCall(String phoneNumber){
        this.phoneNumber = phoneNumber;
        price = 0.00;
    }


    public void setPrice(double price, double callTime) {
        this.price = price*callTime;
    }

    public double getPrice() {
        return price;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString(){
        return ("Phone number: " + phoneNumber);
    }

}
