
package Queue;

public class Queue {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}	
	}
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.dequeue();
	    queue.enqueue(10);
	    queue.enqueue(15);
	    queue.printList();
	    queue.enqueue(20);
		queue.dequeue();
		 queue.printList();
	}
	void enqueue(int data){
		Node node=new Node(data);
		if(head==null)
			head=node;
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	void dequeue(){
		Node temp=head;
		if(temp!=null){
			head=head.next;
		}
		else{
			System.out.println("Queue is Empty");
		}
	}
	void printList(){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
}
}