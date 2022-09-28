package com.ruby.java.p216;

import com.ruby.java.ch06.Armor;

public class JVM {

	public static void main(String[] args) {
		
//		int n = 10;
		
		Armor a = new Armor(); 
		/* new Armor : 객체
		 * n, a : local variant
		 * [JVM]
		 * code / heep(메모리 동적발단-new) / stack(참조변수-n,a)
		 */
		a.getName();
	}
}
