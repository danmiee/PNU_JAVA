package com.ruby.java.ch06.date_220923;

public class StaticBlockTest {
	static {
		System.out.println("hello");
		System.out.println("java");
	}

	public static void main(String[] args) {
		System.out.println("world!!");
	}
/*
 * main에는 world!! 밖에 없지만
 * static은 main보다 먼저 작동하기 때문에 먼저 출력됨
 * (잘안씀)
 */
}
