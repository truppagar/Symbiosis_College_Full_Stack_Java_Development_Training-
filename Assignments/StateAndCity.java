import java.util.Scanner;
public class StateAndCity {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String [][] StateAndCity = {{"Maharashtra","Mumbai","pune"},
									{"Gujrat","Vadodara","Ahmedabad"},
									{"Karnataka","Bengaluru","Chennai"}};
		
		for(String state : StateAndCity.keySet()) {
			System.out.println("State"+state);
			System.out.println("Cities");
			for(String city: StateAndCity.get(state))
			{
				System.out.println(" ")
			}
		}
	}
}
