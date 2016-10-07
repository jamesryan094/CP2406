/**
 * Created by james on 12/09/2016.
 */
public class DemoPhoneCall {
    public static void main(String[] args) {
        IncomingPhoneCall myInCall = new IncomingPhoneCall("0400294422");
        OutgoingPhoneCall myOutCall = new OutgoingPhoneCall("0412557228", 10);
        System.out.println(myInCall.toString());
        System.out.println(myOutCall.toString());
    }
}
