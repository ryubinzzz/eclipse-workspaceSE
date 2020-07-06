package com.itwill.상속;

public abstract class Parent {

	public int member1;
	public int member2;

	public Parent() {
		super();
	}
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public abstract void method2();

}