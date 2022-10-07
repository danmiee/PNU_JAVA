package com.ruby.java.ch14;
/*
 * Generalization : int, float, String 등 데이터타입을 T로 표현
 * <-> Specialization(instantiation)
 */

// Generic Interface
interface MyFunc<T> {
	T modify(T t);
	// T타입의 t를 요소로 가짐
}

public class Test06 {

	public static void main(String[] args) {
		
		// Specialize Interface
		MyFunc<String> mf1 = (str) -> str.toUpperCase() + ":" + str.length();
		System.out.println(mf1.modify("java"));
		System.out.println(mf1.modify("java programming"));

		// Specialize Interface
		MyFunc<Integer> mf2 = (n) -> n * 2;
			/*
			 *  Integer타입의 n을 요소로 갖는 객체 mf2
			 *  modify 함수의 바디는 n*2
			 *  ∴ mf2.modify 결과는 n*2
			 */
		System.out.println(mf2.modify(23));
		System.out.println(mf2.modify(42));
	}
}