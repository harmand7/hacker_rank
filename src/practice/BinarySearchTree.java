package practice;

import java.util.ArrayList;

public class BinarySearchTree {
	class Node {
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

		int data;
		Node left;
		Node right;
	}

	Node root = null;

	boolean checkBST(Node root) {
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		return inOrderCheck(root, min, max);
	}

	private boolean inOrderCheck(Node node, int min, int max) {
		if (node == null) return true;
		return min < node.data && node.data < max &&
				inOrderCheck(node.left, min, node.data) &&
				inOrderCheck(node.right, node.data, max);

	}

	void insert(int data){
		if (root == null){
			root = new Node(data);
		}else {
			insertHelper(root,data);
		}
	}

	private Node insertHelper(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		}else if(data > node.data) {
			node.right =  insertHelper(node.right, data);
		}else{
			node.left = insertHelper(node.left, data);
		}
		return node;
	}
}


