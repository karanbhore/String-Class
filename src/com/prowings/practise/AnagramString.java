package com.prowings.practise;

import java.util.Arrays;

public class AnagramString {

	public static boolean areAnagrams(String s1, String s2) {

		char[] chars1 = s1.toCharArray();
		char[] chars2 = s2.toCharArray();

		Arrays.sort(chars1);
		Arrays.sort(chars2);

		return Arrays.equals(chars1, chars2);

	}

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";

		if (areAnagrams(s1, s2)) {
			System.out.println(s1 + " and " + s2 + " are Anagrams ");
		} else {
			System.out.println(s1 + " " + s2 + " are not Anagrams");
		}
	}

}
