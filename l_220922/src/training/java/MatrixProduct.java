package training.java;

public class MatrixProduct {

	public static void printArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		int[][] a = { { 2, 3, 4 }, { 5, 6, 7 } };
		int[][] b = { { 2, 3, 4, 5 }, { 4, 5, 6, 7 }, { 6, 7, 8, 9 } };
		int[][] c = new int[2][4];
		
		printArray(a);
		System.out.print("\n");
		
		printArray(b);
		System.out.print("\n");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < b.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		printArray(c);
	}
	
}
