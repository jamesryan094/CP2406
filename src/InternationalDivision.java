/**
 * Created by james on 12/09/2016.
 */
public class InternationalDivision extends Division{
    String country;
    String nativeLanguage;

    public InternationalDivision(String name, int accNum, String country, String nativeLanguage){
        super(name, accNum);
        this.country = country;
        this.nativeLanguage = nativeLanguage;
    }

    @Override
    public void display() {
        System.out.println("Company Name: " + name + "\nAccount Number : " + accNum + "\nINTERNATIONAL\nCountry: " + country + "\nNative Language: " + nativeLanguage);
    }
}
