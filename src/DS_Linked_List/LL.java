package DS_Linked_List;

public class LL {

	private Node head;

	class Node {
		String data;
		Node next;

		Node(String Data) {
			this.data = Data;
			this.next = null;
		}
	}

	// add - first

	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;

		}

		newNode.next = head;
		head = newNode;
	}

	// add -last

	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		// Traversing a linked list
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}

		currNode.next = newNode;
	}

	// print
	public void printList() {

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + "-> ");
			currNode = currNode.next;
		}

		System.out.println("NULL");
	}

	// delete first
	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		// Node currNode = head;
		head = head.next;

	}

	// delete last
	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		if (head.next == null) {
			head = null;
			return;
		}

		Node secondLast = head;
		Node lastNode = head.next;

		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}

		secondLast.next = null;

	}

	public static void main(String args[]) {

		LL list = new LL();
		list.addFirst("ash1");
		list.addFirst("ash2");
		list.addLast("ash3");
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteLast();
		list.printList();

	}
}
