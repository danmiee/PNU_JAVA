package com.ruby.java_03_controlstatement;

public class Intersection {

	public static void main(String[] args) {

		/*
		 * 두개의 직선좌표가 주어졌을 때 두 직선의 교차점을 구하라
		 * 직선좌표 : (x1,y1)-(x2,y2) / (x3,y3)-(x4,y4)
		 * 교점좌표 : (x,y)
		 * [case]
		 * 1. 기울기가 같다
		 * 	- y절편이 같다 : 일치 > same line
		 * 	- y절편이 다르다 : 불일치 > parallel lines
		 * 2. 기울기가 다르다
		 *  - 1점에서 만난다 > (x,y) 구하기
		 */

		float x1,y1,x2,y2,x3,y3,x4,y4;
		x1 = 0; y1 = 0; x2 = 1; y2 = 1;
		x3 = 0; y3 = 1; x4 = 1; y4 = 3;
		
		if ( ((y2-y1)/(x2-x1)) == ((y4-y3)/(x4-x3)) ) {
			if((y1-(((y2-y1)/(x2-x1))*x1)) == (y3-((y4-y3)/(x4-x3))*x3)) {
				System.out.println("same line");
			} else {
				System.out.println("parallel lines");
			}
		} else {
			float x,y;
			x = (((x3-x4)*((x1*y2)-(y1*x2)))-((x1-x2)*((x3*y4)-(y3*x4))))
					/(((x1-x2)*(y3-y4))-((y1-y2)*(x3-x4)));
			y = (((y3-y4)*((x1*y2)-(y1*x2)))-((y1-y2)*((x3*y4)-(y3*x4))))
					/(((x1-x2)*(y3-y4))-((y1-y2)*(x3-x4)));
			System.out.printf("교점좌표 : (%.0f,%.0f)",x,y);
		}
		
	}

}


