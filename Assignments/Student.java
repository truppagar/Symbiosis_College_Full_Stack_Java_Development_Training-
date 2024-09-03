import java.util.*;

public class Student {

    int physics, chemistry, maths, english, biology;

    public static void main(String[] args) {

        int numOfSubjects, totalMarks = 0;
        String[] subjectList;
        int[] marksPerSubject;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String studentName = sc.nextLine();

        System.out.println("How many Subjects?");
        numOfSubjects = sc.nextInt();
      
        subjectList = new String[numOfSubjects];
        marksPerSubject = new int[numOfSubjects];

        sc.nextLine(); 
        
        System.out.println("Enter names of your Subjects:");
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.println("Subject " + (i + 1) + " :");
            subjectList[i] = sc.nextLine();
        }

        for (int i = 0; i < numOfSubjects; i++) {
            System.out.println("Enter Marks(out of 100) for subject " + subjectList[i] + " : ");
            marksPerSubject[i] = sc.nextInt();
            totalMarks += marksPerSubject[i];
        }

        double avgMarks = (double) totalMarks / numOfSubjects;

        System.out.println(studentName + ", your percentage is " + avgMarks + "%");

        if (avgMarks >= 85) {
            System.out.println("You got A+ Grade");
        } else if (avgMarks >= 75) {
            System.out.println("You got A Grade");
        } else if (avgMarks >= 65) {
            System.out.println("You got B+ Grade");
        } else if (avgMarks >= 55) {
            System.out.println("You got B Grade");
        } else if (avgMarks >= 45) {
            System.out.println("You got C+ Grade");
        } else if (avgMarks >= 35) {
            System.out.println("You got C Grade");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
