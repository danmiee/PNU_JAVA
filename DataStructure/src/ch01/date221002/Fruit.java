package ch01.date221002;

public class Fruit implements Comparable<Fruit> {
    private String name;
    private int price;
    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{name: " + name + ", price: " + price + "}";
    }

	@Override
	public int compareTo(Fruit o) {
		if (this.price < o.price) return -1;
		else if (this.price > o.price) return 1;
		else return this.name.compareTo(o.name);
		// TODO Auto-generated method stub
	}
}
