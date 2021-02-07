package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice + ".");
		}
		
		String firstName = "Ivan";
		String lastName = "Nouel";
		String SSN = "123456789";
		
		System.out.print(firstName.subSequence(0, 1));
		System.out.print(lastName.subSequence(0, 1) + ", ");
		System.out.println("The last four of your social are: " + SSN.subSequence(5, 9));

	}

}
