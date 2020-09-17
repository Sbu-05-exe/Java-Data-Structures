public class Test {

	public static void main(String[] args) {

		Node defence = new Node(4);
		Node midfield = new Node(2);
		Node winger = new Node(3);
		Node strike = new Node(1);


		LinkedList ll = new LinkedList(defence);

		ll.append(midfield);
		ll.append(winger);
		ll.append(strike);
			
		System.out.println(ll);
		System.out.println("lenght: "ll.length);

	}
}