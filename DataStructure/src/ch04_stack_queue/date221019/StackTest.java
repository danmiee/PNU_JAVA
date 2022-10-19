package ch04_stack_queue.date221019;

import java.util.Scanner;

public class StackTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<>(3);

		int menu = -1;

		System.out.println();
		System.out.printf("현재 데이터 갯수: %d / %d\n", s.size(), s.getCapacity());
		System.out.println("원하는 작업 번호를 입력하세요");
		System.out.print("(1)푸시  (2)팝  (3)피크  (4)덤프  (0)종료");
		
		while ((menu = sc.nextInt()) != 0) {

				Integer x;
				
				switch (menu) {
				
				case 1: // 푸시
					System.out.print("데이터 : ");
					x = (Integer) sc.nextInt();
					if (s.size() == s.getCapacity())
						System.out.println("스택이 가득차있습니다.");
					else {
						s.push(x);
						System.out.printf("현재 데이터 갯수: %d / %d\n", s.size(), s.getCapacity());
					}
					break;
					
				case 2: // 팝
					if (s.getCapacity() == 0)
						System.out.println("스택이 비어있습니다.");
					else {
						x = s.pop();
						System.out.println("팝한 데이터는 " + x + "입니다.");
					}
					break;
					
				case 3: // 피크
					if (s.getCapacity() == 0)
						System.out.println("스택이 비어있습니다.");
					else {
						x = s.peek();
						System.out.println("피크한 데이터는 " + x + "입니다.");
					}
					break;
					
				case 4: // 덤프
					s.dump();
					break;
			}
		}
		sc.close();
	}
}
