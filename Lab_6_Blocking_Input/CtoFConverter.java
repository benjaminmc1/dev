import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int celsius;
        int fahrenheit;

        do {
            System.out.println("Enter a temperature in celsius: ");
            celsius = in.nextInt;
            if(!in.hasNextInt) {
                System.out.println("Invalid entry. Try again.");
            }
        }while(!in.hasNextInt);

        fahrenheit = (celsius * (9 / 5)) + 32;
        System.out.println("The temperature in fahrenheit is " + fahrenheit);
    }
}