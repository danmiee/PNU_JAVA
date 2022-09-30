package com.ruby.java.ch10.date_220930.training;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList 활용한 배열 생성
		List<City> list = new ArrayList<>();
		list.add(new City("부산",100,100));
		list.add(new City("서울",200,500));
		
		for(City c : list) {
			c.show();
		}
	}

}

// 도시 이름, 인구수, 면적, ...
class City {
	private String name;
	private int person;
	private int size;
	
	public City(String name, int person, int size) {
		this.name = name;
		this.person = person;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void show() {
		System.out.printf("name: %s, person: %d만명, size: %d\n",name,person,size);
	}
	
	
}