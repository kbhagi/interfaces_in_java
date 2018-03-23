package com.uttara.test;

public class Person {

	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void testThing(Thing t) // polymorphic code!
	{
		System.out.println("I am a person with name "+name + " going to test...");
		t.doSomething();
	}
	
}
