package collection;

import java.util.ArrayList;
class emp {
	String name;
	int id;
	public emp(String name,int id) {
		super();
		this.name = name;
		this.id = id;
	}
@Override 
public String toString() {
	return "emp [name=" +name+ , "id=" +id+]"
}
	
}
public class Example1 {
public static void m1() {
	ArrayList a1 = new ArrayList();
	
	a1.add("abc");
	a1.add('a');
	a1.add(123);
	a1.add(123.321);
	
	System.out.println(a1.isEmpty());
	System.out.println(a1.get(2));
	System.out.println(a1.getFirst());
	System.out.println(a1.contains("abc"));
	int s =a1.size();
	System.out.println("Size" +s);
	for(int i=0;i<s;i++) {
		System.out.println(i);
	}
	for(Object o :a1) {
		System.out.println(o);
	}
	System.out.println(a1.removeLast());
	
	System.out.println("Size" +a1.size());
	
	a1.add(new emp("Sam",1));
	System.out.println(a1);
}
public static void m2() {
	ArrayList<emp> a2 = new ArrayList<emp>();
	a2.add(123);
	a2.add("abc");
	a2.add(new emp(("abc",15));
}
public static void main(String[] arg) {
	m1();
}
}
