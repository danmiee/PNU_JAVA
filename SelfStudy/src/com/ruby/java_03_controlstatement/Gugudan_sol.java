package com.ruby.java_03_controlstatement;

public class Gugudan_sol {

	public void print(int x) {

		int i, j, k;
		
		for (i = 2; i < 10; i+=x) {
			
			for (j = 1; j < 10; j++) {
				/*
				 * i++ 상태로 2단계 for문 완성하면
				 * 첫째줄 : 2단 / 둘째줄 : 3단 ...
				 * 으로 출력됨
				 */
				for (k = 0; k < x; k++) {
					/*
					 *  단별로 출력하기 위해 필요한 부분
					 *  i+k로 출력해야 첫째줄이 각 단별 *1 수준만 출력됨
					 *  출력 시 입력하는 x값에 따라 원하는 단에서 줄바꿈 가능
					 */
					System.out.printf("%d*%d=%d", (i + k), j, (i + k) * j);
					// 구구단 내용 출력
					if (k < x - 1)		System.out.print("\t");
					// 해당 줄 안에서 단 사이를 탭으로 구분
					else				System.out.println();
					// 단 종료 후 줄바꾸기
					if (i + k >= 10)	break;
					// *9 수준까지 출력한 후 for(k)에서 빠져나가기
					}
				}
			System.out.println();
			}
		}

	public static void main(String[] args) {

		Gugudan_sol gg = new Gugudan_sol();
		gg.print(4);
	}
}
