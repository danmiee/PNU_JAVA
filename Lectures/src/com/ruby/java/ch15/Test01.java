package com.ruby.java.ch15;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Test01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(50);
		myList.add(10);
		myList.add(80);
		myList.add(70);
		myList.add(90);
		myList.add(60);
		myList.add(20);
		
		System.out.println("점수 목록 : ");
		Stream<Integer> myStream = myList.stream();
		myStream.forEach((n) -> System.out.println(n+" "));
		System.out.println();
		
		/* Optional 클래스
		 *  : 스트림 연산의 최종값을 가지는 컨테이너 성격의 객체
		 *  - 스트림 연산의 결과값 사용 전 반드시 구현해야하는 유효성 검사 코드를 메소드로 제공함
		 */
		Optional<Integer> minVal = myList.stream().min(Integer::compare);
		System.out.println("최저 점수 : " + minVal.get());

		Optional<Integer> maxVal = myList.stream().max(Integer::compare);
		System.out.println("최고 점수 : " + maxVal.get());

		System.out.print("점수 정렬 : ");
		Stream<Integer> myStream2 = myList.stream().sorted();
		myStream2.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		System.out.print("낙제 점수 : ");
		Stream<Integer> failScore = myList.stream().filter((n) -> n < 60);
		failScore.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		System.out.print("점수 합계 : ");
		Optional<Integer> totalScore = myList.stream().reduce((a, b) -> a + b);
		System.out.println(totalScore.get());

		System.out.print("5점 추가 : ");
		Stream<Integer> addScore = myList.stream().map((n) -> n + 5);
		addScore.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		long cnt = myList.stream().count();
		System.out.println("점수 개수 : " + cnt);

		System.out.println("점수 평균 : " + totalScore.get() / cnt);
		
	}
}
