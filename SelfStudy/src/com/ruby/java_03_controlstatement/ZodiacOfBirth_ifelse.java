package com.ruby.java_03_controlstatement;

import java.util.Scanner;

public class ZodiacOfBirth_ifelse {

	public static String zodiac(int birth) {
		
		if(birth%12==0)			return "¿ø¼þÀÌ¶ì";
		else if(birth%12==1)	return "´ß¶ì";
		else if(birth%12==2)	return "°³¶ì";
		else if(birth%12==3)	return "µÅÁö¶ì";
		else if(birth%12==4)	return "Áã¶ì";
		else if(birth%12==5)	return "¼Ò¶ì";
		else if(birth%12==6)	return "¹ü¶ì";
		else if(birth%12==7)	return "Åä³¢¶ì";
		else if(birth%12==8)	return "¿ë¶ì";
		else if(birth%12==9)	return "¹ì¶ì";
		else if(birth%12==10)	return "¸»¶ì";
		else if(birth%12==11)	return "¾ç¶ì";
		else					return null;
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
