package com.prowings.practise;

public class StringPalindrome {

	public static void main(String[] args) {
		String input = "Radar";
		boolean result = isPalindrome(input);
		System.out.println(result);
		
		String a="mandar";
		System.out.println();

	}

	private static boolean isPalindrome(String original) {
		String reversedString = "";
		StringBuffer sb = new StringBuffer(original);
		sb.reverse();
		reversedString = new String(sb);
		System.out.println(reversedString);

		return original.equalsIgnoreCase(reversedString) ? true : false;

	}

}
