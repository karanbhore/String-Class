package com.prowings.practise;

public class TestString3 {

	public static void main(String[] args) {

		String s1 = new String("hello");
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = ("helloworld");

		System.out.println(">>>>>>>>length :" + s1.length());

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

		System.out.println("-----------------");

		String s5 = "";
//		String s6=null;
		String s7 = "null";
		String s8 = "             ";

		System.out.println(s5.isEmpty());
//		System.out.println(s6.isEmpty());
		System.out.println(s7.isEmpty());
		System.out.println(s8.isEmpty());

		System.out.println(s5.trim().isEmpty());
//		System.out.println(s6.isBlank());
		System.out.println(s7.trim().isEmpty());
		System.out.println(s8.trim().isEmpty());

		System.out.println(s2.charAt(0));

		String str1 = "India";
		String str2 = "india";

		System.out.println(str1.equalsIgnoreCase(str2));

		String str3 = "123Ind1234Best";
		System.out.println(str3.startsWith("Ind", 3));
		System.out.println(str3.endsWith("Best"));

		System.out.println(str2.indexOf('z'));
		System.out.println(str2.lastIndexOf('i'));

	}

}
