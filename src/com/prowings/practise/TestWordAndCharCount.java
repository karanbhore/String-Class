package com.prowings.practise;

import java.util.Arrays;

public class TestWordAndCharCount {
	public static void main(String[] args) {
		String line = "India is my country india have 27 states india is beautiful";

		String[] words = line.split("");

		System.out.println("Total number of words :" + words.length);
		int length = 0;
		for (String wrd : words) {
			length = length + wrd.length();
		}
		System.out.println("Total no of chars :" + length);
		char[] characters = new char[length];

		int pos = 0;
		for (String word : words) {
			for (char character : word.toCharArray()) {
				characters[pos] = character;
				pos++;
			}
		}
		System.out.println(Arrays.toString(characters));

	}
}
