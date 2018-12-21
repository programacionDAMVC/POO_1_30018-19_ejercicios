package com.iesvirgendelcarmen.com.Palabra;

public class Palabra {
	private String valueOfWord;

	public Palabra(String valueOfWord) {
		this.valueOfWord = valueOfWord;
	}
	public String getValueOfWord() {
		return valueOfWord;
	}
	public String getUpperWord() {
		return valueOfWord.toUpperCase();
	}
	public String getLowerWord() {
		return valueOfWord.toLowerCase();
	}
	public int getNumberOfLetter() {
		return valueOfWord.length();
	}
	public String replaceLettersOfWord(char oldLetter, char newLetter) {
		return valueOfWord.replace(oldLetter, newLetter);
	}
	public char getFirstLetterOfWord() {
		return valueOfWord.charAt(0);
	}
	
}
