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
		this.tail = node;
		this.length = 1;
	}

	public void append(Node node) {

		Node current = this.head;

		while (current.getNext() != null) {

			current = current.getNext();
		
		}

		current.setNext(node);	
		this.tail = (node);
	
	}

	public static pop() {

		Node current = this.head;
		Node beforeCurrent = current;

		while (current.getNext() != null) {

			beforeCurrent = current;
			current = current.getNext();
		} 

		this.tail = beforeCurrent;
		beforeCurrent.setNext(null);
	}

	public Node getNode(n) {

		int i = 0; 

		Node current = this.head;

		while (i < n) {

			current = current.getNext();
			i++
		}

	}

	public String toString() {

		String result = "";

		Node current = this.head;
		while (current != null) {

			result = result + " " + String.valueOf(current.getValue());
			current = current.getNext();

		}

		result = result.trim();
		result = result.replaceAll(" ", "-");

		return result;

	}

}
