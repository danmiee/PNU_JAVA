package ch05_recursive.Queen8x8;

public class Queen {
    //에를 들어 pos 배열이 [7,7,7,7,7,7,7,7]이면 모든 열의 퀸이 7행에 배치되어 있는 것.
    static boolean[] flag_a = new boolean[8]; //각 행에 퀸을 배치했는지 체크
    static boolean[] flag_b = new boolean[15]; // / 대각선 방향으로 퀸을 배치했는지 체크
    static boolean[] flag_c = new boolean[15]; // \ 대각선 방향으로 퀸을 배치했는지 체크
    static int[] pos = new int[8]; //각 열의 퀸의 위치
    static int cnt = 0;

    //각 열의 퀸의 위치를 출력
    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.print(pos[i] + " ");
        }
        System.out.println();
    }

    //i열에 퀸을 배치
    static void set(int i) {
        for (int j = 0; j < 8; j++) {
            // / 방향 대각선을 체크하는 배열의 인덱스는 i + j
            // \ 방향 대각선을 체크하는 배열의 인덱스는 i - j + 7
            if (!flag_a[j] && !flag_b[i + j] && !flag_c[i - j + 7]) { //j 행에 배치된 퀸이 없다면,
            	//퀸을 j행에 배치
            	pos[i] = j;
            	//모든 열에 배치 완료
                if (i == 7) {
                	cnt++;
                    print();
                } else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7]= true;
                    //다음 열에 퀸을 배치
                    set(i + 1);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7]= false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
        System.out.println(cnt);
    }
}
