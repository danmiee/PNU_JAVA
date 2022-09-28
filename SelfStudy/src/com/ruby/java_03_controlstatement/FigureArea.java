package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class FigureArea {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int text, w, h, rac_a, tr_a;
		text = in.nextInt();
		w = in.nextInt();
		h = in.nextInt();
		rac_a = w * h;
		tr_a = (w * h) / 2;

		if (text == 3) {
			System.out.printf("삼각형 : 너비-%d, 높이-%d, 면적-%d", w, h, tr_a);
		} else if (text == 4) {
			System.out.printf("사각형 : 너비-%d, 높이-%d, 면적-%d", w, h, rac_a);
		} else {
			System.out.println("확인할 수 없습니다.");
		}

		in.close();
	}
}
