package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudentsInfo{
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student address: ");
        String address = sc.nextLine();

        System.out.print("Enter student standard: ");
        String standard = sc.nextLine();

        Student student = new Student(id, name, address, standard);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("\nStudent List:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    static class Student {
        private int id;
        private String name;
        private String address;
        private String standard;

        public Student(int id, String name, String address, String standard) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.standard = standard;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getStandard() {
            return standard;
        }

        public void setStandard(String standard) {
            this.standard = standard;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Address: " + address + ", Standard: " + standard;
        }
    }
}
