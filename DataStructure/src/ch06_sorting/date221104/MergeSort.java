package ch06_sorting.date221104;

public class MergeSort {

	// recursive로 구현: stack을 이용한 backtracking 구현은 너무 힘들다 > recursive 알고리즘 구현 실습
	static Stack<Point> st = new Stack<Point>();
	// --- 스택 활용하여 재귀적으로 병합 정렬 ---//
	static void merge(int[] a, int left, int right) {

		if (left < right) {
			int center = (left + right) / 2;
			Point pl = new Point(left, center);
			Point pr = new Point(center+1, right);

			// pl, pr에 대하여 재귀 적용
			merge(a, pl.getX(), pl.getY());
			merge(a, pr.getX(), pr.getY());
			
			// 배열요소 2개 이상이면 pr 스택에 담기
			if(a.length>1)
				st.push(pr);
			else {
				
			}

		}
	}

	// --- 병합 정렬 ---//
	static void MergeSort(int[] a, int left, int right) {

	}

	public static void main(String[] args) {
		int nx = 20;
		int[] x = new int[20];

		for (int ix = 0; ix < 20; ix++) {
			double d = Math.random();
			x[ix] = (int) (d * 50);
		}
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
		System.out.println();

		MergeSort(x, 0, nx - 1); // 배열 x를 퀵정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
	}
}
