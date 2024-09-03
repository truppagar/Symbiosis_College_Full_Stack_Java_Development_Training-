import java.util.Scanner;
public class Person {
	int Id;
	String name;
	int Age;
	String address;
	public Person(int Id,String name, int Age) {
		this.Id = Id;
		this.name = name;
		this.Age = Age;
		this.address = address;
	}
	
	public void show() {
		System.out.println("Id:" +Id);
		System.out.println("Name:" +name);
		System.out.println("Age:" +Id);
		System.out.println("Address:" +Id);
		System.out.println();
	}
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		
		persons[0] = new Person(1,"Sam Autade",21);
		persons[1] = new Person(2,"Trupti Autade",21);
		persons[0] = new Person(3,"Chiu Hiray",23);
		
		for(int i=0;i<persons.length;i++) {
			System.out.println("Person" +(i+1)+ ":");
		}
	}
}
