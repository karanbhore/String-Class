package com.prowings.practise;

public class InnternDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2= new String("hello");
		System.out.println(s1 == s2);
		String s3 = s2.intern();
		System.out.println(s1==s3);
		System.out.println(s2.intern());
	}

}
