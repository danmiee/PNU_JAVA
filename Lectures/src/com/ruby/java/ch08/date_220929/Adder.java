package com.ruby.java.ch08.date_220929;

public class Adder implements AdderInterface {

	public Adder() {
	}
	
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	@Override
	public int sub(int a, int b) {
		return a - b;
	}
	
	@Override
	public int mul(int a, int b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		return a / b;
	}
}
