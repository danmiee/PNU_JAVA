package com.ruby.java.ch08.date_221005;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();

	public abstract void calcBonus();
}

class Salesman extends Employee {

	@Override
	public void calcSalary() {
		// TODO Auto-generated method stub
		System.out.println("Salseman 급여 = 기본급 + 판매수당");
	}

	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Salseman 보너스 = 기본급 * 12 * 4");
	}

}

class Manager extends Employee {

	@Override
	public void calcSalary() {
		// TODO Auto-generated method stub
		System.out.println("Manager 급여 = 기본급 + 팀 성과수당");
	}

	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Manager 보너스 = 기본급 * 12 * 6");
	}

}

class Director extends Manager {

	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}

}

class Consultant extends Employee {

	@Override
	public void calcSalary() {
		// TODO Auto-generated method stub
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별수당");
	}

	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}

}

public class HRSTest {

	public static void calcTax(Employee e) {
		System.out.println("소득세를 계산합니다.");
	}

	public static void main(String[] args) {

		Salesman s1 = new Salesman();
		Employee s2 = new Salesman();
		Object s3 = new Salesman();
		
		Object m1 = new Manager();
		Employee m2 = new Manager();
		Manager m3 = new Manager();
//		Director m4 = new Manager();
		
		Object arr[] = new Object[6];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = m1;
		arr[4] = m2;
		arr[5] = m3;
		
		for(Object a : arr) {
			System.out.println(a);
		}
	}
}
