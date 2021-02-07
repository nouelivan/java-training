package oop;

public class BankAccount implements IRate {

	String accountNumber;
	
	// static >> belongs to the CLASS not the object instance
	// final >> constant (often static final)
	private static final String routingNumber = "765432";
	
	// Instance Variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
		// 1. They are used to define / setup / initialize properties of an object
		// 2. Constructors are IMPLICITLY (Automatically) called upon INSTANTIATION
		// 3. The same as the class itself
		// 4. Constructors have NO return type
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	// Overloading: call same method with different arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		// initDeposit, accountType, and Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: " + "$" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1,000.";
		} else {
			Msg = "Thanks for you initial deposit of " + "$" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	
	// Getters / Setters
	// Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr." + name;
	}
	public String getName() {
		return name;
	}
	
	
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// Interface Methods
	public void setRate() {
		
	}
	
	public void increaseRate() {
		
	}

	
	// Defined methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	 void checkBalance() {
		System.out.println("Your balance is: " + "$" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ " + name + ". " + accountNumber + ". " + "BALANCE: " + "$" + balance + ".";
	}
	
}
