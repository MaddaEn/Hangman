package ro.finalProject;

import java.util.ArrayList;
import java.util.List;

public class Hangman {

	private static final int MAX_TRIES = 6;

	private String word;
	private int attempts;
	private List<Character> guessed = new ArrayList<>();

	public Hangman(String word) {
		this.word = word;
	}

	public void start() {
		showHiddenWord();
	}

	public void showHiddenWord() {
		System.out.println(getHiddenWord());
	}

	public String getHiddenWord() {
		String hidden = "";
		for (Character c : word.toCharArray()) {
			if (c.equals(' ') || guessed.contains(c)) {
				hidden += c;
			} else {
				hidden += "_";
			}
		}
		return hidden.replaceAll("", " ");
	}

	public void guessChar(Character c) {
		if (!hasTries()) {
			System.out.println();
			System.out.println("No more tries!");
			return;
		}

		if (guessed.contains(c)) {
			System.out.println();
			System.out.println("Already guessed the character " + c);
			return;
		}

		if (word.toLowerCase().contains(c.toString().toLowerCase())) {
			guessed.add(c.toString().toLowerCase().charAt(0));
			guessed.add(c.toString().toUpperCase().charAt(0));
		} else {
			attempts++;
			showHangman();
			showAttempts();
		}

		showHiddenWord();
	}

	public boolean hasTries() {
		return attempts < MAX_TRIES;
	}

	public boolean isWin() {
		return !getHiddenWord().contains("_");
	}

	public void showAttempts() {
		System.out.println();
		System.out.println("You have " + (MAX_TRIES - attempts) + " more tries!");
		System.out.println();
	}

	public void showHangman() {
		switch (attempts) {
		case 0:
			System.out.println("--------");
			System.out.println("|      |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|-------------|");
			System.out.println("|-------------|");
			break;
		case 1:
			System.out.println("--------");
			System.out.println("|      |");
			System.out.println("|      O");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|-------------|");
			System.out.println("|-------------|");
			break;
		case 2:
			System.out.println("--------");
			System.out.println("|      |");
			System.out.println("|      O");
			System.out.println("|     /");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|-------------|");
			System.out.println("|-------------|");
			break;
		case 3:
			System.out.println("--------");
			System.out.println("|      |");
			System.out.println("|      O");
			System.out.println("|     / \\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|-------------|");
			System.out.println("|-------------|");
			break;
		case 4:
			System.out.println("--------");
			System.out.println("|      |");
			System.out.println("|      O");
			System.out.println("|     /|\\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|-------------|");
			System.out.println("|-------------|");
			break;
		case 5:
			System.out.println("--------");
			System.out.println("|      |");
			System.out.println("|      O");
			System.out.println("|     /|\\");
			System.out.println("|     /");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|-------------|");
			System.out.println("|-------------|");
			break;
		case 6:
			System.out.println("--------");
			System.out.println("|      |");
			System.out.println("|      O");
			System.out.println("|     /|\\");
			System.out.println("|     / \\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|-------------|");
			System.out.println("|-------------|");
			break;
		}
	}
}

