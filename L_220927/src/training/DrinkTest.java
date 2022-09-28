package training;

class Drink {
	private String drink;

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}
	
	public String drink() {
		return drink;
	}
}

class Juice extends Drink {
	
	public Juice() { }
	
	private String juice;

	public String getJuice() { return juice; }

	public void setJuice(String juice) { this.juice = juice; }
	
	public String drink() { return juice + " " + super.getDrink(); }
	
}

public class DrinkTest {

	public static void main(String[] args) {
		
		Juice j = new Juice();

		j.setJuice("주스를");
		j.setDrink("마십니다.");
		
		System.out.println(j.drink());
		
	}
}
