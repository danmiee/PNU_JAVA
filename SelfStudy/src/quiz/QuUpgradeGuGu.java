package quiz;

public class QuUpgradeGuGu {

	public static void main(String[] args) {
		
		/*
		 * n의 거듭제곱
		 * 반복되는 것 : Xn
		 * 결과값 : n을 1번 곱한 것 ~ n을 9번 곱한 것
		 */
		
		for(int i=2; i<10; i++) {
			for(int j=0; j<9; j++) {
				if(j==0) {
					System.out.printf("%d X 1 = %d\n",i,i);
				} else {
					// n을 i번 곱하는 식과 결과 출력
					String data = " X " + i;
					String repeat = data.repeat(j);
					int result = (int) Math.pow(i, j+1);
					System.out.printf("%d%s = %s\n",i,repeat,result);				
				}
			}
		}
	}
}
