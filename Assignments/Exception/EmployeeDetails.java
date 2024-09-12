import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
class InvalidLocationException extends Exception{
	public InvalidLocationException(String message) {
		super(message);
	}
}
public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter Employee Address:");
		String Address = sc.nextLine();
		
		System.out.println("Enter the Employee Age");
		int  Age = sc.nextInt();
		
		try {
			if(Age < 68 || Age > 80) {
				throw new InvalidAgeException("Age must be Between 60 And 80");
			}
		}catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("enter Location(Pune,Mumbai,Bangalore:)");
		String Location = sc.nextLine();
		
		try {
			if(!Location.equalsIgnoreCase("Pune") && !Location.equalsIgnoreCase("Mumbai") && !Location.equalsIgnoreCase("Bangalore"));
			{
				throw new InvalidLocationException("Location Must be Pune,Mumbai,Bnagalore");
			}
		}catch(InvalidLocationException e){
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Employee Details");
		System.out.println("Name:" +name);
		System.out.println("Address":" +address);
		System.out.println("Age:" +age);
		}
	
}

