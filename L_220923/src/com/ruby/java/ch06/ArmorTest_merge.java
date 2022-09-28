package com.ruby.java.ch06;

class Armor2 {
	private String name;
	private int height;

	public String getName() {
		return name;
	}

	public void setName(String value) {
		name = value;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int value) {
		height = value;
	}
}
/*
 * public class Armor {}
 * 	public 없으면 가능하나 public 기재시 error!
 *  1개의 package 내에 public class는 1개만 있어야함
*/
public class ArmorTest_merge {
	public static void main(String[] args) {
		Armor2 suit1 = new Armor2();
		Armor2 suit2 = new Armor2();
		Armor2 suit3 = new Armor2();

/*		System.out.println(suit.height);
 * 		height는 private이기 때문에 불가 / class Armor 내에서만 사용가능
 */
		
		suit1.setName("mark6");
		suit1.setHeight(180);

		suit2.setName("mark16");
		suit2.setHeight(220);

		suit3.setName("mark38");
		suit3.setHeight(200);

		System.out.println(suit1.getName() + " : " + suit1.getHeight());
		System.out.println(suit2.getName() + " : " + suit2.getHeight());
		System.out.println(suit3.getName() + " : " + suit3.getHeight());
	}

}
