import java.util.Arrays;

public class LinkedList {
	
	private Node head;
	private Node tail;
	public int length;

	public LinkedList() {

		this.head = null;
		this.length = 0;

	}

	public LinkedList(Node node) {

		this.head = node;
		this.tail = this.head;
		this.length = 1;
	
	}

	public LinkedList(int x) {

		this.head = new Node(x);
		this.tail = this.head;
		this.length = 1;

	}

	public void append(Node newTail) {

		Node current = this.head;

		while (current.next != null) {

			current = current.next;
		
		}

		current.next = newTail;	
		this.tail = newTail;
	
	}

	public void prepend(int n) {
		
		this.prepend(new Node(n));
	
	}

	public void prepend(Node newHead) {

		newHead.next = this.head;
		this.head = newHead;

	}

	public void remove(int targetValue) {

		if (this.head.value == targetValue) {

			this.head = this.head.next;
			return;
		
		}

		Node current = this.head;

		while (current.next != null) {

			// since we are always checking for the next value we will never be able to check if
			// the head is the value that we want to remove so we will special case that above.
			if (current.next.value == targetValue) {

				current.next = current.next.next;
				return;
			
			}

			current = current.next;
			
		}

	}

	public void pop() {

		Node current = this.head;
		Node beforeCurrent = current;

		while (current.next.next != null) {

			current = current.next;

		} 

		this.tail = current;
		this.tail.next = null;
	}

	public Node getNode(int index) {

		int i = 0; 

		Node current = this.head;

		while (i < index) {

			current = current.next;
			i++;
		}

		return current;

	}

	public Node getHead() {

		return this.head;

	}

	public String toString() {

		String result = "";

		Node current = this.head;
		while (current != null) {

			result = result + " " + String.valueOf(current.value);
			current = current.next;

		}

		result = result.trim();
		result = result.replaceAll(" ", "-");

		return result;

	}

}
