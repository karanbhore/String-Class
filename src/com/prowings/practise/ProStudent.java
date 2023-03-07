package com.prowings.practise;

import java.util.Objects;

public class ProStudent {

	int roll;
	String name;

	public ProStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProStudent(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProStudent [roll=" + roll + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		int res = 0;
		res = roll * 31 + name.hashCode() * 31;
		return res;

	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		ProStudent other = (ProStudent) obj;
//		return Objects.equals(name, other.name) && roll == other.roll;
		boolean res = false;
		if (this.roll == other.roll) {
			if (this.name.equals(other.name))
				res = true;
		} else
			res = false;
		return res;

	}

	public static void main(String[] args) {
		ProStudent obj = new ProStudent(10, "Ram");
		System.out.println(obj);
		System.out.println();
		System.out.println(obj.hashCode());
		System.out.println();
		System.out.println(obj.equals(obj));
		System.out.println();
	}

}
