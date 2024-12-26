package stack;

public class Main {

	public static void main(String[] args) {
		Stack<String> name = new Stack<>();
		name.push("Sajid");
		name.push("Majid");
		name.push("Kalam");
		name.push("Fahmid");

		System.out.println(name.pop());

	}

}
