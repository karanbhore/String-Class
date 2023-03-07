package com.prowings.practise;

public class ImmutabilityTest {

	public static void main(String[] args) {
		Address ad1 = new Address("pune", "India", 1234);
		Student s1 = new Student(10, "Ram", ad1);

		System.out.println("Student object before change:" + s1);
		ad1.setCity("Dubai");
		s1.getAddress().setCity("Mumbai");

		System.out.println("Student object after change:" + s1);

	}

}
