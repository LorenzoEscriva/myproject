package com.examples.MyProject;

public class App {
	public String sayHello(String name) {
		if (name == null)
			return "Hello";
		else
			return "Hello " + name;
	}

	public String sayHello() {
		return sayHello(null);
	}
	
	
	
	
	
	
	
	
}
