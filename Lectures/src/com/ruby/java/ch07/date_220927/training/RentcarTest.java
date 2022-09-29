package com.ruby.java.ch07.date_220927.training;
/*
 *  렌트카 회사 차량 관리
 *  공통 : 차량번호, 가격
 *  개별 : 세단-용도 / SUV-탑승가능인원 / Truck-용량
 */

class Vehicle {
	//생성자 선언
	public Vehicle(String cn, int price) {
		this.cn = cn;
		this.price = price;
	}
	
	// 변수 선언
	private String cn;
	private int price;
	
	// private이니까 getter, setter 세팅
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 출력용 메소드 생성, 리턴값 만들어주기
	public String toString() {
		return "차량번호: " + cn + " / 가격: " + price + "원";
	}
	
}

class Sedan extends Vehicle {
	public Sedan(String cn, int price, String purpose) {
		super(cn,price);
		this.purpose = purpose;
	}
	private String purpose;

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public String toString() {
		return super.toString() + " / 용도: " + purpose;
	}
}

class SUV extends Vehicle {
	public SUV(String cn, int price, int volume) {
		super(cn,price);
		this.volume = volume;
	}
	private int volume;
	
	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String toString() {
		return super.toString() + " / 탑승가능인원: " + volume + "명";
	}
}

class Truck extends Vehicle {
	public Truck(String cn, int price, int capacity) {
		super(cn,price);
		this.capacity = capacity;
	}
	private int capacity;
	
	public String toString() {
		return super.toString() + " / 적재용량: " + capacity + "t";
	}
}

public class RentcarTest {

	public static void main(String[] args) {
		
		Sedan sedan = new Sedan("사1234",1000000000,"대표수행");
		SUV suv = new SUV("나1111",50000000,6);
		Truck truck = new Truck("마5678",70000000,2);
		
		System.out.println(sedan.toString());
		System.out.println(suv.toString());
		System.out.println(truck.toString());
		
	}
}
