import java.util.Scanner;
import java.lang.Math;

public class RectangleInfo {
    public static void main(String[] args) {
        int length;
        int width;
        double area;
        double perimeter;
        double pythagorean;

        do {
            System.out.println("Enter the length of a rectangle: ");
            length = in.nextInt();
            if(!in.hasNextInt()) {
                System.out.println("Invalid entry. Try again.");
            }
        }while(!in.hasNextInt());

        do {
            System.out.println("Enter the width of the rectangle: ");
            width = in.nextInt();
            if(!in.hasNextInt()) {
                System.out.println("Invalid entry. Try again.");
            }
        }while(!in.hasNextInt());

        area = length * width;
        System.out.println("The area of the rectangle is " + area);

        perimeter = (2 * length) + (2 * width);
        System.out.println("The perimeter of the rectangle is " + perimeter);

        pythagorean = Math.sqrt((length ** 2) + (width ** 2));
    }
}