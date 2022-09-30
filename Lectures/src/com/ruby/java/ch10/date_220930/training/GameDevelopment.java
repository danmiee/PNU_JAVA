package com.ruby.java.ch10.date_220930.training;

import java.util.ArrayList;
import java.util.List;

public class GameDevelopment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Unit> list = new ArrayList<>();

		list.add(new Tank("포", "쏜다"));
		list.add(new Airplane("미사일", "발사한다"));
		list.add(new Submarine("어뢰", "쏜다"));
		list.add(new Soldier("총", "쏜다"));

		for (Unit t : list) {
			t.show();
		}
		/*
		 * 배열 반복문 축약형! 문법임
		 * for (클래스:배열이름) { 실행문 };
		 */
	}
}

class Unit {
	// 생성자 선언
	public Unit(String o, String a) {
		this.object = o;
		this.action = a;
	}

	private String action;
	private String object;

	// 출력문
	public void show() {
		System.out.println(object + "을(를) " + action);
	}
}

// 포를 쏜다
class Tank extends Unit {
	public Tank(String o, String a) {
		super(o, a);
	}

	public void show() {
		super.show();
	}
}

// 미사일을 발사한다
class Airplane extends Unit {
	public Airplane(String o, String a) {
		super(o, a);
	}

	public void show() {
		super.show();
	}

}

// 어뢰를 쏜다
class Submarine extends Unit {
	public Submarine(String o, String a) {
		super(o, a);
	}

	public void show() {
		super.show();
	}

}

// 총을 쏜다
class Soldier extends Unit {
	public Soldier(String o, String a) {
		super(o, a);
	}

	public void show() {
		super.show();
	}

}