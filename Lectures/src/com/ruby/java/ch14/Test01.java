package com.ruby.java.ch14;

interface MyInterface {
	public void print();
}

class MyClass1 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass1");
	}
}

class MyClass2 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass2");
	}
}

public class Test01 {
	// test 메소드 정의
	public static void test(MyInterface mi) {
		mi.print();
	}

	// test2 메소드 정의
	/*
	 * mi : 익명클래스의 객체
	 * return mi : 익명클래스의 객체 리턴
	 * 	= test2()메서드에서 반환된 MyInterfae 리턴
	 */
	public static MyInterface test2() {
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("test2()메서드에서 반환된 MyInterface");
			}
		};
		return mi;
	}

	public static void main(String[] args) {

		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		mc1.print(); // MyClass1
		mc2.print(); // MyClass2

		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명 클래스로 구현");
			}
		};
		test(mc1); // MyClass1
		test(mi); // 익명 클래스로 구현

		mi.print(); // 익명 클래스로 구현

		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("선언, 생성, 호출을 한번에 처리");
			}
		}).print(); // 선언, 생성, 호출을 한번에 처리

		// 인터페이스의 익명클래스 타입의 객체 mi2에 test2의 리턴값 반환
		MyInterface mi2 = test2();
		mi2.print(); // test2() 메서드에서 반환된 MyInterface
	}
}