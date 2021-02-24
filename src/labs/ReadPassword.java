// Still working on this, not yet finished. 
package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadPassword {
	
	// Still working on this, not yet finished. 

	public static void main(String[] args) {
		String filename = "/Users/anacarrasco/Downloads/Password Read Java Practice.txt";
		String text = null;
		String[] passwords = new String[13];

		File file = new File(filename);

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			int i = 0;

			while ((text = br.readLine()) != null) {
				passwords[i] = text;
				System.out.print(passwords[i] + ", ");
				i++;
			}

			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("\nFinished reading file!\n");
			System.out.println("--------------------------------------");
		}

		// Creating Instance
		PasswordCredentialsCheck obj = new PasswordCredentialsCheck();

		obj.checkPasswordLetters(passwords);

		obj.checkPasswordNumbers(passwords);

		obj.checkPasswordSpecialChar(passwords);

	}

}
