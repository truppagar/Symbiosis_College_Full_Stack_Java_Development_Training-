package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example2{
    public static void main(String[] args) {
    	 //TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        
        System.out.println("Enter integers one by one. Type 'done' to finish.");

        while (true) {
            System.out.print("Enter an integer: ");
            String input = sc.nextLine();
            if (input.equals("done")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                integers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        System.out.println("You entered the following integers:");
        for (int number : integers) {
            System.out.println(number);
        }

        sc.close();
    }
}

