package priorityQueue;

public class Main {

	public static void main(String[] args) {
		BinaryHeap<Integer> myNumbers = new BinaryHeap<Integer>(10);
		myNumbers.add(10);
		myNumbers.add(2);
		myNumbers.add(3);
		myNumbers.add(4);
		myNumbers.add(5);
		myNumbers.add(6);
		myNumbers.add(7);
		myNumbers.add(8);
		myNumbers.add(9);
		myNumbers.add(1);
		System.out.println(myNumbers.isMinHeap(8 /* root or any index */));
		System.out.println(myNumbers);

	}

}
