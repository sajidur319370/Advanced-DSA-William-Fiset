package indexedPriorityQueue;

public class Main {

	public static void main(String[] args) {

		MinIndexedDHeap<Integer> student = new MinIndexedDHeap<Integer>(12);

		for (int i = 0; i < 12; i++) {
			// Generate random number between 10 to 100
			student.insert(i, (int) (10 + Math.random() * 90));
		}

		for (int i = 0; i < 12; i++) {

			System.out.print(student.valueOf(i) + ",");
		}
		System.out.println("\b");
		System.out.println(student);
		System.out.println(student.peekMinKeyIndex());
		System.out.println(student.peekMinValue());

	}

}
