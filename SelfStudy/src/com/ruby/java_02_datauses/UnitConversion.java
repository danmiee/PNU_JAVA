package com.ruby.java_02_datauses;

import java.util.Scanner;

public class UnitConversion {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt()*60;
		int y = x*60;
		int z = y*1224;
		
		System.out.printf("분속 : %dkm/m\n"
				+"시속 : %dkm/h\n"
				+"마하 : %dmach",x,y,z);
		
		in.close();
	}
}
