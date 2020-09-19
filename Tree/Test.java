import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		Node granny = new Node("Granny");
		Node mommy = new Node("Mother");
		Node uncle = new Node("Uncle");
		Node aunty = new Node("Aunt");

		Node me = new Node("Me");
		Node sister = new Node("Sister");
		Node brother = new Node("Brother");

		Tree fam = new Tree(granny);

		granny.append(aunty);
		granny.append(mommy);
		granny.append(uncle);

		mommy.append(sister);
		mommy.append(me);
		mommy.append(brother);
		fam.display();

		fam.remove(me);
		fam.display();

		mommy.removeChildren();
		fam.display();

	
	}
}