package labs;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		StudentDatabase student1 = new StudentDatabase("Ivan", "833564986");
		student1.initDeposit(15000);
		student1.pay(4000);
		student1.generateEmail();
		student1.generateUserID();
		student1.setPhone("5612345678");
		student1.setCity("Seattle");
		student1.setState("Washington");
		student1.enroll("Biology", "Calculus 1", "Physics", "English");
		System.out.println(student1.toString());
		student1.checkBalance();
		System.out.println("-------------------------");
		student1.showCourses();
		
	}

}

class StudentDatabase {
	
	String emailID;
	String SSN;
	private static int iD = 100;
	String userID;
	String name;
	double balance;
	String[] courses = new String[4];
	private static String phone;
	private static String city;
	private static String state;
	
	
	
	public StudentDatabase(String name, String SSN) {
		
		this.SSN = SSN;
		this.name = name;
		iD++;
		
	}
	
	public void generateEmail() {
		
		emailID = name + "@school.edu";
		
	}
	
	public void generateUserID() {
		int random = (int) (Math.random() * 10000);
		
		userID = iD + "" + random + SSN.substring(5, 9);
			
	}
	
	public void initDeposit(double amount) {
		balance += amount;
	}
	
	public void pay(double amount) {
		balance -= amount;
	}
	
	public void enroll(String course1, String course2, String course3, String course4) {
		String[] course = {course1, course2, course3, course4};
		
		for (int i = 0; i <= 3; i++) {
			courses[i] = course[i];
		}
		
	}
		
	public void showCourses() {
		System.out.println("Your courses are as follows: " + courses[0] + ", " + courses[1] + ", " + courses[2] + ", " + courses[3]);
	}
	
	public void checkBalance() {
		System.out.println("Your balance: " + balance);
	}

	// Getters and setters
	public String getPhone() {
		return phone;
	}

	public static void setPhone(String phone) {
		StudentDatabase.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public static void setCity(String city) {
		StudentDatabase.city = city;
	}

	public String getState() {
		return state;
	}

	public static void setState(String state) {
		StudentDatabase.state = state;
	}
	
	public String toString() {
		return "[Name: " + name + "], " + "[Phone: " + phone + "], " + "[City: " + city + "], " + "[Email: " + emailID + "], " + "[UserID: " + userID + "]";
	}
	
}
