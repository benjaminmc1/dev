import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons;
        double milesPerGallon;
        double pricePerGallon;
        double priceFor100;
        double miles;

        do {
            System.out.println("Enter the amount of gallons within the tank: ");
            gallons = in.nextDouble();
            if (!in.hasNextDouble()) {
                System.out.println("Invalid entry. Try again.");
            }
        }while(!in.hasNextDouble());

        do {
            System.out.println("Enter the miles per gallon: ");
            milesPerGallon = in.nextDouble();
            if (!in.hasNextDouble()) {
                System.out.println("Invalid entry. Try again.");
            }
        }while(!in.hasNextDouble());

        do {
            System.out.println("Enter the price per gallon: ");
            pricePerGallon = in.nextDouble();
            if (!in.hasNextDouble()) {
                System.out.println("Invalid entry. Try again.");
            }
        }while(!in.hasNextDouble());

        miles = milesPerGallon * gallons;
        priceFor100 = ((pricePerGallons * gallons) / miles) * 100;

        System.out.println("The price for 100 miles is $" + priceFor100);
    }
}