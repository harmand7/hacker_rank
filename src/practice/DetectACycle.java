package practice;

import java.util.ArrayList;

public class DetectACycle {
	class Node {
		int data;
		Node next;
	}

	boolean hasCycle(Node head) {
		return head != null && hasCycle(head, new ArrayList<>());
	}

	private boolean hasCycle(Node node, ArrayList<Node> list){
		list.add(node);
		while (node.next != null){
			node = node.next;
			if (list.contains(node)) return true;
			list.add(node);
		}
		return false;
	}
}
