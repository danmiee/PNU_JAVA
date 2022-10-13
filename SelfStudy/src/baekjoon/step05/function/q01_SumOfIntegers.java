package baekjoon.step05.function;

//		Java: long sum(int[] a); (클래스 이름: Test)
//		a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
//		리턴값: a에 포함되어 있는 정수 n개의 합

public class q01_SumOfIntegers {
	
	long sum(int[] a) {
		long sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}

/* 실패! 메소드 없이 함수만 구현해야함 */
//	@SuppressWarnings("resource")
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] a = new int[n];
//		long sum = 0;
//		
//		for(int i=0; i<n; i++) {
//			a[i] = (int) Math.floor(Math.random()*1000000);
//			sum = sum + a[i];
//		}
//		System.out.println(sum);
//	}