/**
 * Created by james on 13/09/2016.
 */
public class PhoneCallArray {

    public static void main(String[] args) {
        PhoneCall[] phoneCalls = new PhoneCall[10];
        for (int i = 0; i < 10; ++i){
            if (i%2==0){
                phoneCalls[i] = new IncomingPhoneCall("in" + i);
            }
            else{
                phoneCalls[i] = new OutgoingPhoneCall("Out" + i, i);
            }
        }
        for (int i = 0; i < 10; ++i){
            System.out.println(phoneCalls[i].toString());
        }
    }

}
