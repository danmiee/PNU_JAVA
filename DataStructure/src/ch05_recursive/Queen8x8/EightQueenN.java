package ch05_recursive.Queen8x8;

//연습5-10
//８퀸 문제를 비재귀적으로 풀이(배치 상황을 □와 ■으로 출력)

class EightQueenN {

	static int[] pos = new int[8];					// 각열의 퀸의 위치
	static boolean[] flag_a = new boolean[8];		// 각행에 퀸을 배치했는지 체크
	static boolean[] flag_b = new boolean[15];		// /대각선에 퀸을 배치했는지 체크
	static boolean[] flag_c = new boolean[15];		// ＼대각선에 퀸을 배치했는지 체크
	static int cnt = 0;

	//--- 배치 상황(각열의 퀸의 위치)을 출력 ---//
//	static void print() {
//		for (int i = 0; i < 8; i++) {
//			for (int j = 0; j < 8; j++)
//				System.out.printf("%s", j == pos[i] ? "■" : "□");
//			System.out.println();
//		}
//		System.out.println();
//	}
	
    //각 열의 퀸의 위치를 출력
    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.print(pos[i] + " ");
        }
        System.out.println();
    }

	//--- i열의 알맞은 위치에 퀸을 배치 ---//
	static void set(int i) {
		int j;
		int[] jstk = new int[8];

		// while 반복문에 Start라는 이름을 붙임
		Start : while (true) {
			j = 0;
			while (true) {
				while (j < 8) {
					if (!flag_a[j] && !flag_b[i + j] && !flag_c[i - j + 7]) {
						pos[i] = j;
						// 모든 열에 배치종료
						if (i == 7) {
							print();
							cnt++;
						}
						else {
							flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
							// i열의 행을 Push
							jstk[i++] = j;
							// Start 반복문을 계속 진행
							continue Start;
						}
					}
					j++;
				}
				if (--i == -1)
					return;
				// i열의 행을 Pop
				j = jstk[i];
				flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				j++;
			}
		}
	}

	public static void main(String[] args) {
		set(0);
		System.out.println(cnt);
	}
}

