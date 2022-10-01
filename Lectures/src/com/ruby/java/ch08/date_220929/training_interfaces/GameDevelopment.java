package com.ruby.java.ch08.date_220929.training_interfaces;
/*
 * 클래스, 속성, 메서드 정의
 * 유닛들을 하나의 배열에 저장해서 다양한 메소드를 호출하는 과정 구현
 * 일반클래스 > 추상클래스 > 인터페이스
 */

public class GameDevelopment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank2 t = new Tank2();
		Airplane2 a = new Airplane2();
		Submarine2 sm = new Submarine2();
		Soldier2 sd = new Soldier2();
		
		System.out.println(t.getGame());
		t.setGame("포","쏜다");
		t.setnum(6);
		System.out.println(a.getGame());
		a.setGame("미사일","발사한다");
		a.settime(18);
		System.out.println(sm.getGame());
		sm.setGame("어뢰","발사한다");
		sm.setspace("일본");
		System.out.println(sd.getGame());
		sd.setGame("총","쏜다");
		sd.setperson(50);

	}
}

// str을(를) num번 action
class Tank2 implements GameDevelopmentInterface {
	@Override
	public String getGame() {
		// TODO Auto-generated method stub
		return "[탱크]";
	}

	@Override
	public void setGame(String str, String action) {
		// TODO Auto-generated method stub
		System.out.printf("%s을(를) %s\n", str, action);
	}
	
	public void setnum(int num) {
		System.out.println("횟수: " + num);
	}
}

//time시에 str을(를) action
class Airplane2 implements GameDevelopmentInterface {
	@Override
	public String getGame() {
		// TODO Auto-generated method stub
		return "[전투기]";
	}

	@Override
	public void setGame(String str, String action) {
		// TODO Auto-generated method stub
		System.out.printf("%s을(를) %s\n", str, action);
	}
	
	public void settime(int time) {
		System.out.println("시각: " + time + "시");
	}
}

//str을(를) space에 action
class Submarine2 implements GameDevelopmentInterface {
	@Override
	public String getGame() {
		// TODO Auto-generated method stub
		return "[전투함]";
	}

	@Override
	public void setGame(String str, String action) {
		// TODO Auto-generated method stub
		System.out.printf("%s을(를) %s\n", str, action);
	}
	
	public void setspace(String space) {
		System.out.println("투하장소: " + space);
	}
}

//person명이 str을(를) action
class Soldier2 implements GameDevelopmentInterface {
	@Override
	public String getGame() {
		// TODO Auto-generated method stub
		return "[보병]";
	}

	@Override
	public void setGame(String str, String action) {
		// TODO Auto-generated method stub
		System.out.printf("%s을(를) %s\n", str, action);
	}
	
	public void setperson(int person) {
		System.out.println("발포인원: " + person);
	}

}