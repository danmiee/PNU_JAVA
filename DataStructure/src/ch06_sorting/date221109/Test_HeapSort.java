package ch06_sorting.date221109;

public class Test_HeapSort {

	// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void makeHeap(int[] bx, int position, int value) {

		bx[position] = value;
		
		// 정렬
		for (int i = position; i > 0; i /= 2) {
			// 루트까지 돌고 반복문 중단
			if (i == 1)
				break;
			// value가 부모보다 작으면 반복문 중단
			else if (bx[i] < bx[i / 2]) {
				break;
			}
			// 반복문 중단되지 않았으면 자리 바꾸기
			swap(bx, i, i / 2);
		}
	}

	 static void useHeap(int []bx, int cnt) {
		 for(int i=0; i<cnt-1; i++) {
			 bx[i] = bx[i+1];
		 }
	 }

	// --- 힙 정렬 ---//
	static void heapSort(int[] a, int n) {
		int[] b = new int[n+1];
		for (int ix = 0; ix < a.length; ix++) {
			makeHeap(b, ix + 1, a[ix]);
		}
		useHeap(b, n+1);
		for (int i=0; i<n; i++)
			a[i]=b[i];
	}

	public static void main(String[] args) {

		// 배열 x 크기 고정
		final int count = 10;
		int[] x = new int[count];

		// x 요소값 랜덤부여
		for (int i = 0; i < count; i++) {
			x[i] = (int) (Math.random() * 30);
		}

		// 정렬전 x 출력
		System.out.println("정렬전:");
		for (int i = 0; i < count; i++)
			System.out.print(" " + x[i]);
		System.out.println();

		// 배열 x를 힙정렬
		heapSort(x, count);

		// 정렬후 x 출력
		System.out.println("정렬후: ");
		for (int i = 0; i < count; i++)
			System.out.print(" " + x[i]);
		System.out.println();
	}
}
