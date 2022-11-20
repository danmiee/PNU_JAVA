package ch08_list.date221115;

import java.util.Scanner;

class TreeNode {
	public int data;
	public TreeNode LeftChild;
	public TreeNode RightChild;

	public TreeNode(int data) {
		this.data = data;
		LeftChild = RightChild = null;
	}
}

class Tree {
	private TreeNode root;

	Tree() {
		root = null;
	};

	TreeNode InorderSucc(TreeNode current) {
		TreeNode temp = current.RightChild;
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

	// LVR
	void inorder(TreeNode CurrentNode) {
		if (CurrentNode != null) {
			inorder(CurrentNode.LeftChild);
			System.out.print(" " + CurrentNode.data);
			inorder(CurrentNode.RightChild);
		}
	}

	// VLR
	void preorder(TreeNode CurrentNode) {
		if (CurrentNode != null) {
			System.out.print(CurrentNode.data + " ");
			preorder(CurrentNode.LeftChild);
			preorder(CurrentNode.RightChild);
		}
	}

	// LRV
	void postorder(TreeNode CurrentNode) {
		if (CurrentNode != null) {
			postorder(CurrentNode.LeftChild);
			postorder(CurrentNode.RightChild);
			System.out.print(CurrentNode.data + " ");
		}
	}

	boolean Insert(int x) {// binary search tree를 만드는 입력
		// 노드 선언
		TreeNode crntNode = root;
		TreeNode newNode = new TreeNode(x);

		// 최초 노드 삽입
		if (root == null) {
			root = new TreeNode(x);
			System.out.println("insert: " + x);
			return true;
		}

		// crntNode가 null 아닌 동안 반복
		while (crntNode != null) {
			if (x == crntNode.data) {
				return false;
				// x가 crntNode의 data보다 작으면 left 주목
			} else if (x < crntNode.data) {
				// left가 null이면 newNode 삽입
				if (crntNode.LeftChild == null) {
					crntNode.LeftChild = newNode;
					System.out.println("insert: " + x);
					return true;
					// left가 존재하면 left를 루트로 만들어서 반복
				} else {
					crntNode = crntNode.LeftChild;
				}
				// x가 crntNode의 data보다 크면 rignt 주목
			} else if (x > crntNode.data) {
				// right가 null이면 newNode 삽입
				if (crntNode.RightChild == null) {
					crntNode.RightChild = newNode;
					System.out.println("insert: " + x);
					return true;
					// right가 존재하면 right를 루트로 만들어서 반복
				} else {
					crntNode = crntNode.RightChild;
				}
			}
		}
		return true;
	}

	boolean Delete(int x) {// binary search tree에서 x가 있으면 삭제하는 구현
		// x를 data로 갖는 노드 선언
		TreeNode delNode = root;
		TreeNode delParentNode = null;
		// 트리 내 존재여부 확인
		while (delNode != null && delNode.data != x) {
			// del 처리 시 부모노드 확인 위해 keep
			delParentNode = delNode;
			// x가 작으면 왼쪽 탐색
			if (x < delNode.data) {
				delNode = delNode.LeftChild;
				// x가 크면 오른쪽 탐색
			} else if (x > delNode.data) {
				delNode = delNode.RightChild;
			}
		}
		// 찾는 data 없으면 false 반환
		if(delNode == null) {
			return false;
		}
		// 단말노드인 경우
		if(delNode.LeftChild == null && delNode.RightChild == null) {
			// delNode가 부모의 왼쪽 노드면 왼쪽노드 제거
			if(delParentNode.LeftChild==delNode) {
				delParentNode.LeftChild = null;
			} else {
				delParentNode.RightChild = null;
			}
		}
		// 자식노드 하나인 경우
		else if (delNode.LeftChild == null || delNode.RightChild == null ) {
			// delNode가 부모의 왼쪽일 때
			if(delParentNode.LeftChild == delNode) {
				if(delNode.LeftChild != null) {
					delParentNode.LeftChild = delNode.LeftChild;
				} else {
					delParentNode.LeftChild = delNode.RightChild;
				}
			}
			// delNode가 부모의 오른쪽일 때
			else {
				if(delNode.RightChild != null) {
					delParentNode.RightChild = delNode.RightChild;
				} else {
					delParentNode.RightChild = delNode.LeftChild;
				}
			}
		}
		// 자식노드 둘인 경우
		else {
			// 교체용 노드 선언(삭제할 노드의 오른쪽 자식노드 > 가장 작은 값 필요)
			TreeNode replaceNode = delNode.RightChild;
			TreeNode replaceParentNode = delNode;
			// 교체용 노드 트리 중 가장 작은 값 찾기
			while(replaceNode.LeftChild != null) {
				replaceParentNode = replaceNode;
				replaceNode = replaceNode.LeftChild;
			}
			// 삭제 노드 위치에 교체용 노드 넣어주기
			delNode.data = replaceNode.data;
			// 교체용 노드가 부모의 왼쪽에 있으면
			if(replaceParentNode.LeftChild == replaceNode) {
				// 교체용 노드의 오른쪽 트리를 부모노드 왼쪽으로 연결
				replaceParentNode.LeftChild = replaceNode.RightChild;
			} 
			// 아니면 교체용 노드의 오른쪽 트리를 부모노드 오른쪽으로 연결
			else {
				replaceParentNode.RightChild = replaceNode.RightChild;
			}
		}
		return true;
	}
}

public class BinaryTree {
	public static void main(String[] args) {
		Tree t = new Tree();
		Scanner stdIn = new Scanner(System.in);
		int select = 0;
		while (select != 6) {
			System.out.println(
					"BinarySearchTree. Select 1:Insert, 2. Delete, 3:preorder, 4:postorder, 5. inorder, 6. Quit =>");

			select = stdIn.nextInt();
			switch (select) {
			case 1:
				System.out.println("The number of items = ");
				int nx = stdIn.nextInt();
				int[] input = new int[10];
				for (int ix = 0; ix < 10; ix++) {
					double d = Math.random();
					input[ix] = (int) (d * 20);
				}
				for (int i = 0; i < nx; i++) {
					if (t.Insert(input[i]) == false)
						System.out.println("Insert Duplicated data: " + input[i]);
				}
				break;
			case 2:
				// Delete
				System.out.println("The number of items = ");
				int deln = stdIn.nextInt();
				// 해당 값이 트리에 없으면 문구출력
				if (t.Delete(deln) == false) {
					System.out.println("Non-existent data: " + deln);
				}
				break;
			case 3:
				t.preorder();
				System.out.println();
				break;
			case 4:
				t.postorder();
				System.out.println();
				break;
			case 5:
				t.inorder();
				System.out.println();
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
		stdIn.close();
	}
}
