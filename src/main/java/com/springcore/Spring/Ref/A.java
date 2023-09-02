package com.springcore.Spring.Ref;

public class A {
	
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public A(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("A [x=").append(x).append(", y=").append(y).append("]");
		return builder.toString();
	}
	
	
}
