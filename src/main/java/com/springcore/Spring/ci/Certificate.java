package com.springcore.Spring.ci;

public class Certificate {
	 String course;

	public Certificate(String course) {
		super();
		this.course = course;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Certificate [course=").append(course).append("]");
		return builder.toString();
	}
	
	
}
