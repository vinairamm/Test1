import java.util.LinkedList;


class Node {
    int data;
    Node next;
    
    Node(int val, Node next){
    	this.data = val;
    	this.next = next;
    }
    Node(){
    	super();
    }
 }
class PrintNode{

public static void printNode(Node head) {
	Node n=head;
	if( head== null) {
		System.out.println("null");
		return;
	}
	System.out.println(head.data);

	while(n.next!=null) {
		
		n=n.next;
		System.out.println(n.data);
	}
	

	
}
	
	
}

public class DeleteNode { 
	
	public static  Node  delete(Node head, int position) {
		
		if(head==null) {
			return null;
		}
		else if(position==0) {
			return head.next;
		}
		else {
			Node n=head;
			
			for(int i=0;i<position-1;i++) {
				n=n.next;
			}
			
			n.next=n.next.next;
			return head;
		}
	}
	
	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
	    
		Node head = new Node();
		head.data = 1;
		
		Node first = new Node();
		first.data = 2;
		
		Node second = new Node();
		second.data = 3;
		
		Node third = new Node();
		third.data = 4;
		
		head.next = first;
		first.next = second;
		second.next = third;
		third.next = null;
		
		DeleteNode nd = new DeleteNode();
		nd.delete(head, 2);
		
		PrintNode.printNode(head);
		
		
	}

}
