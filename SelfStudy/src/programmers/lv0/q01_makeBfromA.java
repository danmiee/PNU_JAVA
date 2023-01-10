package programmers.lv0;

import java.util.Arrays;
import java.util.Scanner;

/* 

문자열 before와 after가 매개변수로 주어질 때,
before의 순서를 바꾸어 after를 만들 수 있으면 1을,
만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < before의 길이 == after의 길이 < 1,000
before와 after는 모두 소문자로 이루어져 있습니다.

 */

public class q01_makeBfromA {
	
	public static String sort(String str) {
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		String str_sort = new String(charArr);
		return str_sort;
	}
	
	public static int solution(String before, String after) {

		// before, after를 정렬하여 같으면 1, 다르면 0 리턴
		if (sort(before).equals(sort(after)))
			return 1;
		return 0;
		
		// 아래 코드는 before의 역순을 취했을 때 after가 나오는 경우
		// 문제에서는 before와 after의 모든 요소가 같으면 1을 반환하기 원함
//		String before_r = "";
//		
//		for (int i = before.length()-1; i>-1; i--) {
//			before_r += before.charAt(i);
//		}
//		
//		System.out.println("before_r: " + before_r);
//		System.out.println("after: " + after);
//		
//		if (before_r.equals(after))
//			return 1;
//		return 0;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("확인할 데이터 수를 입력하세요. (종료:0)");
		while((n = sc.nextInt())!=0) {
			System.out.println("첫번째 문자열을 입력하세요.");
			String before = sc.next();
			System.out.println("두번째 문자열을 입력하세요.");
			String after = sc.next();
			System.out.println(solution(before, after));
		}
		sc.close();
	}
	
}
