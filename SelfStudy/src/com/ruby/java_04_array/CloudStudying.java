package com.ruby.java_04_array;

public class CloudStudying {
/*
 * 클라우드 스터딩 사이트 접속자 수 배열로 출력하기
 * 서울:599명 / 부산:51명 / 인천:46명 / 대전:43명 / 대구:27명
 */
	public static void main(String[] args) {

		String [] location = {"서울","부산","인천","대전","대구"};
		int [] num = {599,51,46,43,27};
		
		for(int i=0; i<location.length; i++) {
			System.out.println(location[i] + " : " + num[i]);
		}
			
		
		
//		출력은 되지만 배열을 사용하는 의도와 맞지 않음
		
//		String [][] accessor = {
//				{"서울","599명"},
//				{"부산","51명"},
//				{"인천","46명"},
//				{"대전","43명"},
//				{"대구","27명"}
//		};
//		
//		for(int i=0; i<accessor.length; i++) {
//			System.out.println(Arrays.deepToString(accessor[i]));
//		}
		
	}

}
