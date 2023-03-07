package com.prowings.practise;

public class StringMethodDemo1 {
	public static void main(String[] args) {
		String msg = "Hello, World!";
		int hashCode = msg.hashCode();
		System.out.println(hashCode);
		System.out.println();

		String msg1 = "Hello, world!";
		boolean res = msg.equals(msg1);
		System.out.println(res);
		System.out.println();

		String StringMsg = msg.toString();
		System.out.println(StringMsg);
		System.out.println();

		int MsgLength = msg.length();
		System.out.println(MsgLength);
		System.out.println();

		boolean msgIsEmpty=msg.isEmpty();
		System.out.println(msgIsEmpty);
		System.out.println();
		String msg2="";
		System.out.println(msg2.isEmpty());
		System.out.println();
		String msg3="     ";
		System.out.println(msg3.isEmpty());System.out.println();
		String msg4=null;
//		System.out.println(msg4.isEmpty());
		System.out.println();

		System.out.println(msg3.trim().isEmpty());
		String msg5="\n \t";
		System.out.println(msg5.isEmpty());
		System.out.println(msg5.trim().isEmpty());
		System.out.println();
		
		System.out.print(msg.charAt(4));
		System.out.print(msg.charAt(5));
		System.out.print(msg.charAt(6));
		System.out.print(msg.charAt(7));
		System.out.println();
		
		String msg6="hello, WoRLD! ";
		System.out.println(msg.equalsIgnoreCase(msg6));
		System.out.println();
		
		System.out.println(msg6.startsWith(" "));
		System.out.println(msg6.endsWith("!"));
		
		System.out.println(msg6.indexOf("o"));
		System.out.println(msg6.indexOf("ch"));
		System.out.println(msg6.lastIndexOf("o"));
		
		System.out.println(msg6.hashCode());
	
	
	
	
	
	
	
	
	}
}
