import java.util.Scanner;

public class CharacterCheck {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character to check if it is a digit or a special symbol:");
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println("The character '" + ch + "' is a digit.");
        } else if (!Character.isLetter(ch)) {
            System.out.println("The character '" + ch + "' is a special symbol.");
        } else {
            System.out.println("The character '" + ch + "' is neither a digit nor a special symbol.");
        }
        sc.close();
    }
}
