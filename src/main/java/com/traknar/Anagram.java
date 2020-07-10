package com.traknar;

public class Anagram {
	public static String createAnagram(String inpitString) {
		String[] massOfWords = inpitString.split("\\s");	
		StringBuilder outputString = new StringBuilder();
		for (String s : massOfWords) {
			outputString.append(Anagram.reverceString(s) + " ");
		}
		outputString.deleteCharAt(outputString.length()-1);
		return outputString.toString();
	}
	public static String reverceString(String word) {
		StringBuilder SWord = new StringBuilder(word);
		StringBuilder TWord = new StringBuilder();
		for (int i = SWord.length() - 1; i >= 0; i--) {
			if (Character.isLetter(SWord.charAt(i))) {
				TWord.append(SWord.charAt(i));
			}
		}
		int count = 0;
		for (int i = 0; i <= SWord.length() - 1; i++) {
			if (Character.isLetter(SWord.charAt(i))) {
				SWord.setCharAt(i, TWord.charAt(count));
				count++;
			}
		}
		String reverceWord = SWord.toString();
		return reverceWord;
	}
}
