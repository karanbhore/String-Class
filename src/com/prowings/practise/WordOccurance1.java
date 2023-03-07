package com.prowings.practise;

public class WordOccurance1 {

	public static void main(String[] args) {
		String line = "india is my country india have 27 states india is beautiful country";

		String[] words = line.split(" ");

		int wordCount = 0;

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					wordCount++;
				}
			}
			System.out.println(words[i] + "occured" + wordCount + "times");
			wordCount = 0;
		}

	}

}
