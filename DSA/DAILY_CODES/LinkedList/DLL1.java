import java.util.*;

class Node{
	Node prev = null;
	int data;
	Node next = null;
	Node(int data){
		this.data = data;
	}
}

class DoublyLinkedList{
	Node head = null;

	void addFirst(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	void addLast(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
	}

	void addAtPos(int data, int pos){
		Node newNode = new Node(data);
		if(pos <= 0 && pos > countNode()+2){
			System.out.println("Invalid position");
		}	
		if(pos == 1){
			addFirst(data);
		}else if(pos == countNode()+1){
			addLast(data);
		}else{
			Node temp = head;
			while(pos-2 > 0){
				temp = temp.next;
			}
			temp.next.prev = newNode;
			newNode.prev = temp;
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	void delFirst(){
		if(head == null){
			System.out.println("Empty LinkedList");
		}else if(countNode() == 1){
			head = null;
		}else{
			head = head.next;
			head.prev = null;
		}
	}

	void delLast(){
		if(head == null){
                        System.out.println("Empty LinkedList");
                }else if(countNode() == 1){
                        head = null;
                }else{
			Node temp = head;
			while(temp.next != null){
                        	temp = temp.next;
			}
			temp.prev.next = null;
			temp.prev = null;
                }
	}

	void delAtPos(int pos){
                if(pos <= 0 && pos > countNode()+1){
                        System.out.println("Invalid position");
                }
                if(pos == 1){
                        delFirst();
                }else if(pos == countNode()){
                        delLast();
                }else{
                        Node temp = head;
                        while(pos-2 > 0){
                                temp = temp.next;
                        }
                        temp.next.next.prev = temp;
			temp.next = temp.next.next;
                }
	}

	int countNode(){
		int count = 0;
		if(head == null){
			return count;
		}else{
			Node temp = head;
			while(temp != null){
				count ++;
				temp = temp.next;
			}
			return count;
		}
	}

	void printDLL(){
		if(head == null){
			System.out.println("LinkedList is empty.");
		}else{
			Node temp=head;
			while(temp.next != null){
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	
	}
	
}

class Client{
	public static void main(String [] args){
		DoublyLinkedList ll = new DoublyLinkedList();
      
		char ch;
		do{
			System.out.println("Doubly Linked List");
			System.out.println("1.addFirst");
			System.out.println("2.addLast");
			System.out.println("3.addAtPos");
			System.out.println("4.delFirst");
			System.out.println("5.delLast");
			System.out.println("6.delAtPos");
			System.out.println("7.countNode");
			System.out.println("8.printDLL");

			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch(choice){
				case 1:
					{
						System.out.println("Enter data");
						int data = sc.nextInt();
						ll.addFirst(data);
					}
					break;
				case 2:
					{
						System.out.println("Enter data");
                                        	int data = sc.nextInt();
                                        	ll.addLast(data);
					}
					break;
				case 3:
					{
						System.out.println("Enter data");
                                        	int data = sc.nextInt();
						System.out.println("Enter position");
                                        	int pos = sc.nextInt();
                                        	ll.addAtPos(data,pos);
					}
					break;
				case 4:
					ll.delFirst();
					break;
				case 5:
					ll.delLast();
					break;
				case 6:
					{
						System.out.println("Enter position");
						int pos = sc.nextInt();
						ll.delAtPos(pos);
					}
					break;
				case 7:
					{
						int cnt = ll.countNode();
						System.out.println(cnt);
					}
					break;
				case 8:
					ll.printDLL();
					break;
				default:
					System.out.println("Wrong Choice");
					break;
			}
			System.out.println("Do you want to continue?");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}
}
