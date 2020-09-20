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
		System.out.println("length: " + ll.length);

		Node thirdLine = ll.getNode(2);
		System.out.println("The third element in the list has contains the value " + thirdLine); 

		System.out.println();
		System.out.println("Remove the 3rd and 4th lines");
		ll.remove(2);
		ll.pop();

		System.out.println(ll);

		// append and prepend;

		ll.prepend(3);

		System.out.println();
		System.out.println("Final formation lineup");
		System.out.println(ll); 


	}
}