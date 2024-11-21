package dynamicArray;

public class Main {

	public static void main(String[] args) {
		DynamicArray<String> ar = new DynamicArray<String>(5);
		ar.add("Golam");
		ar.add("Moula");
		ar.add("Kamal");
		ar.add("Ataur");

		for (int i = 0; i < ar.size(); i++)
			System.out.print(ar.get(i) + " ");

		System.out.println();
		System.out.println(ar);

	}

}
