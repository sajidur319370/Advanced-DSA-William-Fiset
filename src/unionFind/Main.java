package unionFind;

public class Main {

	public static void main(String[] args) {
		UnionFind uf = new UnionFind(10);
		uf.unify(0, 1);
		uf.unify(1, 2);
		uf.unify(3, 4);
		uf.unify(4, 5);
		uf.unify(6, 2);

		for (int i = 0; i < uf.size(); i++) {
			System.out.println("Element " + i + ": Representative = " + uf.find(i));
		}

	}

}
