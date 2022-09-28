package edu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Armor ar = new Armor();
		// armor : °´Ã¼, new Armor : µ¥ÀÌÅÍ
		System.out.println("ar : " + ar.toString());
		
		System.out.println("");
		
		Armor ar1 = new Armor("È«±æµ¿", 180, 80, "yellow", false);
		System.out.println("name : " +ar1.getName());
		System.out.println("height : " +ar1.getHeight());
		System.out.println("weight : "+ar1.getWeight());
		System.out.println("color : "+ar1.getColor());
		System.out.println("isFly : "+ar1.getIsFly());
		
		System.out.println("");
		
		//(String name, int height, int weight, String color, boolean isFly) {
		Armor ar2 = new Armor("È«ÀÌµ¿", 100, 100, "red", true);
		System.out.println("name : " + ar2.getName());
		System.out.println("height : " +ar2.getHeight());
		System.out.println("weight : "+ar2.getWeight());
		System.out.println("color : "+ar2.getColor());
		System.out.println("isFly : "+ar2.getIsFly());
		
		System.out.println("ar2 : " + ar2.toString());
	}

}
