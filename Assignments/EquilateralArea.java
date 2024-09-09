package trupti;
import java.util.Scanner;
public class EquilateralArea{

	    public static void main(String[] args) {
	        Scanner sc= new  Scanner(System.in);
	      
	        System.out.print("Enter the length of the side of the equilateral triangle: ");
	        double sideLength = sc.nextDouble();
	     
	        double area = calculateArea(sideLength);
	      
	        System.out.printf("The area of the equilateral triangle is: %.2f\n", area);
	   
	        sc.close();
	    }

	    public static double calculateArea(double side) {
	        return (Math.sqrt(3) / 4) * side * side;
	    }
}
