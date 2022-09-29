package com.ruby.java.ch07.date_220926.v1;

import java.util.Scanner;

class Point {
	int x, y;

	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
//		private으로 정의되어있으면 자식클래스에서 사용불가
	}

	public void getPoint() {
		System.out.printf("좌표 : (%d, %d)\n", x, y);
	}

}

class ColorPoint extends Point {

	private String color;

	public void setColorPoint(int x, int y, String s) {
		super.setPoint(x, y);
//		super.x = x;
//		super.y = y;
//		상기와 같이 줄여서 작성 가능
		this.color = s;
	}

	public void getColorPoint() {
		System.out.printf("(x,y,color) = (%d,%d,%s)", x, y, color);
	}
}

public class TestPoint_loop {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("2개의 숫자와 색상을 입력하면 좌표값으로 출력합니다.");
		System.out.println("-종료를 원하시면 999를 입력하세요-");

		Scanner sc = new Scanner(System.in);
		int x, y;
		String s;

		while ((x = sc.nextInt()) != 999) {
			y = sc.nextInt();
			s = sc.next();

			ColorPoint p = new ColorPoint();
			p.setColorPoint(x, y, s);
			p.getColorPoint();

		}

		System.out.println("수고하셨습니다.");

	}
}