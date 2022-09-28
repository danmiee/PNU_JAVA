package com.ruby.java_04_array;

public class Array_2d {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = num++;
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

}