package practice;

import java.util.ArrayList;

public class DetectACycle {
	class Node {
		int data;
		Node next;
	}

	boolean hasCycle(Node head) {
		if (head == null) {return false;}
		ArrayList<Node> list = new ArrayList<>();
		Node node = head;
		list.add(node);
		while (node.next != null){
			node = node.next;
			if (list.contains(node)) return true;
			list.add(node);
		}
		return false;
	}

}
