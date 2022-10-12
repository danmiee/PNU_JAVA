package com.ruby.java_09_API;

public class Test09 {

	public static void main(String[] args) {
		// String의 단점 : 원본 변경 안됨 > 문자열 수정할 때마다 메모리에 새로운 문자열 생성 > 이전 문자열은 메모리 차지
		// StringBuffer, StringBuilder 공통점 : 버퍼에서 문자열 수정 > 효율적으로 메모리 관리

		// StringBuilder : 생성된 인스턴스에 동시 접근 상황 대처 불가
		StringBuilder sb = new StringBuilder("날이 좋아서 ");

		System.out.println(sb);
		// append : 매개변수로 전달받은 값 추가
		System.out.println(sb.append("날이 적당해서"));
		// insert : 첫번째 매개변수로 전달받은 위치 다음에 두번째 매개변수 삽입
		System.out.println(sb.insert(7, "날이 좋지 않아서 "));
		System.out.println(sb.append(" 모든 날이 좋았다 "));

		int start = sb.indexOf("모든 날이 좋았다 ");
		int end = sb.length();
		System.out.println(sb.replace(start, end, "너와 함께 한 시간 모두 눈부셨다"));

		// StringBuffer : 생성된 인스턴스에 동시 접근 상황 대처 가능

	}
}
