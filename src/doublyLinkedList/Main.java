package doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> roll = new DoublyLinkedList<Integer>();

		roll.add(6);
		roll.add(7);
		roll.add(8);
		roll.add(9);
		roll.add(10);

		System.out.println(roll.remove(6));

		System.out.println(roll.indexOf(9));
		System.out.println(roll);

	}

}
