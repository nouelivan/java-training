package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define arrays.
		String[] cities = {"New York", "Miami", "Dallas", "San Francisco"};
		System.out.println(cities[2]);
		
		System.out.println("---------------------------------");
		
		// Declare the array and define only the size.
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Texas";
		states[2] = "Oregon";
		states[3] = "Florida";
		states[4] = "Iowa";
		int i = 0;
		
		// Do Loop: Enters the loop THEN tests condition
		do {
			System.out.println(states[i]);
			i = i + 1;
		} while (i < 5);
		
		System.out.println("---------------------------------");
		
		// While Loop: Tests condition first and then enters loop
		int n = 0;
		while (n <= 4) {
			System.out.println("STATE at " + n + " : " + states[n]);
			n++;
		}
		
		System.out.println("---------------------------------");
		
		// Declare Array
		String[] countries;
		
		// Define Array
		countries = new String[3];
		countries[0] = "Ukraine";
		countries[1] = "Canada";
		countries[2] = "Colombia";
		System.out.println(countries[2]);
		
		
		System.out.println("---------------------------------");
		
		// For Loop
		System.out.println("For Loop: ");
		for (int x = 0; i < 3; x++) {
			System.out.println(countries[x]);
		}
		
	}

}
