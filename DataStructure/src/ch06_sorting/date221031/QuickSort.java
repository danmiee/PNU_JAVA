package ch06_sorting.date221031;

import java.util.Arrays;

class Point {
	private int ix;
	private int iy;

	public Point(int x, int y) {
		ix = x;
		iy = y;
	}

	public int getX() {
		return ix;
	}

	public int getY() {
		return iy;
	}

	public void setX(int x) {
		ix = x;
	}

	public void setY(int y) {
		iy = y;
	}

	@Override
	public String toString() {
		return "P(" + ix + ", " + iy + ")";
	}
}

public class QuickSort {

	// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// --- 퀵 정렬(비재귀 버전)---//
	static void quickSort(int[] a, int left, int right) {

		Stack<Point> st = new Stack<Point>(50);
		Point pt = new Point(left, right);

		/*
		 * a[x]=1이고 오른쪽에 있는 4,2가 모두 1보다 크기 때문에 자리 변동이 없음 어떻게 해결해야할까?
		 * >> 한번더!  flag로 push 반복문 추가
		 * 
		 * st: P(0, 4) p: P(0, 4) x: 2 a(before): [5, 3, 1, 4, 2, 6, 7, 8, 9, 10]
		 * a(after): [1, 3, 5, 4, 2, 6, 7, 8, 9, 10]
		 */
		
		boolean flag = true;
		
		while (flag) {

			for (int i = 0; i < a.length; i++) {
				for (int j = a.length - 1; j > 0; j--) {
					if (a[j - 1] > a[j]) {
						flag = true;
						break;
					} else
						flag = false;
				}
			}
			
			st.push(pt);
//			System.out.print("st: ");
//			st.dump();

			while (st.isEmpty() != true) {
				Point p = st.pop();
//				System.out.println("p: " + p);

				int px = p.getX();
				int py = p.getY();
				int x = (px + py) / 2;
//				System.out.println("x: " + x);

//				System.out.println("a(before): " + Arrays.toString(a));
				if (px < x) {
					Point pl = new Point(px, x);
					st.push(pl);
				}
				if (x + 1 < py) {
					Point pr = new Point(x + 1, py);
					st.push(pr);
				}

				do {
					while (a[px] < a[x])
						px++;
					while (a[x] < a[py])
						py--;
					if (px <= py)
						swap(a, px++, py--);
				} while (px <= py);

//				System.out.println("a(after): " + Arrays.toString(a));

//				System.out.print("st: ");
//				st.dump();
			}
		}

	}

	public static void main(String[] args) {
		int nx = 10;
		int[] x = new int[10];
		for (int ix = 0; ix < 10; ix++) {
			double d = Math.random();
			x[ix] = (int) (d * 20);
		}
//		int[] x = { 5, 7, 1, 4, 6, 2, 3, 9, 8, 10 };
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
		System.out.println();

		quickSort(x, 0, nx - 1); // 배열 x를 퀵정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
	}
}
