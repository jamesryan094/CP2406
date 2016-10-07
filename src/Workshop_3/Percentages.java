package Workshop_3;

import java.util.Scanner;
public class Percentages {
    /**
     * Created by james on 15/08/2016.
     * takes two double as input, returns percentage
     */
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter first number");
        double numOne = keys.nextDouble();
        System.out.println("Enter second number");
        double numTwo = keys.nextDouble();
//        System.out.println("TEST\nFIRST: "+numOne +"\nSECOND: " +numTwo);
        computePercentage(numOne, numTwo);

    }

    public static void computePercentage(double numOne, double numTwo){
        double percentage = (numOne / numTwo) * 100;
        System.out.println(numOne + " is " + percentage + "% of " +numTwo);

    }
}
