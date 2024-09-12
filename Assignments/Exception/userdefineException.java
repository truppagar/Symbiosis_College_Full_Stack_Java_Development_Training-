import java.util.InputMismatchException;
import java.util.Scanner;
class userException extends Exception {
	public userException(String a) {
	super(a);
	}
}
public class userdefineException{
	public static void main(String[] args) {
		int a = -10;
		int age;
		Scanner sc = new Scanner(System.in);
		try {
			age = sc.nextInt();
			if(age<0) {
				throw new userException("user Exception");
			}else {
				throw new ArithmeticException();			}
		}catch(InputMismatchException e) {
			System.out.println("Wrong data Entry");
		}catch(userException e) {
			System.out.println("e.getMessage()");
		}catch(Exception e1) {
			System.out.println("e1.getMessage()");
		}
	}
	
}
