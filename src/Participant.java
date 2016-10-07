/**
 * Created by james on 12/09/2016.
 */
public class Participant {
    String name, address;
    int age;
    public Participant(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString(){
        return("Name: " + name + "\nAge: " + age + "\nAddress; " + address);
    }

    public boolean equals(Participant otherParticipant){
        if (this.name.equals(otherParticipant.name) && (this.age == otherParticipant.age) && (this.address.equals(otherParticipant.address))){
            return true;
        }
        else{
            return false;
        }
    }

}
