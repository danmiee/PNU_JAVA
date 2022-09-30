package com.ruby.java.ch08.date_220929;

import java.util.ArrayList;
import java.util.List;

public class DrinksMain {

	public static void main(String[] args) {

		// 기본형
		{
			Juice j = new Juice("오렌지 쥬스", 3500);			j.drink();
			Coffee c = new Coffee("아이스 아메리카노", 2000);	c.drink();
			Beer b = new Beer("테라", 3500);					b.drink();
			Water w = new Water("삼다수", 2000);				w.drink();
			Tea t = new Tea("옥수수수염차", 2000);				t.drink();
		}
		// 빈 {}는 지역변수 구분, 소스관리 차원에서 구분지으려고 사용
		System.out.println("=================================================");

		// 다형성
		{
			// 부모클래스의 배열 선언
			Drinks[] d = new Drinks[5];
			
			// up casting : 부모클래스 배열 내에 자식클래스 집어넣기
				/*
				 * 부모클래스의 형태(일반, 추상, 인터페이스)는 상관없다.
				 * 단, Spring에서는 인터페이스를 가장 많이 사용
				 */
			d[0] = new Juice("오렌지 쥬스", 3500);
			d[1] = new Coffee("아이스 아메리카노", 2000);
			d[2] = new Beer("테라", 3500);
			d[3] = new Water("삼다수", 2000);
			d[4] = new Tea("옥수수수염차", 2000);

			// for ( 받고자하는 데이터 타입 변수 : 배열 )
			for (Drinks t : d) {
				t.drink();
			}
		}

		System.out.println("=================================================");

		// Collection (ArrayList)

			/*
			 *  자바 배열의 특징 : 사이즈를 변경할 수 없다.
			 *  변경하려면 새로운 배열을 만들어서 기존 데이터를 옮겨야함
			 *  그 한계를 극복하게 해주는 것이 ArrayList
			 *  내부 로직은 자료구조에서 공부
			 */
		{
			List<Drinks> list = new ArrayList<>();
			/*
			 *  ArrayList는 배열의 구조를 가지고 있기 때문에 데이터타입 지정해줘야함
			 *  여기서 데이터타입은 List<Drinks>
			 *  형태는 암기
			 *  임의의 데이터 타입을 지정할 수 있게 하기 위해 정해둔 문법
			 *  
			 *  <다형성 개념>
			 *  List는 ArrayList의 인터페이스로
			 *  List가 ArrayList를 받을 수 있음
			 *  
			 *  ArrayList 부분만 Vector로 바꿔주면 심플하게 유지보수 가능
			 *  
			 *  >> 하나의 인터페이스 안에 있는 구현체들은 교체하기 쉽다.
			 *  단, 인터페이스 자체가 변경되는 경우 코드를 새로 짜야한다.
			 */
			
			list.add(new Juice("오렌지 쥬스", 3500));
			list.add(new Coffee("아이스 아메리카노", 2000));
			list.add(new Beer("테라", 3500));
			list.add(new Water("삼다수", 2000));
			list.add(new Tea("옥수수수염차", 2000));

			for (Drinks t : list) {
				t.drink();
			}
		}
	}
}

class Drinks {

	private String name;
	private int price;
	public Drinks() {
		name = "";
		price = 0;
	}

	public Drinks(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void drink() {
		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.", name, price);
	}
}

class Juice extends Drinks {

	public Juice(String name, int price) {
		super(name, price);
	}

	public void drink() {
		System.out.print("[JUICE]");
		super.drink();
		System.out.println();
	}

}

class Coffee extends Drinks {

	public Coffee(String name, int price) {
		super(name, price);
	}

	public void drink() {
		System.out.print("[COFFEE]");
		super.drink();
		System.out.println();
	}
}

class Beer extends Drinks {

	public Beer(String name, int price) {
		super(name, price);
	}

	public void drink() {
		System.out.print("[BEER]");
		super.drink();
		System.out.println();
	}
}

class Water extends Drinks {

	public Water(String name, int price) {
		super(name, price);
	}

	public void drink() {
		System.out.print("[WATER]");
		super.drink();
		System.out.println();
	}
}

class Tea extends Drinks {

	public Tea(String name, int price) {
		super(name, price);
	}

	public void drink() {
		System.out.print("[TEA]");
		super.drink();
		System.out.println();
	}
}
