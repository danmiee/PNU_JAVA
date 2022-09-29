package com.ruby.java.ch06.date_220923;

class student {
	private int sno;
	private String name;
	private double height;

	public void getStudent(int s, String n, double h) {
		sno = s;
		name = n;
		height = h;
		// 순서 바뀌면 작동안됨!!
	}

	public void showStudent() {
		System.out.println("학번 : " + sno);
		System.out.println("성명 : " + name);
		System.out.println("키 : " + height);
	}
	
}

public class ProcenStudent {
	
	public static void main(String[] args) {
		
		student s = new student();
		/* 
		 * new student 의 student : 생성자!
		 * new student를 하나 더 만들어서 다른 값을 줄 수도 있다 : overloading
		 */
		s.getStudent(18,"이정민",158.0);
		s.showStudent();
		
	}
}