package ch08_list.date221111;

import java.util.Comparator;

// 연결 리스트 클래스
class Node<E> {
	private E data; // 데이터
	private Node<E> next; // 뒤쪽 포인터(다음 노드에 대한 참조)

	public Node() {
		this.data = null;
		this.next = null;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	// --- 생성자(constructor) ---//
	Node(E data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
}

public class LinkedList<E> {

	private Node<E> head; // 머리 포인터(머리 노드에 대한 참조)

	// --- 생성자(constructor) ---//
	public LinkedList() {
		head = null;
	}

	// --- 노드 검색 ---//
	public E search(E obj, Comparator<? super E> c) { // <? super E>는 wild card로서 E의 subclass에 대하여 모두 적용
		Node<E> ptr = head; // 현재 스캔 중인 노드

		while (ptr != null) {
			if (c.compare(obj, ptr.getData()) == 0) { // 검색 성공
				return ptr.getData();
			}
			ptr = ptr.getNext(); // 뒤쪽 노드에 주목
		}
		return null; // 검색 실패
	}

	// --- 꼬리 노드 삽입 ---//
	public void add(E obj, Comparator<? super E> no, Comparator<? super E> name) {
		// 포인터 헤드에 두기
		Node<E> ptr = head, q = head;
		Node<E> crnt = new Node<E>(obj);
		// 머리가 비었으면 머리에 삽입하고 종료
		if (head == null) {
			head = crnt;
			return;
		}
		// 포인터가 비어있지 않은 동안 실행
		while (ptr != null) {
			if (no.compare(obj, ptr.getData()) <= 0) {
				if (name.compare(obj, ptr.getData()) <= 0) {
					// obj가 포인터보다 작으면 앞에 삽입하고 종료
					q.setNext(crnt);
					crnt.setNext(ptr);
					return;
				}
			} else {
				// obj가 포인터보다 크면 뒤쪽 노드 주목
				q = ptr;
				ptr = ptr.getNext();
			}
		}
		// 반복문 종료까지 삽입 못했으면 끝에 삽입
		q.setNext(crnt);
	}

	// --- 노드 삭제 ---//
	public void delete(E obj, Comparator<? super E> no, Comparator<? super E> name) { // 전달 객체를 삭제
		// 포인터 헤드에 두기
		Node<E> ptr = head, q = head;
		if(no.compare(obj, head.getData()) == 0)
			if(name.compare(obj, head.getData()) == 0) {
				// 번호와 이름이 모두 머리와 일치하면 머리에 뒤쪽 노드 삽입하고 종료
				head = head.getNext();
				return;
			}

		while (ptr != null) {
			// 번호와 이름이 일치할 때만 실행
			if (no.compare(obj, ptr.getData()) == 0) {
				if (name.compare(obj, ptr.getData()) == 0) {
					// 뒤쪽 노드가 null이 아니면 현재 위치에 뒤쪽 노드 삽입하고 종료
					if (ptr != null) {
						q.setNext(ptr.getNext());
						return;
					}
				}
			} else {
				// 일치하지 않으면 뒤쪽 노드 주목
				q = ptr;
				ptr = ptr.getNext();
			}
		}
		// 반복문 종료까지 삭제 못했으면 null 처리
		ptr = null;
	}

	// --- 전체 노드 표시 ---//
	public void show() {
		Node<E> ptr = head;

		while (ptr != null) {
			System.out.println(ptr.getData());
			ptr = ptr.getNext();
		}
	}
}
