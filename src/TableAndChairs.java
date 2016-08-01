/**
 * Display ASCII art pattern of table and chairs
 * 12*6 grid, using whitespace & 'X'
 * Created by james on 1/08/2016.
 */

public class TableAndChairs {
    public static void main (String[] args) {
        String partone = "X                    X"; //print twice
        String parttwo = "X     XXXXXXXXXX     X";
        String partthree = "XXXXX X        X XXXXX";
        String partfour = "X   X X        X X   X";//print twice
        System.out.println(partone + '\n' + partone + '\n' + parttwo + '\n' + partthree + '\n' + partfour + '\n' + partfour);

    }
}

