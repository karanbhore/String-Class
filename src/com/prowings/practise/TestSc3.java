package com.prowings.practise;

public class TestSc3 {
public static void main(String[] args) {
	B b =new B();
	A a= new A();
	b.get(10);
	b.get(25);
	
}
}
class A{
	public int get(int a) {
		System.out.println("a int");
		return 10;
	}
}
class B extends A{
	private void get() {
		System.out.println("b");
	}
//	public int get(int b) {
//		System.out.println("b int");
//		return 20;
//	}
}