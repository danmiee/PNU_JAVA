package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class ZodiacOfBirth_switch {

	public static String zodiac(int birth) {
		switch(birth%12) {
		case 0 : return "¿ø¼þÀÌ¶ì";
		case 1 : return "´ß¶ì";
		case 2 : return "°³¶ì";
		case 3 : return "µÅÁö¶ì";
		case 4 : return "Áã¶ì";
		case 5 : return "¼Ò¶ì";
		case 6 : return "¹ü¶ì";
		case 7 : return "Åä³¢¶ì";
		case 8 : return "¿ë¶ì";
		case 9 : return "¹ì¶ì";
		case 10 : return "¸»¶ì";
		case 11 : return "¾ç¶ì";
		}
		return null;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int birth;
		
		System.out.println("[»ý³âÀ» ÀÔ·ÂÇÏ¸é ¶ì¸¦ È®ÀÎÇÒ ¼ö ÀÖ½À´Ï´Ù.]");
		System.out.println("- Á¾·á¸¦ ¿øÇÏ½Ã¸é 0À» ÀÔ·ÂÇÏ¼¼¿ä.-");
		
		while((birth = in.nextInt())!=0) {
			
			String zodiac = zodiac(birth);
			
			System.out.printf("%d³â => %s",birth,zodiac);
			
		}
		
		System.out.println("¼ö°íÇÏ¼Ì½À´Ï´Ù.");
	}

}
