import java.util.*;

public class CollectionDemo {
	public static void main(String[] args) {

		LinkedList<String> lst = new LinkedList<String>();

		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		lst.add(2, "E");

		System.out.println("--Iterating using for loop");
		for (int i = 0; i < lst.size(); i++)
			System.out.println(lst.get(i));

		System.out.println("- Iterating using Iterator");
		Iterator<String> itr = lst.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("- Iterating using for-each");
		for (String e : lst)
			System.out.println(e);

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("IBM");
		ar.add("Apple");
		ar.add("JBoss");

		ar.addAll(lst); // merging a collection into another
		System.out.println("Iterating over merged collection");
		for (String e : ar)
			System.out.println(e);

		HashSet<String> set = new HashSet<String>(ar);
		System.out.println("--Iterating over set collection");
		for (String e : set)
			System.out.println(e);

		TreeSet<String> tree = new TreeSet<String>(set);
		System.out.println("--Iterating over sorted collection");
		for (String e : tree)
			System.out.println(e);

		System.out.println("--Traversing over sorted collection using Advanced For-each ");
		tree.forEach(System.out::println);
	}

}
