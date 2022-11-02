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

		st.push(pt);
		System.out.print("st: ");
		st.dump();

		while(st.isEmpty() != true) {
			Point p = st.pop();
			System.out.println("p: " + p);
			
			int px = p.getX();
			int py = p.getY();
			int x = (px+py)/2;
			System.out.println("x: " + x);
			
			do {
				while (a[left] < a[px])
					px++;
				while (a[py] < a[right])
					py--;
				if(px <= py)
					swap(a, px++, py--);
			} while(px <= py);
			
			if(left < x) {
				Point pl = new Point(left, x);
				Point pr = new Point(x+1, right);
				st.push(pl);
				st.push(pr);
				System.out.print("st: ");
				st.dump();
			}
		}
	}

	public static void main(String[] args) {
		int nx = 10;
//		int[] x = new int[10];
//		for (int ix = 0; ix < 10; ix++) {
//			double d = Math.random();
//			x[ix] = (int) (d * 20);
//		}
		int[] x = { 5, 7, 1, 4, 6, 2, 3, 9, 8, 10 };
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
		System.out.println();

		quickSort(x, 0, nx - 1); // 배열 x를 퀵정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
	}
}
