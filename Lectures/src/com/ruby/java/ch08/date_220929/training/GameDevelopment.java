package com.ruby.java.ch08.date_220929.training;
/*
 * 클래스, 속성, 메서드 정의
 * 유닛들을 하나의 배열에 저장해서 다양한 메소드를 호출하는 과정 구현
 * 일반클래스 > 추상클래스 > 인터페이스
 */

public class GameDevelopment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본형
//		Tank t = new Tank("포","쏜다");				t.show();
//		Airplane a = new Airplane("미사일","발사한다");	a.show();
//		Submarine sm = new Submarine("어뢰","쏜다");	sm.show();
//		Soldier sd = new Soldier("총","쏜다");		sd.show();
		
		// 다형성-배열
		Unit u [] = new Unit[4];	// 배열선언
		u[0] = new Tank("포","쏜다");	// 매개변수 기재하여 배열요소 지정
		u[1] = new Airplane("미사일","발사한다");
		u[2] = new Submarine("어뢰","쏜다");
		u[3] = new Soldier("총","쏜다");

		for(Unit t : u) {
			t.show();
		}
		// 이게 뭘까........
		
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
		System.out.println(object+"을(를) "+action);
	}
}
// 포를 쏜다
class Tank extends Unit {
	public Tank(String o, String a) {
		super(o,a);
	}
	public void show() {
		super.show();
	}
}
// 미사일을 발사한다
class Airplane extends Unit {
	public Airplane(String o, String a) {
		super(o,a);
	}
	public void show() {
		super.show();
	}
	
}
// 어뢰를 쏜다
class Submarine extends Unit {
	public Submarine (String o, String a) {
		super(o,a);
	}
	public void show() {
		super.show();
	}
	
}
// 총을 쏜다
class Soldier extends Unit {
	public Soldier (String o, String a) {
		super(o,a);
	}
	public void show() {
		super.show();
	}
	
}