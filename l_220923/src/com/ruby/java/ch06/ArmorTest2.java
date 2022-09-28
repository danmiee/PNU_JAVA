package com.ruby.java.ch06;

public class ArmorTest2 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Armor suit = new Armor();
		suit = null;
		/*
		 * suit : Stack
		 * 가리키는 값 : Heep
		 * 값이 없으면 반납 : Garbage Collection
		 * ㄴC에서는 delete[] 해야하지만 Java에서는 JVM이 알아서 처리함
		 * -p.229
		 */
		suit.setName("mark6");
		suit.setHeight(180);
		System.out.println(suit.getName() + " : " + suit.getHeight());
		
	}

}
