package com.ruby.java.ch04.java;

public class Gugudan {

	public void printGugudan(int col) {

		/*
		 * 기존 구구단 솔루션에서 변경된부분
		 * main(String[] args) > printGugudan(int col)
		 * int col; > 상기내용에 포함되었으므로 삭제
		 * col=Integer.paraseInt(args[0]); > 불필요한 부분으로 삭제
		 */

		if (col < 1 || 9 <= col) {
			System.out.println("col is not valid!");
			return;
		}
		
		for (int i = 2; i < 10; i += col) {
			
			for (int j = 1; j < 10; j++) {
				
				for (int k = 0; k < col; k++) {
					
					if (10 <= i + k) {
						System.out.print("\n");
						break;
					}
					
					System.out.printf("%d*%d=%d", (i + k), j, (i + k) * j);
					// %d : 정수
					if (k < col - 1)
						System.out.print("\t");
					// \t : tab
					else
						System.out.print("\n");
					// \n : new line
					
				}
				
			}
			System.out.println();
			
		}
	}
}
