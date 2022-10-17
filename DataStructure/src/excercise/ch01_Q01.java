package excercise;

public class ch01_Q01 {

/*
 * 	네 값의 최댓값을 구하는 max4 메서드 작성
 * 	작성한 메서드를 테스트하기 위한 main 메서드 포함한 프로그램
 */
	static int max4(int a, int b, int c, int d) {
		
		int max = a;
		if(max<b)		max=b;
		if(max<c)		max=c;
		if(max<d)		max=d;
		
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println("max4(3,5,1,6) = " + max4(3,5,1,6));
		
	}
}
