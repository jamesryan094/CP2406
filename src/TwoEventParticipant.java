/**
 * Created by james on 19/09/2016.
 */
public class TwoEventParticipant{
    public static void main(String[] args) {
        Participant[] runners = new Participant[2];
        Participant[] swimmers = new Participant[2];
        runners[0] = new Participant("James", 22, "jcu");
        runners[1] = new Participant("Dbagz", 21, "jcu");
        swimmers[0] = new Participant("Elena", 23, "monash");
        swimmers[1] = new Participant("Ashish", 23, "monash");


        System.out.println("Runners");
        for (int i = 0; i < 2; ++i){
            System.out.println(runners[i].toString());
        }
        System.out.println("\nSwimmers");
        for (int i = 0; i < 2; ++i){
            System.out.println((swimmers[i].toString()));
        }
    }
}
