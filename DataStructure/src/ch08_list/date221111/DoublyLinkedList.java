package ch08_list.date221111;

import java.util.Comparator;

// --- 노드 ---//
class dNode<E> {
	private E data; // 데이터
	private dNode<E> llink; // 앞쪽포인터(앞쪽 노드에 대한 참조)
	private dNode<E> rlink; // 뒤쪽포인터(뒤쪽 노드에 대한 참조)

	// --- 생성자(constructor) ---//
	public dNode() {
		this.data = null;
		llink = rlink = this;
	}

	public dNode(E data, dNode<E> llink, dNode<E> rlink) {
		this.data = data;
		this.llink = llink;
		this.rlink = rlink;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public dNode<E> getLlink() {
		return llink;
	}

	public void setLlink(dNode<E> llink) {
		this.llink = llink;
	}

	public dNode<E> getRlink() {
		return rlink;
	}

	public void setRlink(dNode<E> rlink) {
		this.rlink = rlink;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", llink=" + llink.data + ", rlink=" + rlink.data + "]";
	}
}

public class DoublyLinkedList<E> {
	// 원형 이중 연결 리스트 클래스 - first node를 가짐

	private dNode<E> first; // 머리 포인터(참조하는 곳은 더미노드)

	// --- 생성자(constructor) ---//
	public DoublyLinkedList() {
		first = new dNode<E>(); // dummy(first) 노드를 생성
	}

	// --- 리스트가 비어있는가? ---//
	public boolean isEmpty() {
		return first.getRlink() == first;
	}

	// --- 노드를 검색 ---//
	public E search(E obj, Comparator<? super E> c) {
		dNode<E> ptr = first.getRlink(); // 현재 스캔 중인 노드

		while (ptr != first) {
			if (c.compare(obj, ptr.getData()) == 0) {
				return ptr.getData(); // 검색 성공
			}
			ptr = ptr.getRlink(); // 뒤쪽 노드에 주목
		}
		return null; // 검색 실패
	}

	// --- 전체 노드 표시 ---//
	public void show() {
		dNode<E> ptr = first.getRlink(); // 더미 노드의 뒤쪽 노드

		while (ptr != first) {
			System.out.println(ptr.getData());
			ptr = ptr.getRlink();
		}
	}

	// --- 올림차순으로 정렬이 되도록 insert ---//
	public void add(E obj, Comparator<? super E> c) {
		// 머리 노드가 뒤쪽 노드와 같으면 뒤쪽 노드 obj로 세팅
		if (first == first.getRlink()) {
			// 매개변수 값을 넣은 포인터 선언
			dNode<E> ptr = new dNode<>(obj, first, first);
			// 머리 뒤쪽 노드에 포인터 삽입
			first.setRlink(ptr);
			// 메소드 종료
			return;
		}

		// 머리 노드의 뒤쪽 노드를 임시 노드로 선언
		dNode<E> tempL = first.getLlink();
		dNode<E> tempR = first.getRlink();
		while (true) {
			// 입력값이 임시 노드보다 작거나 같을 때
			if (c.compare(obj, tempR.getData()) <= 0) {
				// 매개변수를 값으로 하는 포인터 선언
				dNode<E> ptr = new dNode<>(obj, tempR.getLlink(), tempR);
				// 임시 노드 앞쪽 노드에 포인터 삽입 - 앞쪽 노드의 Rlink와 뒤쪽 노드의 Llink 일치해야 정상 출력됨
				tempL.setRlink(ptr);
				tempR.setLlink(ptr);
				System.out.println(ptr);
				System.out.println(tempR);
				// 메소드 종료
				return;
			}
			// 임시 노드의 뒤쪽 노드가 머리 노드와 같으면 반복 종료
			if (tempR.getRlink() == first)
				break;
			// 뒤쪽 노드에 주목
			tempL = tempR;
			tempR = tempR.getRlink();
		}
		// 마지막에 넣을 포인터 선언
		dNode<E> ptr = new dNode<>(obj, tempR, first);
		// 임시 노드 뒤쪽 노드에 포인터 삽입
		tempR.setRlink(ptr);
	}

	// --- list에 삭제할 데이터가 있으면 해당 노드를 삭제 ---//
	public void delete(E obj, Comparator<? super E> c) {
		
	}
}
