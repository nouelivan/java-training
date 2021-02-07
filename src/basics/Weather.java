package basics;

public class Weather {
	
	public static void main(String[] args) {
		// This program will give suggestions on what to wear based on temperature
		
		int temperature = 85;
		String sunCondition = "Sunny";
		
		if (temperature > 80) {
			System.out.println("It's pleasant, wear shorts and a t-shirt");
		} else if ((temperature > 60) && (sunCondition != "Sunny")) {
			System.out.println("It's a little chilly, consider wearing a sweater.");
			System.out.println("Wear a hat to protect your eyes from the sun.");
		} else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("It's a little cold and cloudy, be sure to take a sweater.");
		}
			else {
		}
			System.out.println("It's freezing! Wear warm clothes!");
		}
		
		
		
	}


