package ch04_stack_queue.date221026;

import java.awt.Point;

import ch04_stack_queue.Queen_fail.Stack2;

public class Queen {
	static final int N = 4;

	// print the final solution matrix
	static void printSolution(int board[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(" " + board[i][j] + " ");
			System.out.println();
			System.out.println();
		}
	}

	// function to check whether the position is safe or not
	static boolean isSafe(int board[][], int row, int col) {
		int i, j;

		return true;
	}

	// The function that solves the problem using backtracking
	public static boolean solveNQueen(int board[][]) {

		Stack2 st = new Stack2(20);
		int count = 0;
		int row = 0, col = 0;
		Point pt2 = new Point(0, 0);
		 
		while (count != N) {
			while (col < N) {
				if (isSafe(board, row, col)) {
					// push
					// row++
				} else {
					// pop
				}

				if (count <= N) {
					col++;
				}
			}
		}
		return true;
	}

	public static void main(String args[]) {
		int board[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

		if (!solveNQueen(board)) {
			System.out.print("Solution does not exist");
			return;
		}
		printSolution(board);
	}
}
