import java.util.Scanner;
import java.lang.Math;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double meter;
        double miles;
        double feet;
        double inches;

        do {
            System.out.println("Enter a measurement in meters: ");
            meter = in.nextDouble();
            if(!in.hasNextDouble()) {
                System.out.println("Invalid entry. Try again.");
            }
        }while(!in.hasNextDouble());

        miles = meter / 1609;
        System.out.println("The measurement in miles is " + miles);

        feet = meter * 3.281;
        System.out.println("The measurement in feet is " + feet);

        inches = meter * 39.37;
        System.out.println("The measurement in inches is " + inches);
    }
}