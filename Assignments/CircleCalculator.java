import java.util.Scanner;

public class CircleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("The area of the circle with radius " + radius + " is: " + area);
        System.out.println("The circumference of the circle with radius " + radius + " is: " + circumference);

        sc.close();
    }
}
