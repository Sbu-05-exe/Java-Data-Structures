public class Node {

	public int value;
	public Node next;

	public Node(int x) {

		this.value = x;
		this.next = null;

	}

	public Node() {

		this.value = 0;
		this.next = null;
	}

	public String toString() {

		return Integer.toString(this.value);

	}
}
