import java.util.Scanner;
import java.lang.Math;

public class WholeNumbers {
    public static void main(String[] args) {
        //initializing variables
        float input = 0;
        //Create a new scanner to take input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a floating point number");
        //Scanner gets next floating point number
        input = scan.nextFloat();
        //variables are initialized and the Math package is used to calculate the floor and ceiling of the input
        int low = (int) Math.floor((double) input);
        int high = (int) Math.ceil((double) input);
        //The output is printed to the console
        System.out.println("The high number is: " + high);
        System.out.println("The low number is: " + low );
    }
}
