package DataStructures.LinkedList;

public class InsertAtHead {

	Node Insert(Node head,int x) {
		Node temp = new Node();
		temp.data = x;
		temp.next = head;
		return temp;
	}

}
