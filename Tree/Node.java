public class Node {

	public String label;
	Node[] children;

	public Node(String s) {

		this.label = s;
		this.children = null;

	}

	public Node() {

		this.label = null;
		this.children = null;
	
	}

	public String toString() {

		return this.label;

	}

	public boolean hasChildren() {

		return this.children != null;
	}

	public void printChildren() {

		if (this.children == null) {
			
			System.out.println("This node has no children");

		} else {

			for (Node child: this.children) {
				
				System.out.println(child);
			
			}


		}

	}

	public void append(Node node) {

		int size;
		boolean noChildren = this.children == null;

		if (noChildren) {
		
			size = 1;
		
		} else {

			size = this.children.length + 1;

		}
		
		Node[] temp = new Node[size];

		int i = 0;

		if (!noChildren) {

			for (Node child : this.children) {
				
				temp[i] = child;		
				i++;	
			
			}

		}

		temp[i] = node;

		this.setChildren(temp);

	}

	public boolean equals(Node that) {

		return this.label == that.label && this.children == that.children;

	}

	public void remove(Node child) {

		int size;

		if (this.children.length == 1) {

			this.children = null;
			size = 0;

		} else {

			size = this.children.length - 1;
		}


		Node[] temp = new Node[size];
		int i = 0;

		for (Node sibling: this.children) {

			if (!sibling.equals(child)) {

				temp[i] = sibling;
				i++;

			}

		}

		this.setChildren(temp);

	}

	public void removeChildren() {
		
		this.children = null;

	}

	public Node[] getChildren() {

		return this.children;

	}

	public void setChildren(Node[] newChildren) {

		this.children = newChildren;

	}

}