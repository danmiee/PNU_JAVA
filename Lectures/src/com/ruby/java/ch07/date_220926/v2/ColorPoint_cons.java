package com.ruby.java.ch07.date_220926.v2;

/*
 *  생성자
 *  show와 cp를 정의하여 cp.show로 출력하기
 */

class Point {
	private int x, y;

	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 생성자 정의
	
	public void show() {
		System.out.println(x+ y);
	}
}

public class ColorPoint_cons extends Point {
	
	private String color;
	public ColorPoint_cons(int x, int y, String color) {
		super(x, y); // 부모 생성자 호출
		this.color = color; // 해당 클래스 생성자 정의 
	}
	public void show() {
		super.show();
		System.out.println(color);
	}
	// 
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Point p = new Point();
		ColorPoint_cons cp = new ColorPoint_cons(10, 20, "red");
		cp.show();
	}
}