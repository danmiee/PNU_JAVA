package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class ToBinary {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int inputN = in.nextInt();

		System.out.println(Integer.toBinaryString(inputN));

		in.close();
	}
}
