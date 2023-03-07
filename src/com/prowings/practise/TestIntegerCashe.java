package com.prowings.practise;

public class TestIntegerCashe {

	public static void main(String[] args) {
		Integer i1 = 128;
		Integer i2 = 128;

		Integer i3 = 127;
		Integer i4 = 127;

		Integer i5 = 321;
		Integer i6 = 321;

		System.out.println(i1 == i2);
		System.out.println(i3 == i4);
		System.out.println(i5 == i6);
		System.out.println("----------------");
		
		System.out.println(i1.equals(i6));
		

	}

}
