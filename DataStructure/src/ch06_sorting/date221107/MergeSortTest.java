package ch06_sorting.date221107;

import java.util.Arrays;

public class MergeSortTest {

	static void merge(int[] a, int lefta, int righta, int leftb, int rightb ) {
		int[] arr1 = Arrays.copyOfRange(a, lefta, righta);
        int[] arr2 = Arrays.copyOfRange(a, leftb, rightb);
        int[] arr3 = new int[a.length];
        
        int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			} else if (arr1[i] > arr2[j]) {
				arr3[k] = arr2[j];
				j++;
				k++;
			} else {
				arr3[k] = arr1[i];
				i++;
				k++;
				j++;
			}
		}
		while (i < arr1.length) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}

		while (j < arr2.length) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
	}

	static void MergeSort(int[] a, int left, int right) {
		
		int center = (left + right)/2;

		if(left<right) {
			
			MergeSort(a, left, center);
			MergeSort(a, center+1, right);	
		
		for(int i=0; i<a.length-1; i++) {
			int j=i+1;
			if(a[i]>a[j]) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		merge(a, left, center, center+1, right);
		
		}
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
