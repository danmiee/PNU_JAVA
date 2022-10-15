package baekjoon.step06.string;

import java.util.Scanner;

public class AsciiCode {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char ch = input.charAt(0);
		int ascii = (int) ch;
		
		if(input.length()==1) {
			System.out.println(ascii);
		} else {
			System.out.println("글자를 하나만 입력하세요");
		}
		
	}
}