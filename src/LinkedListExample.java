
public class LinkedListExample {

	static Node head1, head2;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}
	
	int getNode() {
		int c1=getCount(head1);
		int c2=getcount(head2);
		int d;
		
		if(c1>c2) {
			d=c1-c2;
			
			return getIntersectionNode(d,head1, head2);
		}
	}

}
