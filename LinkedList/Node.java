public class Node {

	private int value;
	private Node next;

	public Node() {

		this.value = 0;
		this.next = null;

	}

	public Node(int x) {

		this.value = x;
		this.next = null;
	
	}

	public int getValue () {

		return this.value;
	
	}

	public Node getNext() {

		return this.next;

	}

	public void setNext(Node node) {

		this.next = node;

	}

	public String toString() {

		return Integer.toString(this.value);

	}

}