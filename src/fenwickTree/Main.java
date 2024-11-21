package fenwickTree;

public class Main {

	public static void main(String[] args) {

		/*
		 * FenwickTreeRangeQueryPointUpdate student = new
		 * FenwickTreeRangeQueryPointUpdate(11);
		 * 
		 * student.add(1, 1); student.add(2, 2); student.add(3, 3); student.add(4, 4);
		 * student.add(5, 5);
		 * 
		 * System.out.println(student.rangeSum(3, 5));
		 * System.out.println(student.get(5)); student.updatePoint(4, 9);
		 * System.out.println(student.get(4)); System.out.println(student.rangeSum(3,
		 * 5));
		 */

		FenwickTreeRangeUpdatePointQuery fruit = new FenwickTreeRangeUpdatePointQuery(new long[] { 1, 2, 3, 9, 5 });
		System.out.println(fruit.get(3));
		fruit.updateRange(3, 4, 1);
		System.out.println(fruit.get(4));
	}

}
