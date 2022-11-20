package ch10_tree.date221120;
import java.util.Scanner;

class Student {
	  static final int NO   = 1;        // 번호를 읽어 들일까요?
	  static final int NAME = 2;        // 이름을 읽어 들일까요?

	  public Integer no;                      // 회원번호(키값)
	  public String  name;                    // 이름

	  //--- 키값 ---//
	  public Integer keyCode() {
	      return no;
	  }

	  //--- 문자열 표현을 반환 ---//
	  public String toString() {
	      return name;
	  }
	  public Student(Integer snum, String sname) {
	  	no = snum; name = sname;
	  }
	  public Student(Student s) {
	  	no = s.no; name = s.name;
	  }
	  public Student() {
	  	no = null; name = null;
	  }
	}

class TreeNode3 {
	public TreeNode3 LeftChild;
	public Student data;
	public TreeNode3 RightChild;

	public TreeNode3() {
		LeftChild = RightChild = null;
	}
	
	public TreeNode3(Student data) {
		this.data = data;
		LeftChild = RightChild = null;
	}
}

class Tree3 {
	private TreeNode3 root;

	Tree3() {
		root = null;
	}
	TreeNode3 InorderSucc(TreeNode3 current) {
		TreeNode3 temp = current.RightChild;
		if (current.RightChild != null)
			while (temp.LeftChild != null)
				temp = temp.LeftChild;
		return temp;
	}

	void inorder() {
		inorder(root);
	}

	void preorder() {
		preorder(root);
	}

	void postorder() {
		postorder(root);
	}

	void inorder(TreeNode3 CurrentNode) {
		if (CurrentNode != null) {
			inorder(CurrentNode.LeftChild);
			System.out.print(" " + CurrentNode.data);
			inorder(CurrentNode.RightChild);
		}
	}

	void preorder(TreeNode3 CurrentNode) {
		if (CurrentNode != null) {
			System.out.print(CurrentNode.data + " ");
			preorder(CurrentNode.LeftChild);
			preorder(CurrentNode.RightChild);
		}
	}

	void postorder(TreeNode3 CurrentNode) {
		if (CurrentNode != null) {
			postorder(CurrentNode.LeftChild);
			postorder(CurrentNode.RightChild);
			System.out.print(CurrentNode.data + " ");
		}
	}

	boolean Insert(Student input) {// binary search tree를 만드는 입력
		TreeNode3 crntNode = root;
		TreeNode3 newNode = new TreeNode3(input);
//구현해야 한다 
		// 최초 노드 삽입
		// crntNode가 null 아닌동안 반복
			// x와 crntNode 비교
			// <0 => left 주목
				// left null이면 newNode 삽입
				// left 존재하면 left를 루트로 반복
			// >0 => right 주목
				// right null이면 newNode 삽입
				// right 존재하면 right를 루트로 반복 
		return true;
	}

	boolean Delete(Integer x) {// binary search tree에서 x가 있으면 삭제하는 구현
//구현해야 한다 
		// x를 data로 갖는 노드 선언
			// 트리 내 존재여부 확인
				// del 처리 시 부모노드 확인 위해 keep
				// x가 작으면 왼쪽 탐색
					// x가 크면 오른쪽 탐색
			// 찾는 data 없으면 false 반환
			// 단말노드인 경우
			// 자식노드 하나인 경우
				// delNode가 부모의 왼쪽일 때
				// delNode가 부모의 오른쪽일 때
			// 자식노드 둘인 경우
				// 교체용 노드 선언(삭제할 노드의 오른쪽 자식노드 > 가장 작은 값 필요)
				// 교체용 노드 트리 중 가장 작은 값 찾기
				// 삭제 노드 위치에 교체용 노드 넣어주기
				// 교체용 노드가 부모의 왼쪽에 있으면
					// 교체용 노드의 오른쪽 트리를 부모노드 왼쪽으로 연결
				// 아니면 교체용 노드의 오른쪽 트리를 부모노드 오른쪽으로 연결
		return true;
	}
}

public class BinarySearchTree_Object {
	public static void main(String[] args) {
		Tree3 t = new Tree3();
		Scanner stdIn = new Scanner(System.in);
		int select = 0;
		while (select != 6) {
			System.out.println(1);
			System.out.println(
					"BinarySearchTree. Select 1:Insert, 2. Delete, 3:preorder, 4:postorder, 5. inorder, 6. Quit =>");

			select = stdIn.nextInt();
			switch (select) {
			case 1:
				System.out.println("The number of items = ");

				int nx = stdIn.nextInt();
				Student[] input = new Student[20];
				for (int ix = 0; ix < 4; ix++) {
					Integer snum = stdIn.nextInt();
					String sname = stdIn.next();
					//추가 코딩
				}
				for (int i = 0; i < nx; i++) {
					if ((t.Insert(input[i])) == false)
						System.out.println("Insert Duplicated data: " + input[i]);
				}
				break;
			case 2:
				// Delete
				break;
			case 3:
				t.preorder();
				System.out.println();
				break;
			case 4:
				t.postorder();
				break;
			case 5:
				t.inorder();
				break;
			case 6:
				System.out.println("Quit");
				break;

			default:
				System.out.println("WRONG INPUT  ");
				System.out.println("Re-Enter");
				break;
			}
		}
	}
}
