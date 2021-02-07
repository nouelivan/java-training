package oop;


class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking.");	
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping.");
	}
	
	
}



public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		person1.name = "Ivan";
		person1.email = "in@testemail.com";
		person1.phone = "6547862345";
		
		// Abstraction (Extract only what we want.)
		person1.walk();
	
		Person person2 = new Person();
		person2.name = "Sarah";
		
		person2.walk();
		
		
		
		
		/*	
		// Joe's Info
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "5671234545";
		
		// Sarah's Info
		String name2 = "Sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "1112329784";
		
		walking(name2);
		
		// What about binding attributes and properties together?
		

	}
	
	static void walking(String name) {
		System.out.println(name + " is walking.");
	}
*/
}
}
