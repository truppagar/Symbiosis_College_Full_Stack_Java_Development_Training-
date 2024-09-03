import java.util.Scanner;

public class AsciiValue{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character to find its ASCII value:");
        char ch = sc.next().charAt(0);
        int asciiValue = (int) ch;

        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);

        sc.close();
    }
}
