package com.ruby.java.ch07.inheritance;

class Person {
// default class : 동일 패키지 내의 모든 클래스에서 접근가능
	private String name;
	private int age;
	private String dept;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		// return 값이 없으므로 void
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
//public class Person
/*	하나의 클래스 파일에서 public class는 하나만 사용되어야 한다.
*	ㄴ관련 에러 : The public type Person must be defined in its own file
*  			> public 타입의 Person은 별도 파일로 정의되어야한다. 
*/

public class Employee extends Person {
		
//	클래스 내에서 객체 만들고 활용하기
	
	private String name;
	private int age;
	private String dept;
	// private 의미 test > line.70
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		// return 값이 없으므로 void
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p2 = new Person();
//		p.age=13;
		/*
		 *  not visible
		 *  현재 main은 Employee 클래스 안에 있고 Person은 별도 클래스
		 *  Person의 age가 private이기 때문에 Employee에서 접근 불가
		 */
		int num =0;
		
		Employee e = new Employee();
		/*
		 *  객체생성
		 *  Employee e : Stack에 참조변수 e 선언
		 *  new Employee() : Heep에 Employee의 인스턴스 생성
		 *  Person 클래스 상속받으므로 Person 클래스 내용도 함께 포함
		 */
		
		e.age = 23;
//		age = 24;
		num = 15;
		System.out.println(e.age);
//		System.out.println(age);
		//	객체가 있어야 사용가능
		
		e.setAge(10);
		// age 값 가져오기
/*
 * 		setName("Hello");
 * 		객체를 안 만들고 하면 non static method 오류 발생
 * 		: setName은 객체가 있어야 불러올 수 있다는 의미
 */
		Employee s = new Employee();
		s.setName("Hello");
		
		Student s2 = new Student();
		
		Person p = new Person();
		
		p.setAge(55);
		p.getAge();
		 
		
		s2.setAge(33);
		s2.getAge();
		System.out.println("student:: age = " + s2.getAge());
		//  같은 패키지 내의 다른 public 클래스에서 public으로 정의된 메소드를 불러올 수 있다.
		
		System.out.println("age = " + e.getAge());
		// 작동여부 확인
	}

}
