import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	static int head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	  
	
	public static void main(String[] args) {
		LinkedList<Integer> aa= new LinkedList();
		
		
		aa.add(1);
		aa.add(2);
		aa.add(2, 3);
		aa.add(3,4);
		aa.add(4,5);
		
		int p=aa.size();
		Iterator<Integer> itr= aa.iterator();
	 while(itr.hasNext()) {
		 System.out.print(itr.next());
	 }
		
		
		System.out.print(aa+""+p);
	}

}
