package labs;

import java.util.List;

public class CreditCardCalculator extends CreditCardStatementReader{
	
	public static void main(String[] args) {
	

}

	public static void calculateBalance(List<String[]> data) {
		int x = 2;
		int y = 4;
		
		while (x <= 34) {
		if (data.get(x).equals("CREDIT")) {
			
			System.out.println("CREDIT");
			
			x += 4;
			
		} else if (data.get(x).equals("DEBIT")) {
			
			System.out.println("DEBIT");
			
			x += 4;
		}
		
		}
		
	}
		
	}

