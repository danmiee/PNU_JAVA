package com.ruby.java.ch07.inheritance2;

class Person {
 
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int age;
	@SuppressWarnings("unused")
	private String dept;
	/*
	 *  모든 변수는 가능한 private으로 정의한다.
	 *  why? 다른 곳에서 값을 변경하지 못하게 하려고
	 *  private이면 다른 class에서 접근불가
	 */
	public Person() {}
	public Person(String s, int a, String d) {
		name = s; age = a; dept = d;
	}
	
}

public class Employee_cons extends Person {
		@SuppressWarnings("unused")
		private int salary;
		public Employee_cons(String s, int a, String d, int pay) {
			
			super(s,a,d);
			// 생성자는 처음에 호출해야함
//			Person(s,a,d);
			// 자동으로 상속되지 않음
			System.out.println("Employee()::");
			salary = pay;
//			name = s;
//			age = a;
//			dept = d;
		}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		Employee_cons e = new Employee_cons("hong",10,"ce",1000);
		
	}

}
