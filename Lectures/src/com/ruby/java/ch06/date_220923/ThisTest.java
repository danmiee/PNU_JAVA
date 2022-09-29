package com.ruby.java.ch06.date_220923;

public class ThisTest {
	int i = 1;

	public void first() {
		int i = 2;
		int j = 3;
		this.i = i + j;

		second(4);
	}

	public void second(int i) {
		int j = 5;
		this.i = i + j;
		/*
		 * this.i = i + j;
		 * System.out.println(i); // 4
		 *  ㄴ 여기서 i 는 this.i 와 다름
		 * i = i + j; // 9
		 * System.out.println(i); // 9
		 * 
		 * 이렇게 같은 변수를 사용하는 것은 권장하지 않음
		 */
	}

	public static void main(String[] args) {
		ThisTest exam = new ThisTest();
		exam.first();
	}

}
