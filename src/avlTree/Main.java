package avlTree;

public class Main {

	public static void main(String[] args) {
		AVLTreeRecursive<Integer> student = new AVLTreeRecursive<Integer>();

		for (int i = 0; i < 22; i++) {
			student.insert((int) (Math.random() * 100));

		}
		System.out.println(student.toString());

	}

}
