package com.ruby.java.ch06;
/*
 * code를 보고 static이 무엇을 의미하는지 알아야함
 */
class Count {
	public static int totalCount;
	int count;
	/*
	 * count, totalcount의 차이점
	 * count : default 선언자(0)
	 *  ㄴ 해당 패키지 내에서 그냥 가져다 쓸 수 있음
	 * totalcount
	 *  ㄴ static(code영역 공간할당) <-> dynamic(new-JVM Garbage Collection)
	 */
}

public class CountTest {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int count = 0;
		Count.totalCount = 10;
		
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();

		c1.count++;
		Count.totalCount++;
		c2.count++;
		Count.totalCount++;
		c3.count++;
		Count.totalCount++;
		/*
		 * class명(c1,c2,c3) 삭제 시
		 * 메인 변수 선언이 없으므로 error!!
		 * > main 내에서 count 재정의 시 사용가능
		 * > 해당 상황의 경우 count++; 과 c2.count++;의 count는 전혀 다른 의미임 
		 */

		System.out.println(Count.totalCount + " : " + c1.count);
		System.out.println(Count.totalCount + " : " + c2.count);
		System.out.println(Count.totalCount + " : " + c3.count);
	}

}
/*
 * [공유]
 * c1 : stack
 * c1.count : heep
 * totalCount : code
 * count는 객체마다의 값을 따로 가지고 있음
 * totalCount는 1개의 값을 가리킴
 */