import java.util.LinkedList;

public class LinkedListExamplee {

	public static void main(String[] args) {

		LinkedList<String> obj = new LinkedList<String>();

		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.addFirst("D");
		obj.addLast("c");
		obj.add("f");
		obj.add("G");
		obj.add(2, "E");
		System.out.println("LinkedList:" + obj);

		obj.removeLast();
		obj.removeFirst();
		obj.remove(3);
		obj.removeFirst();
		obj.removeLast();
		System.out.println("LinkedList after deletion:" + obj);

		boolean tip = obj.contains("E");

		if (tip) {
			System.out.println("List contains the elements 'E'");
		} else {
			System.out.println("List doesnt contains the element 'E'");

		}
		// Size of linkedList

		int size = obj.size();

		// get and set elements in linkedList

		String element = obj.get(2);

		System.out.println("Elements returned by get():" + element);
		obj.set(2, "y");
		System.out.println("LinkedList after change:" + obj);

	}

}
