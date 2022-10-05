package com.ruby.java.ch11;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			int arr[] = new int[3];
			arr[2] = 30;
			System.out.println("OK");
			
			int divide = 5/0;
			System.out.println(divide);
			
//		} catch(ArrayIndexOutOfBoundsException e1) {
//			System.out.println(e1.getMessage());
//		} catch(ArithmeticException e2) {
//			System.out.println(e2.getMessage());
//		}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("done");
	}
}
