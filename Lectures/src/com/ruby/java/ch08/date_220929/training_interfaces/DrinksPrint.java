package com.ruby.java.ch08.date_220929.training_interfaces;

class Juice implements DrinksInterface {

	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		return "[JUICE]";
	}

	@Override
	public void setMenu(String name, int price) {
		// TODO Auto-generated method stub
		System.out.println(name+"를 마십니다. 가격은 "+price+"원 입니다.");
	}

}

class Coffee implements DrinksInterface {

	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		return "[COFFEE]";
	}

	@Override
	public void setMenu(String name, int price) {
		// TODO Auto-generated method stub
		System.out.println(name+"를 마십니다. 가격은 "+price+"원 입니다.");
	}

}

class Beer implements DrinksInterface {

	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		return "[BEER]";
	}

	@Override
	public void setMenu(String name, int price) {
		// TODO Auto-generated method stub
		System.out.println(name+"를 마십니다. 가격은 "+price+"원 입니다.");
	}

}

class Water implements DrinksInterface {

	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		return "[WATER]";
	}

	@Override
	public void setMenu(String name, int price) {
		// TODO Auto-generated method stub
		System.out.println(name+"를 마십니다. 가격은 "+price+"원 입니다.");
	}

}

class Tea implements DrinksInterface {

	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		return "[TEA]";
	}

	@Override
	public void setMenu(String name, int price) {
		// TODO Auto-generated method stub
		System.out.println(name+"를 마십니다. 가격은 "+price+"원 입니다.");
	}

}

public class DrinksPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Juice j = new Juice();
		Coffee c = new Coffee();
		Beer b = new Beer();
		Water w = new Water();
		Tea t = new Tea();
		
		System.out.println(j.getMenu());
		j.setMenu("오렌지쥬스", 5000);
		System.out.println(c.getMenu());
		c.setMenu("아이스 아메리카노", 2000);
		System.out.println(b.getMenu());
		c.setMenu("스텔라", 5000);
		System.out.println(w.getMenu());
		c.setMenu("에비앙", 2000);
		System.out.println(t.getMenu());
		c.setMenu("캐모마일", 4800);
		
	}

}
