package com.ruby.java.ch07.date_220926.v1;

// 함수로 배열을 전달하여 출력하기

import java.util.Arrays;

public class TestStatic_Array {
		
	static void show(int a[][]) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(Arrays.deepToString(a));
				
	}
	
}
