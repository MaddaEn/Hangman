package ro.finalProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean playAnother = false;
		do {
			showWelcome();

			System.out.println("Type your word:");
			String word = scan.nextLine();
			clearScreen();
			showWelcome();

			Hangman hangman = new Hangman(word);
			hangman.start();

			do {
				System.out.println();
				System.out.println("Guess a character: ");
				String guess = scan.nextLine();

				hangman.guessChar(guess.charAt(0));

				if (hangman.isWin()) {
					showWin();
				}
				if (!hangman.hasTries()) {
					showLost();
				}
			} while (hangman.hasTries() && !hangman.isWin());

			System.out.println("Play another? [Y/N]");
			String playAnotherResponse = scan.nextLine();
			playAnother = playAnotherResponse.equalsIgnoreCase("Y");
		} while (playAnother);

		scan.close();

	}

	private static void showWelcome() {
		System.out.println();
		System.out.println("***************************");
		System.out.println("*   Let's play hangman!   *");
		System.out.println("***************************");
		System.out.println();
	}

	private static void showWin() {
		System.out.println();
		System.out.println("***************************");
		System.out.println("*        You won!         *");
		System.out.println("***************************");
		System.out.println();
	}

	private static void showLost() {
		System.out.println();
		System.out.println("***************************");
		System.out.println("*      You're hanged!     *");
		System.out.println("***************************");
		System.out.println();
	}

	private static void clearScreen() {
		System.out.print("\033[H\033[2J");
	}

}

