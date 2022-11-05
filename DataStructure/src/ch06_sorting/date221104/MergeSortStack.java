package ch06_sorting.date221104;

public class MergeSortStack {

	// recursive로 구현: stack을 이용한 backtracking 구현은 너무 힘들다 > recursive 알고리즘 구현 실습
	static Stack<Point> st = new Stack<Point>();

	// --- 스택 활용하여 재귀적으로 병합 정렬 ---//
	static void merge(int[] x, int lefta, int righta, int leftb, int rightb) {

		// 원스택 활용을 위한 포인트 설정
		Point pa = new Point(lefta, righta);
		Point pb = new Point(leftb, rightb);
		System.out.println("pa: " + pa + "  pb: " + pb);

		// 배열요소가 1개일 때(left==right) 재귀종료
		if (lefta < righta) {
			System.out.println("pa: " + pa + "  pb: " + pb);

			// 오른쪽 스택에 담기
			st.push(pb);
			System.out.print("push st: ");
			st.dump();

			// pa에 재귀 적용
			int ac = (lefta + righta) / 2;
			System.out.println("ac: " + ac);

			merge(x, lefta, ac, ac + 1, righta);

			// 정렬
			for (int i = lefta; i < righta; i++) {
				System.out.println("[정렬전] x[lefta]: " + x[lefta] + "  x[righta]: " + x[righta]);
				if (x[lefta] > x[righta]) {
					int temp = x[lefta];
					x[lefta] = x[righta];
					x[righta] = temp;
				}
				System.out.println("[정렬후] x[lefta]: " + x[lefta] + "  x[righta]: " + x[righta]);
			}
		}

		// 배열요소가 1개이거나 정렬이 완료되면 pop
		pa = st.pop();
		System.out.println("pa(st.pop): " + pa);
	}

	// --- 빌트인 메소드 ---//
	static void mergeSort(int[] x, int left, int right) {
		// 배열 분리 기준점
		int center = (left + right) / 2;

		// 분리한 배열 머지정렬
		merge(x, left, center, center + 1, right);
	}

	public static void main(String[] args) {
//		int nx = 20;
//		int[] x = new int[20];
//
//		for (int ix = 0; ix < 20; ix++) {
//			double d = Math.random();
//			x[ix] = (int) (d * 50);
//		}
		int nx = 10;
		int[] x = { 4, 2, 8, 6, 0, 5, 1, 7, 3, 9 };

		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
		System.out.println();

		mergeSort(x, 0, nx - 1); // 배열 x를 머지정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
	}
}
