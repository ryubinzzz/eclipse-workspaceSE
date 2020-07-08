package com.itwill03.member;

public class A {
	private int x;
	private int y;
	
	void M1() {
		// TODO Auto-generated constructor stub
		System.out.println("m1호출");
	}

	void M2(String xx) {
		System.out.println("m2호출\t"+xx);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void print() {
		System.out.println(this.x+"\t"+this.y);
	}
	
}

