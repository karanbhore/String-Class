package com.prowings.practise;

import java.util.Objects;

public class ProStudent2 {

	int roll;
	String name;

	public ProStudent2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProStudent2(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProStudent2 [roll=" + roll + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		int res = 1;
		res = roll * 31 + name.hashCode() * 31;

		return res;
	}

	@Override
	public boolean equals(Object obj) {

		ProStudent2 other = (ProStudent2) obj;
		boolean res = false;
		return res;
	}

	public static void main(String[] args) {
		ProStudent2 obj = new ProStudent2(10, "Sham");
		ProStudent2 obj2 = new ProStudent2(20, "Ram");
		System.out.println(obj);
		System.out.println(obj.equals(obj));
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println("----------------------------------");
		System.out.println(obj2);
		System.out.println(obj2.equals(obj));
		System.out.println(obj2.hashCode());
		System.out.println(obj2.toString());
        System.out.println("-------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
