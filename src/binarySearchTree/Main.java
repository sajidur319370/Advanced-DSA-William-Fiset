package binarySearchTree;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree<Integer> question = new BinarySearchTree<Integer>();

		question.add(11);
		question.add(6);
		question.add(15);
		question.add(3);
		question.add(8);
		question.add(13);
		question.add(17);
		question.add(1);
		question.add(5);
		question.add(12);
		question.add(14);
		question.add(19);

		System.out.println(question.height());
		System.out.println(question.isEmpty());
		System.out.println(question.remove(10));

		System.out.println(question.traverse(TreeTraversalOrder.IN_ORDER));
		System.out.println(question.traverse(TreeTraversalOrder.PRE_ORDER));
		System.out.println(question.traverse(TreeTraversalOrder.POST_ORDER));
		System.out.println(question.traverse(TreeTraversalOrder.LEVEL_ORDER));

	}

}
