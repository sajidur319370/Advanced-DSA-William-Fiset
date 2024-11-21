package unionFind;

public class UnionFind {

	// The number of elements in this union find
	private int totalElements;

	// Used to track the componentSize of each of the component
	private int[] componentSize;

	// parent[i] points to the parent of i, if parent[i] = i then i is a root node
	private int[] parent;

	// Tracks the number of components in the union find
	private int totalComponents;

	public UnionFind(int n) {

		if (n <= 0)
			throw new IllegalArgumentException("componentSize <= 0 is not allowed");

		totalElements = totalComponents = n;
		componentSize = new int[totalElements];
		parent = new int[totalElements];

		for (int i = 0; i < totalElements; i++) {
			parent[i] = i; // Link to itself (self root)
			componentSize[i] = 1; // Each component is originally of componentSize one
		}
	}

	// Find which component/set 'p' belongs to, takes amortized constant time.
	public int find(int p) {

		// Find the root of the component/set
		int root = p;
		while (root != parent[root])
			root = parent[root];

		// Compress the path leading back to the root.
		// Doing this operation is called "path compression"
		// and is what gives us amortized time complexity.
		while (p != root) {
			int next = parent[p];
			parent[p] = root;
			p = next;
		}

		return root;
	}

	// Return whether or not the elements 'p' and
	// 'q' are in the same components/set.
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}

	// Return the componentSize of the components/set 'p' belongs to
	public int componentcomponentSize(int p) {
		return componentSize[find(p)];
	}

	// Return the number of elements in this UnionFind/Disjoint set
	public int size() {
		return totalElements;

	}

	// Returns the number of remaining components/sets
	public int components() {
		return totalComponents;
	}

	// Unify the components/sets containing elements 'p' and 'q'
	public void unify(int p, int q) {

		// These elements are already in the same group!
		if (connected(p, q))
			return;

		int root1 = find(p);
		int root2 = find(q);

		// Merge smaller component/set into the larger one.
		if (componentSize[root1] < componentSize[root2]) {
			parent[root1] = root2;
			componentSize[root2] += componentSize[root1];
			componentSize[root1] = 0;
		} else {
			parent[root2] = root1;
			componentSize[root1] += componentSize[root2];
			componentSize[root2] = 0;
		}

		// Since the roots found are different we know that the
		// number of components/sets has decreased by one
		totalComponents--;
	}
}