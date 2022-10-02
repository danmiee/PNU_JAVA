package baekjoon.step02.conditional;

import java.util.Scanner;

public class q07_ThreeDice {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		int rew;
		int max = Math.max(dice1, Math.max(dice2, dice3));
		
		if(dice1==dice2 && dice2==dice3) {
			rew = 10000+(dice1*1000);
			System.out.println(rew);
		} else if((dice1==dice2 && dice1!=dice3) ||
				(dice1==dice3 && dice1!=dice2)) {
			rew = 1000+(dice1*100);
			System.out.println(rew);
		} else if(dice2==dice3 && dice1!=dice2) {
			rew = 1000+(dice2*100);
			System.out.println(rew);
		} else {
			rew = max*100;
			System.out.println(rew);
		}
	}

}
