import java.util.*;
public class ArithmaticOperationsMenuDriven {

	public static void main(String[] args) { 			
		
		int num_1,num_2;
		char choice;							
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number:-\t"); 
		num_1=sc.nextInt();
		
		System.out.println("Enter second number:-\t"); 
		num_2=sc.nextInt();	
		
		do												
		{
			System.out.println("MENU");					 
			System.out.println("1.Addition (+)");
			System.out.println("2.Subtraction (-)");
			System.out.println("3.Multiplication (*)");
			System.out.println("4.Division (/)");
			System.out.println("5.Exit ($)");
			System.out.println("Enter your Choice");
			choice=sc.next().charAt(0);						
			
			switch(choice)
			{
					case '+':System.out.println("Sum of "+num_1+" and "+num_2+" is "+(num_1+num_2)); 
							break;
							
					case '-':System.out.println("Subtraction of "+num_1+" and "+num_2+" is "+(num_1-num_2));	
							break;
							
					case '*':System.out.println("Multiplication of "+num_1+" and "+num_2+" is "+(num_1*num_2));
							break;
						
					case '/':System.out.println("Division of "+num_1+" and "+num_2+" is "+(num_1/num_2));		
							break;
					
					default:System.out.println("Invalid Choice or May Select Exit");
							break;
				
			}
		}while(choice!='$');							
		
	}

}
