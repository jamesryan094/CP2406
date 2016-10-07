/**
 * Created by james on 12/09/2016.
 */
public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision myIntDiv = new InternationalDivision("PepsiCo", 100, "Australia", "English");
        DomesticDivision myDomDiv = new DomesticDivision("Coca Cola", 101, "Qld");
        myIntDiv.display();
        myDomDiv.display();
    }
}
