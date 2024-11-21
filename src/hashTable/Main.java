package hashTable;

public class Main {

	public static void main(String[] args) {
		/*
		 * HashTableSeparateChaining<Integer, String> student = new
		 * HashTableSeparateChaining<Integer, String>(7);
		 */

		/*
		 * HashTableOpenAddressingLinearProbing<Integer, String> student = new
		 * HashTableOpenAddressingLinearProbing<Integer, String>( 6);
		 */

		HashTableOpenAddressingQuadraticProbing<Integer, String> student = new HashTableOpenAddressingQuadraticProbing<Integer, String>(
				6);

		student.add(1, "Mostofa");
		student.add(2, "Kamal");
		student.add(3, "Rasel");
		student.add(4, "Ahmed");
		student.add(5, "Wasif");
		student.add(6, "Reza");

		System.out.println(student);

	}

}
