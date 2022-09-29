package com.ruby.java.ch07.date_220926.v1;

public class TestDefaultClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
		p.setName("Hello");
		p.getName();
		p.setAge(10);
		System.out.println("person:: age = " + p.getAge());
//		s.getStudent(22,"Hong",60,5);
//		s.showStudent();
		
		p.getAge();
	}
}
