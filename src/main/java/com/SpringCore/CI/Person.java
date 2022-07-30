package com.SpringCore.CI;

public class Person {
	private String name;
	private int persionId;

	public Person(String name, int persionId) {
		this.name = name;
		this.persionId = persionId;

	}

	@Override
	public String toString() {

		return this.name + " : " + this.persionId;
	}

}
