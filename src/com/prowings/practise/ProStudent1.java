package com.prowings.practise;

import java.util.Objects;

public class ProStudent1 {

	int roll;
	String name;

	public ProStudent1(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProStudent1 [roll=" + roll + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		int res = 1;
		res = (roll * 31) + (name.hashCode() * 31);

		return res;
	}

	@Override
	public boolean equals(Object obj) {
		ProStudent1 other = (ProStudent1) obj;
		boolean res = false;

		if (this.roll == other.roll)
			;
		if (this.name.equals(other.name)) {
			res = true;
		} else
			res = false;
		return res;
	}

	public static void main(String[] args) {
		ProStudent1 obj = new ProStudent1(10, "Ram");

		System.out.println(obj.equals(obj));
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());

	}

}
