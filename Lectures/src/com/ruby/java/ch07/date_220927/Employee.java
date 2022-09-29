package com.ruby.java.ch07.date_220927;

// 부모클래스로 Person 가져오기
public class Employee extends Person {

	// 생성자 선언
	/* 예시
	public Employee() {
		// 컴파일러가 super();를 자동으로 추가하여 부모클래스의 생성자도 함께 출력됨
		System.out.println("Employee 생성자 실행!");
	}
	*/	

	// 부모클래스의 인자값을 받는 매개변수가 선언된 생성자 선언
	/*
	public Employee(String name, int age, String dept) {
		// () 안에서 매개변수 선언
		super.setName(name); // 부모클래스의 setName을 받는 name
		super.setAge(age); // 부모클래스의 setAge를 받는 age
		this.dept = dept;
		System.out.println("Employee(name, age, dept) 생성자 실행!"); // 생성자 호출로 출력까지 되도록 세팅
	}
	*/
	
	// 부모클래스에서 중복제거함에 따른 생성자 선언
	public Employee(String name, int age, String dept) {
		super(name,age);
		this.dept = dept;
	}

	private String dept;

	// private으로 정의하였으므로 다른 클래스에서 활용할 수 있게 getter, setter 생성
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	// overriding 구현
	/*
	 *** 오류발생상황 ***
	 public String to String() {
	 	return name + ":" + age + ":" + dept;
	 }
	  - name, age는 부모클래스에서 private으로 정의되었으므로 접근불가
	  - 부모클래스에서 정의해둔 getter, setter 활용 필요
	 */
	
// 부모클래스 메소드 호출

	/* getter setter 호출
	public String toString() {
		return this.getName() + ":" + this.getAge() + ":" + dept;
	}
	*/
	
	// toString 호출
	public String toString() {
		return super.toString() + ":" + dept;
	}
}
