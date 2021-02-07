package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "87651234";
		
		
		
		// Polymorphism through overloading. 
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "87651234";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5745.00);
		acc3.accountNumber = "87651234";
		acc3.checkBalance();
		
		
		
		
		System.out.println("-------------------------");
		
		// cd1.name = "James";
		// With Encapsulation
		acc1.setName("Ivan Nouel");
		System.out.println(acc1.getName());
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.accountType = "CD Account";
		
		// Polymorphism through overriding. 
		System.out.println(cd1.toString());
		
		
		

	}

}
