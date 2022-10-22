package com.easyspub.datastructure_04_stackqueue;

import java.util.Scanner;

import com.easyspub.datastructure_04_stackqueue.IntQueue.EmptyIntQueueException;
import com.easyspub.datastructure_04_stackqueue.IntQueue.OverflowIntQueueException;

public class IntQueueTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue q = new IntQueue(4);

		while (true) {
			System.out.println();
			System.out.printf("현재 데이터 개수: %d / %d\n", q.size(), q.getCapacity());
			System.out.println("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (0) 종료: ");

			int menu = sc.nextInt();
			if (menu == 0)
				break;

			int x;

			switch (menu) {

			case 1:
				System.out.println("데이터: ");
				x = sc.nextInt();
				// enque 실행
				// 예외상황 : overflow
				try {
					q.enque(x);
				} catch (OverflowIntQueueException e) {
					e.print();
				}
				break;

			case 2:
				// deque 실행
				// 예외상황 : empty
				try {
					x = q.deque();
					System.out.println("디큐한 데이터는 " + x + " 입니다.");
				} catch (EmptyIntQueueException e) {
					e.print();
				}
				break;

			case 3:
				// peek 실행
				// 예외상황 : empty
				try {
					x = q.peek();
					System.out.println("픽한 데이터는 " + x + " 입니다.");
				} catch (EmptyIntQueueException e) {
					e.print();
				}
				break;

			case 4:
				// dump 실행
				// 예외상황 : empty
				try {
					q.dump();
				} catch (EmptyIntQueueException e) {
					e.print();
				}
				break;

			}
		}
		sc.close();
	}
}
