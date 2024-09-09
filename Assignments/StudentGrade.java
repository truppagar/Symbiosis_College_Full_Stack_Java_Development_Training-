package trupti;

import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the total marks: ");
        double totalMarks = sc.nextDouble();
        
        System.out.println("Enter the obtained marks: ");
        double obtainedMarks = sc.nextDouble();
        
        // Calculate the percentage
        double percentage = (obtainedMarks / totalMarks) * 100;
       
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        // Output the result
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade: " + grade);
        
        // Close the scanner
        sc.close();
    }
}

