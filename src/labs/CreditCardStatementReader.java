// Still working on this
package labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreditCardStatementReader {

	public static void main(String[] args) {
		List<String[]> data = new ArrayList<String[]>();
		String filename = "/Users/anacarrasco/Downloads/CreditCardStatement.csv";
		String dataRow;
		double balance = 25000;
		
		
		try {
			// Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			// Read the data as long as it's not empty
			while ((dataRow = br.readLine()) != null) {
				// Parse the data by commas
				String[] line = dataRow.split(",");
				// Add the data to the collection
				data.add(line); 
				}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String[] accounts : data) {
			System.out.print("[ ");
			for (String field : accounts) {
				System.out.print(field + " ");
			}
			System.out.println(" ]");
		}
		
		
		//CreditCardCalculator.calculateBalance(data);

	}

}
