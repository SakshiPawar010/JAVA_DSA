import java.io.*;

class Node{
	int data;
	Node next = null;
	Node(int data){
		this.data = data;
	}
}

class RevLinkedList{
	Node head = null;

	void addNode(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode; 
		}
	}

	void printLL(){
		Node temp = head;
		if(head == null){
			System.out.println("LinkeList is Empty");
			return;
		}else{
			while(temp.next != null){
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	void reverseItr(){
		if(head == null)
			return;
		Node prev = null;
		Node curr = head;
		Node forward = null;

		while(curr != null){
			forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		head = prev;
	}

	void reverseRec(Node prev, Node curr){
		
	}	
}

class Client{
	public static void main(String [] args) throws IOException{
		RevLinkedList ll = new RevLinkedList();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char ch;

		do{
			System.out.println("1.addNode");
			System.out.println("2.printLL");
			System.out.println("3.reverseItr");
			System.out.println("4.reverseRec");
			System.out.println("Enter your choice");
			int choice = Integer.parseInt(br.readLine());
			
			switch(choice){
				case 1:{
					System.out.println("Enter data");
					int data = Integer.parseInt(br.readLine());
					ll.addNode(data);
			       		}
			       		break;

			 	case 2:
					ll.printLL();
					break;

				case 3:
					ll.reverseItr();
					break;

				case 4:{
					Node prev = null;
					ll.reverseRec(prev,ll.head);
					}	
					break;	

				default:
					System.out.println("Wring choice");
					break;	
			}
			System.out.println("Do you want to continue?");
			ch = br.readLine().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}
}
