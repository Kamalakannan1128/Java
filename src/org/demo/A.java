package org.demo;

public class A {

	private void method1() {
		System.out.println("START");
	}
	
	private void method2() {
		System.out.println("THE");
	}
	
	private void method3() {
		System.out.println("JAVA PROGRAM");
	}
	
	private void method4() {
		System.out.println("PROGRAM STARTS SUCCESSFUL");
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		
		a.method1();
		a.method2();
		a.method3();
		a.method4();
	}
}
