package edu;

public class Armor {
	public String name;
	public int height;
	public int weight;
	public String color;
	public boolean isFly;
	
	// 생성자 : 객체가 만들어지는 시점에 바로 실행됨
	public Armor() {
		name = "John";
		height = 167;
		weight = 50;
		color = "pink";
		isFly = true;
	}
	public Armor(String name) {
		this.name = name;
	}
	
	public Armor(String name, int height, int weight, String color, boolean isFly) {
		super(); // 부모 클래스의 생성자 호출
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.isFly = isFly;
	}
	
	@Override
	public String toString() {
		return "Armor [name=" + name + ", height=" + height + ", weight=" + weight + ", color=" + color + ", isFly="
				+ isFly + "]";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean getIsFly() {
		return isFly;
	}
	public void setIsFly(boolean isFly) {
		this.isFly = isFly;
	}
	
	
}
