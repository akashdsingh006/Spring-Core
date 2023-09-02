package com.springcore.Spring.Ref;

public class B {
	private int i;
	private A ob;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public A getOb() {
		return ob;
	}
	public void setOb(A ob) {
		this.ob = ob;
	}
	public B(int i, A ob) {
		super();
		this.i = i;
		this.ob = ob;
	}
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("B [i=").append(i).append(", ob=").append(ob).append("]");
		return builder.toString();
	}
	
	
}
