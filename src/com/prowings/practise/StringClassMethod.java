package com.prowings.practise;

public class StringClassMethod {
	public static void main(String[] args) {

//		replace method

		String msg = "mesquite";
		System.out.println(msg.replace('e', 'o'));

		String msg1 = "hello java developers welcome to java world";
		System.out.println(msg1.replace("java", "python"));
		System.out.println();

//		split method

		String text = "apple,banana,orange";
		String[] words = text.split(",");
		for (String wrd : words) {
			System.out.print(wrd + " ");
		}

//		String s1="hello java developers welcome to java world!";
//		String[] words1=s1.split(" ");
//		for(String word:words1) {
//			System.out.println(word);
//		}

	}

}
