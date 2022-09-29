package com.ruby.java.ch08.date_220929.training;

public class DrinksPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본형
//		Juice j = new Juice("오렌지 쥬스", 3500);
//		Coffee c = new Coffee("아이스 아메리카노", 2000);
//		Beer b = new Beer("테라", 3500);
//		Water w = new Water("삼다수", 2000);
//		Tea t = new Tea("옥수수수염차", 2000);
//
//		System.out.println(j.toString());
//		System.out.println(c.toString());
//		System.out.println(b.toString());
//		System.out.println(w.toString());
//		System.out.println(t.toString());

		// 다형성
		Drinks[] d = new Drinks[5];
		d[0] = new Fruits("오렌지","주스",5000);
		d[1] = new Coffee("아이스 아메리카노",2000);
		d[2] = new Beer("클라우드",4000);
		d[3] = new Water("삼다수",2000);
		d[4] = new Tea("페퍼민트",4500);
		
		for(Drinks t : d) {
			System.out.println(t.toString());
		}
	}

}

abstract class Drinks extends Object {
	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Drinks(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public abstract String toString();
	// Object에 이미 toString이 있기 때문에 이렇게 사용하는 것은 부적절함
}

class Juice extends Drinks {
	public Juice(String name, int price) {
		super(name, price);
	}


	@Override
	public String toString() {
		return getName()+"을(를) 마십니다. 가격은 "+getPrice()+"원 입니다.";	}
}

class Fruits extends Juice {
	private String fname;
	public Fruits(String fname, String name, int price) {
		super(name, price);
		this.fname = fname;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[JUICE]\n"+fname+super.toString();
	}
}

class Coffee extends Drinks {
	public Coffee (String name, int price) {
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "[COFFEE]\n"+getName()+"을(를) 마십니다. 가격은 "+getPrice()+"원 입니다.";	}
}

class Beer extends Drinks {
	public Beer (String name, int price) {
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "[BEER]\n"+getName()+"을(를) 마십니다. 가격은 "+getPrice()+"원 입니다.";	}
}

class Water extends Drinks {
	public Water (String name, int price) {
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "[WATER]\n"+getName()+"을(를) 마십니다. 가격은 "+getPrice()+"원 입니다.";	}
}

class Tea extends Drinks {
	public Tea (String name, int price) {
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "[TEA]\n"+getName()+"을(를) 마십니다. 가격은 "+getPrice()+"원 입니다.";	}
}