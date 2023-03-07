package com.prowings.practise;

public class StringMethodPracticals {

	public static void main(String[] args) {
		String word = "Hello";
		char[] characters = word.toCharArray();
		for (char character : characters) {
			System.out.print(character + " ");
		}
		System.out.println();

		// trim method
		String msg = "Hello     ";
		System.out.println(msg.trim());

		// toUpperCase &toLowerCase method
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toLowerCase());

		// join method
		String msg1 = String.join("_", "java", "is", "cool");
		System.out.println(msg1);

		// split method
		String str5 = "apple,banana,orange";
		String[] arr = str5.split("");
		for (String wrd : arr) {
			System.out.println(wrd);
		}
		System.out.println("--------------------------------------");
		String line = "Hello java delopers welcome to java world!";
		String[] characters1 = line.split("");
		for (String chrt : characters1) {
			System.out.println(chrt);
		}

		// replace method
		String s1 = "Hello java developers";
		System.out.println(s1.replace("java", "python"));
		System.out.println(s1.replace('a', 'A'));

		// concat method
		String ss1 = "hello";
		String ss2 = "world";
		String ss3 = "Welcome";
		String ss4 = "";
		String ss5 = new String("hello");
		System.out.println(ss1.concat(ss2));
		String result = ss4.concat(ss3);
		System.out.println(ss4 == result);
		System.out.println(ss1 == ss5);
		System.out.println(ss1.equals(ss5));

		// subString method
		String message = "hello friends!";
		System.out.println(message.substring(6));

		// indexOf method
		System.out.println(message.indexOf('f'));

		// startsWith
		System.out.println(message.startsWith("i"));
		System.out.println(message.endsWith("!"));

		// equalsIgnoreCase
		String s111 = "Hello WORLD";
		String s222 = "heLLO world";
		boolean reslt = s111.equals(s222);
		System.out.println(reslt);
		System.out.println(s111.equalsIgnoreCase(s222));

		// charAt
		System.out.println(s111.charAt(6));

		// isBlank &isEmpty
		String stng = "            ";
		System.out.println(stng.trim().isEmpty());// isblank
		System.out.println(stng.isEmpty());

		// length()
		System.out.println(s222.length());

		// toString
		System.out.println(s222.toString());

		// hashCode
		System.out.println(s222.hashCode());

		// valueOf
		int i = 234;
		String a = String.valueOf(i);
		System.out.println(String.valueOf(i));
		System.out.println(a instanceof String);

		// parseInt()
		String n1 = "123";
		int n2 = Integer.parseInt(n1);
		System.out.println(n2);
		System.out.println(n1 instanceof String);

	}
}
