package com.ruby.java.ch08.date_220929.training;
/*
 * 클래스, 속성, 메서드 정의
 * 유닛들을 하나의 배열에 저장해서 다양한 메소드를 호출하는 과정 구현
 * 일반클래스 > 추상클래스 > 인터페이스
 */

public class GameDevelopment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Unit2 u2list[] = new Unit2[4]; 
		u2list[0] = new Tank2("포",3,"쏜다");
		u2list[1] = new Airplane2(18,"미사일","발사한다");
		u2list[2] = new Submarine2("어뢰","일본","쏜다");
		u2list[3] = new Soldier2(5,"총","쏜다");
		
		for(Unit2 u : u2list) {
			u.show();
		}
	}
}

abstract class Unit2 {
	private String str;
	private String action;

	public String getStr() {
		return str;
	}
	public String getAction() {
		return action;
	}
	public Unit2 (String str, String action) {
		this.str = str;
		this.action = action;
	}
	public abstract void show();
}

// str을(를) num번 action
class Tank2 extends Unit2 {
	private int num;
	
	public Tank2(String str, int num, String action) {
		// TODO Auto-generated constructor stub
		super(str, action);
		this.num = num;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.printf("%s을(를) %d번 %s\n",super.getStr(),num,super.getAction());
	}
	
}

//time시에 str을(를) action
class Airplane2 extends Unit2 {
	private int time;
	
	public Airplane2(int time, String str, String action) {
		// TODO Auto-generated constructor stub
		super(str, action);
		this.time = time;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.printf("%d시에 %s을(를) %s\n",time,super.getStr(),super.getAction());
	}
	
}

//str을(를) num번 action
class Submarine2 extends Unit2 {
	private String space;
	
	public Submarine2(String str, String space, String action) {
		// TODO Auto-generated constructor stub
		super(str, action);
		this.space = space;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.printf("%s을(를) %s에 %s\n",super.getStr(),space,super.getAction());
	}
	
}

//person명이 str을(를) action
class Soldier2 extends Unit2 {
	private int person;
	
	public Soldier2(int person, String str, String action) {
		// TODO Auto-generated constructor stub
		super(str, action);
		this.person = person;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.printf("%d명이 %s을(를) %s\n",person,super.getStr(),super.getAction());
	}
	
}