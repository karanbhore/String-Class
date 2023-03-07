package com.prowings.practise;

public class TestString {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		String s3 = "hello";
		String s4 = new String("hello");

		System.out.println(s1.equals(s4));
		System.out.println(s1.endsWith(s3));
		System.out.println(s1.equals(s2));

		System.out.println(s1 == s2);
		System.out.println(s1 == s4);

	}

}
