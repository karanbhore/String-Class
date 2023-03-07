package com.prowings.practise;

import java.util.Arrays;

public class TestStringWordAndCharCount3 {
public static void main(String[] args) {
	String line ="India is my country india have 27 states";
	
	String lineWithoutSpace=line.replace(" ","");
	
	String [] words =line.split(" ");
	
	char[] characters =new char[lineWithoutSpace.length()];
	
	int preWrdLength=0;
	for(String word:words) {
		System.arraycopy(word.toCharArray(), 0, characters, preWrdLength, word.length());
		preWrdLength += word.length();		
	}
	System.out.println(Arrays.toString(characters));
	
	
	
	
	
	
	
	
	
}
}
