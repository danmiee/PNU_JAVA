package com.easyspub.datastructure_04_stackqueue;
// int형 고정 길이 스택 사용(push, pop, peek, dump)

// 사용 메소드 추가(clear, indexOf, getCapacity, size, isEmpty, isFull)

import java.util.Scanner;

import com.easyspub.datastructure_04_stackqueue.IntStack.EmptyIntStackException;
import com.easyspub.datastructure_04_stackqueue.IntStack.OverflowIntStackException;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(4);

		while (true) {
			System.out.println();
			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.println("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 "
					+ "(5) 초기화 (6) 검색 (7) 용량 (8) 입력데이터 갯수 (9) empty여부 (10) full여부 " + "(0) 종료: ");

			// 원하는 동작 번호 입력
			int menu = sc.nextInt();
			// 입력값이 0이면 반복문 종료
			if (menu == 0)
				break;

			// menu값에 따른 switch-case 활용

			int x; // 배열요소로 사용할 필드 선언

			switch (menu) {

			case 1:
				// push값 입력받기
				System.out.println("데이터: ");
				x = sc.nextInt();
				// push 실행
				// 예외상황 : overflow
				try {
					s.push(x);
				} catch (OverflowIntStackException e) {
					e.print();
				}
				break;

			case 2:
				// pop 실행
				// 예외상황 : empty
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + " 입니다.");
				} catch (EmptyIntStackException e) {
					e.print();
				}
				break;

			case 3:
				// peek 실행
				// 예외상황 : empty
				try {
					x = s.peek();
					System.out.println("픽한 데이터는 " + x + " 입니다.");
				} catch (EmptyIntStackException e) {
					e.print();
				}
				break;

			case 4:
				// dump 실행
				// 예외상황 : empty
				try {
					s.dump();
				} catch (EmptyIntStackException e) {
					e.print();
				}
				break;

			case 5:
				// clear 실행
				s.clear();
				break;

			case 6:
				// x값 입력받아 indexOf 실행
				// 예외상황 : empty
				try {
					System.out.println("데이터: ");
					x = sc.nextInt();
					if(s.indexOf(x)==-1)
						System.out.println(x + "는 존재하지 않습니다.");
					else
						System.out.println(x + "의 index는 " + s.indexOf(x) + "입니다.");
				} catch (EmptyIntStackException e) {
					e.print();
				}
				break;
				
			case 7:
				// getCapacity 실행
				System.out.println("스택의 capacity는 " + s.getCapacity() + "입니다.");
				break;

			case 8:
				// size 실행
				System.out.println("현재 데이터 개수는 " + s.size() + "개 입니다.");
				break;
			
			case 9:
				// isEmpty 실행
				if(s.isEmpty())
					System.out.println("스택이 비어있습니다.");
				else
					System.out.println("스택이 비어있지 않습니다.");
				break;
				
			case 10:
				// isFull 실행
				if(s.isFull())
					System.out.println("스택이 가득차있습니다.");
				else
					System.out.println("스택이 가득차있지 않습니다.");
				break;
				
			}
		}
		sc.close();
	}
}
