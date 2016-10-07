/**
 * Created by james on 12/09/2016.
 */
public class DomesticDivision extends Division{
    protected String state;
    public DomesticDivision( String name, int accNum, String state){
        super(name, accNum);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Company Name: " + name + "\nAccount Number : " + accNum + "\nDOMESTIC\nState: " + state);
    }
}
