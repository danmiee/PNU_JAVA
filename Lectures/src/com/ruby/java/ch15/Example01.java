package com.ruby.java.ch15;

import java.util.Arrays;

@SuppressWarnings("unused")
public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num [] = {1,2,3,4,5};

//		int sum = 0;
//		for(int i=0; i<num.length; i++) {
//			if((num[i]%2)==1) {
//				sum += num[i];
//			}
//		}
		
		int sum = Arrays.stream(num).filter((n) -> n%2 == 1).sum();
		/*
		 *  Arrays.stream(num) : 스트림 생성 
		 *  stream : 배열을 파이프로 만드는 것
		 *  filter : 람다식으로 표현
		 */
	}

}
