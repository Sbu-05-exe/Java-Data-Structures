public class Tree {

	private Node root;
	private String name;
	public int height = 0;

	// Initialize the tree

	public Tree(Node root, String name) {

		this.root = root;
		this.name = name;

	}

	public Tree(Node root) {

		this.root = root;
		this.name = null;

	}

	public Tree() {

		this.root = null;
		this.name = null;
	
	}

	public void setRoot() {

		this.root  = null;
	
	}

	public void removeChildren(Node parent) {

		// removing all children from a node
		parent.setChildren(null);

	}

	public void remove(Node node) {

		// to remove a nood we need to find its parent and then use the node class to remove 
		// a specific child
		if (this.root == node) {
			
			this.root = null;
		
		}

		this.helpRemove(this.root, node);

	}

	private void helpRemove(Node parent, Node target) {

		if (parent.hasChildren()) {

			for (Node child: parent.getChildren()) {

				if (child.equals(target)) {

					parent.remove(child);

				}


				if (child.hasChildren()) {
					
					helpRemove(child, target);

				}

			}


		}

		

	}

	public void display(){

		if (this.name != null) {
			
			System.out.println(this.name);

		}

		helpDisplay(this.root, 0);
		System.out.println();

	}

	private void helpDisplay(Node node, int depth) {

		String formatting = "";
		if (depth > 0) {

			formatting = "|__";

			for (int i = 0; i < depth - 1; i++) {

				formatting = "    " + formatting;

			}
		}

		System.out.println(formatting + node.toString());

		if (node.hasChildren()) {

			for (Node child: node.getChildren()) {

				helpDisplay(child, depth + 1);

			}

		}

	}

}