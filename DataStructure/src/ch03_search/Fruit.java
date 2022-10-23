package ch03_search;

public class Fruit implements Comparable<Fruit>{

	private String name;
	private int price;

	public Fruit() {
	}

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", price=" + price + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}

	@Override
	public int compareTo(Fruit o) {
		// TODO Auto-generated method stub
		if(this.price > o.price) {
			return 1;
		} else if(this.price< o.price) {
			return -1;
		} else {
			if(this.name.compareTo(o.name)>0) {
				return 1;
			} else if(this.name.compareTo(o.name)<0) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}
