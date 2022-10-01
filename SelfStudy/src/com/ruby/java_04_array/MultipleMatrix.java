package com.ruby.java_04_array;

import java.util.Arrays;

public class MultipleMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] A = {{1,2,3},{3,4,5}};
		int [][] B = {{5,6,7,4},{7,8,9,1},{8,9,8,7}};
		int [][] AB = new int [2][4];
		
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<B[0].length; j++) {
				for(int k=0; k<B.length; k++) {
					AB[i][j] += A[i][k]*B[k][j];
				}
			}
		}
		System.out.println(Arrays.deepToString(AB));
		
	}

}
