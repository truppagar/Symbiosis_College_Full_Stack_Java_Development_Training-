package collection;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

public class LinkedListOperations{
    private LinkedList<Integer> list;

    public  LinkedListOperations() {
        list = new LinkedList<>();
    }
    
    public void insertAtFirst(int data) {
        list.addFirst(data);
    }
    
    public void insertAtLast(int data) {
        list.addLast(data);
    }
    
    public boolean search(int key) {
        return list.contains(key);
    }

    public void sortList() {
        Collections.sort(list);
    }

    public void printList() {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        for (int data : list) {
            System.out.print(data + " -> ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
    	 LinkedListOperations ll = new  LinkedListOperations();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at First");
            System.out.println("2. Insert at Last");
            System.out.println("3. Search for an Element");
            System.out.println("4. Sort the List");
            System.out.println("5. Print the List");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
                continue;
            }

            if (choice == 1) {
                System.out.print("Enter the value to insert at first: ");
                if (sc.hasNextInt()) {
                    int firstValue = sc.nextInt();
                    ll.insertAtFirst(firstValue);
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    sc.next(); 
                }
            } else if (choice == 2) {
                System.out.print("Enter the value to insert at last: ");
                if (sc.hasNextInt()) {
                    int lastValue = sc.nextInt();
                    ll.insertAtLast(lastValue);
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    sc.next();
                }
            } else if (choice == 3) {
                System.out.print("Enter the value to search: ");
                if (sc.hasNextInt()) {
                    int searchValue = sc.nextInt();
                    boolean found = ll.search(searchValue);
                    System.out.println("Element " + (found ? "found" : "not found"));
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    sc.next(); 
                }
            } else if (choice == 4) {
                ll.sortList();
                System.out.println("List sorted.");
            } else if (choice == 5) {
                System.out.println("Current List:");
                ll.printList();
            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option from the menu.");
            }
        }

        sc.close();
    }
}
