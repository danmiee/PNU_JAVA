package com.ruby.java_05_06_objectoriented;

class food {
	
	public void toString(String name, int price) {
		System.out.println(
				"Food { " + "name: " + name + ", "
				+ "price: " + price + "원 }");
	}
}

public class FoodTest {
	
	public static void main(String[] args) {
		food f = new food();
		f.toString("치킨",18000);
		f.toString("피자",28000);
	}

}
