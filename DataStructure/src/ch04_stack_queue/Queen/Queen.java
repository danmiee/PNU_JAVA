package ch04_stack_queue.Queen;

import java.util.Arrays;
import ch04_stack_queue.date221019.Stack;

public class Queen {

	static int num = 8;
	// 각 열의 퀸 위치
	static int[] colpos = new int[num];
	// 각 행의 퀸 배치여부 체크
	static boolean[] checkRow = new boolean[num];
	// SW대각선 퀸 배치여부 체크
	static boolean[] checkSW = new boolean[num * 2 - 1];
	// SE대각선 퀸 배치여부 체크
	static boolean[] checkSE = new boolean[num * 2 - 1];
	// colpos 개수 세기
	static int cnt = 0;

	// i열의 알맞은 위치에 퀸 배치하기
	static void set(int i) {
		// j행에 대하여 반복
		Start: while (true) {
			int j = 0;
			// backtracking 위한 j스택
			Stack<Integer> jstk = new Stack<>();
			// 체크내용 모두 false면 배치
			while (j < num) {
				// SW, SE 인덱스는 4*4 샘플에서 추정 가능
				// 행,SW,SE 모두 퀸이 없으면
				if (!checkRow[j] && !checkSW[i + j] && !checkSE[i - j + (num - 1)]) {
					// i열의 퀸 위치는 j
					colpos[i] = j;
					// 모든 열에 배치가 완료되면 colpos 출력하고 반복문 종료
					if (i == 7) {
						Arrays.toString(colpos);
						cnt++;
					}
					// 
					else {
						// 체크완료 건 true로 표기
						checkRow[j] = checkSW[i + j] = checkSE[i - j + (num - 1)] = true;
						// 스택에 기록하고 다음으로 넘어가기
						jstk.push(j);
						i++;
						// 완료 전에는 j = 0부터 다시 반복 > 반복문 중첩 필요 & 반복위치 지정 위해 이름부여
						continue Start;
					}
				}
				// 체크내용 중 true 있으면 넘어가기
				j++;
			}
			// 0열까지 확인 후 종료
			if (--i == -1)
				return;
			// 
			j++;
		}
	}

	public static void main(String[] args) {
		set(0);
		System.out.println(cnt);
	}
}
