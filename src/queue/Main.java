package queue;

public class Main {

	public static void main(String[] args) {
		Queue<String> name = new Queue<String>();

		name.offer("Sajid");
		name.offer("Akmal");
		name.offer("Gulbadin");
		name.offer("Najibullah");
		name.offer("Kur");
		System.out.println(name.poll());
		System.out.println(name.peek());
	}

}
