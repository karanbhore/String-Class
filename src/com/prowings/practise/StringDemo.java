package com.prowings.practise;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);

		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str2));

	}

}
