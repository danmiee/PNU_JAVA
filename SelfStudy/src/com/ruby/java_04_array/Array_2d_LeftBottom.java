package com.ruby.java_04_array;

public class Array_2d_LeftBottom {

	public static void main(String[] args) {
		
		int[][] arr = { { 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 }, 
				{ 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<=i; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
}
