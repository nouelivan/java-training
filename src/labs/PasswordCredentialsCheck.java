package labs;

public class PasswordCredentialsCheck extends ReadPassword {

	public void checkPasswordLetters(String[] password) {
		int x = 0;

		while (x < 13) {
			int z = 0;

			if (x == 13) {
				return;
			}

			for (z = 0; z < 13; z++) {

				if (Character.isLetter(password[x].charAt(z)) == true) {

					System.out.println("You've got a letter!");
					return;

				} else {
					System.out.println("ERROR: You're missing a letter!");
					return;
				}
			}
		}

	}

	public void checkPasswordNumbers(String[] password) {
		int x = 0;

		while (x < 13) {
			int z = 0;

			if (x == 13) {
				return;
			}

			for (z = 0; z < 13; z++) {

				if (Character.isDigit(password[x].charAt(z)) == true) {

					System.out.println("You've got a number!");
					return;
				} else {
					System.out.println("ERROR: You're missing a number!");
					return;
				}
			}
		}

	}

	public void checkPasswordSpecialChar(String[] password) {
		int x = 0;

		while (x < 13) {
			int z = 0;

			if (x == 13) {
				return;
			}

			for (z = 0; z < 13; z++) {

				if (password[z].equals("@") || password[z].equals("!") || password[z].equals("#")) {

					System.out.println("You've got a special character!");
					return;

				} else {
					System.out.println("ERROR: You're missing a special character!");
					return;
				}
			}
		}

	}

}
