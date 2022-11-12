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
		return "Node [data=" + data + ", llink=" + llink + ", rlink=" + rlink + "]";
	}
}

public class DoubledLinkedList<E> {
	//원형 이중 연결 리스트 클래스 - first node를 가짐

		private dNode<E> first; // 머리 포인터(참조하는 곳은 더미노드)
		
		// --- 생성자(constructor) ---//
		public DoubledLinkedList() {
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
//			dNode<E> prev = first.getLlink(); // 더미 노드의 앞쪽 노드
//			dNode<E> next = first.getRlink(); // 더미 노드의 뒤쪽 노드
////			// 머리가 비었으면 머리에 삽입하고 종료
////			if(ptr == null) {
////				next.setData(obj);
////				return;
////			}
//			// 노드가 비어있지 않은 동안 실행
//			while(next != null) {
//				// obj가 포인터보다 작으면 앞에 삽입하고 종료
//				if(c.compare(obj, next.getData()) <= 0) {
//					dNode<E> temp = new dNode<E>(obj, prev, first);
//					prev = temp;
//					return;
//				} else {
//					// obj가 포인터보다 크면 뒤쪽 노드 주목
//					first = next;
//				}
//			}
//			// 반복문 종료까지 삽입 못했으면 끝에 삽입
//			next.setData(obj);
			
			// 머리 노드가 뒤쪽 노드와 같으면 머리, 앞, 뒤 노드 모두 obj로 세팅
			if(first == first.getRlink()) {
				// data, 앞쪽 노드, 뒤쪽 노드를 모두 obj로 갖는 임시 노드 생성
				dNode<E> temp = new dNode<>(obj, first, first);
//				 머리에 obj 넣어주기
//				first.setData(obj);
//				// 머리 앞쪽 노드에 임시 노드 넣어주기
//				first.setLlink(temp);
				// 머리 뒤쪽 노드에 임시 노드 넣어주기
				first.setRlink(temp);
				// 메소드 종료
				return;
			}
			
			// 더미 노드의 뒤쪽 노드를 임시 노드로 세팅
			dNode<E> temp = first.getRlink();
			// 임시 노드의 뒤쪽 노드가 머리 노드와 같으면 반복 종료
			while(true) {
				// 입력값이 임시 노드보다 작거나 같을 때
				if(c.compare(obj, temp.getData()) <= 0) {
					// 넣어줄 새 노드 생성
					dNode<E> temp2 = new dNode<>(obj, temp.getLlink(), temp);
					// 임시 노드 앞에 새 노드 삽입
					temp.setLlink(temp2);
					// 메소드 종료
					return;
				}
				if(temp.getRlink() == first)
					break;
				// 뒤쪽 노드에 주목
				temp = temp.getRlink();
			}
			dNode<E> temp2 = new dNode<>(obj, temp, first);
			temp.setRlink(temp2);
		}

		// --- list에 삭제할 데이터가 있으면 해당 노드를 삭제 ---//
		public void delete(E obj, Comparator<? super E> c) {
			
	}
}
