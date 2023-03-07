package com.prowings.practise;

public class Stringmethods {
	public static void main(String[] args) {

		String msg = "Hello, World !";
		int hashCode = msg.hashCode();
		System.out.println(hashCode);
		
		String msg1="Hello, World!";
		boolean res=msg.equals(msg1);
		System.out.println(res);
		
		String msgString=msg.toString();
		System.out.println(msgString);

	}
}
