package com.ruby.java.ch08.date_220929.training;
/*
 * 클래스, 속성, 메서드 정의
 * 유닛들을 하나의 배열에 저장해서 다양한 메소드를 호출하는 과정 구현
 * 일반클래스 > 추상클래스 > 인터페이스
 */

public class GameDevelopment2_ing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
}

abstract class Unit2 {

	public Unit2 (String str, String action) {
		this.str = str;
		this.action = action;
	}
	
	private String str;
	private String action;
	
	
	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}


	public String getAction() {
		return action;
	}


	public void setAction(String action) {
		this.action = action;
	}


	public abstract void show();
}

// 포를 쏜다
class Tank2 extends Unit2 {

	public Tank2(String str, String action) {
		super(str, action);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("탱크가" + getStr()+"을(를)"+getAction());
	}
	
}