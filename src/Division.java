/**
 * Created by james on 12/09/2016.
 */
public abstract class Division{
    protected String name;
    protected int accNum;

    public Division(String name, int accNum){
        this.name = name;
        this.accNum = accNum;
    }
    abstract public void display();
}
