import java.util.*;

//Node creation
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		left=right=null;
	}
}


class BinaryTree{
	Scanner sc = new Scanner(System.in);

	//Construction of Binary Tree
	Node constructBT(){
		System.out.println("Enter data for Node");
		int data = sc.nextInt();
		Node newNode = new Node(data);

		System.out.println("Do yoy want to insert data at left side of "+ newNode.data);
		char leftnode = sc.next().charAt(0);
		if(leftnode == 'Y' || leftnode == 'y'){
			newNode.left = constructBT();
		}

		System.out.println("Do you want to insert data at right side of "+ newNode.data);
		char rightNode = sc.next().charAt(0);
		if(rightNode == 'y' || rightNode == 'Y'){
			newNode.right = constructBT();
		}
		return newNode;
	}



	public static void main(String [] args){
		Node root = null;
		
		BinaryTree bt = new BinaryTree();
		root = bt.constructBT();

		System.out.println("PreOrder Tree");
		bt.preOrderBT(root);
		System.out.println();

		System.out.println("InOrder Tree");
		bt.inOrderBT(root);
		System.out.println();

		System.out.println("PostOrder Tree");
		bt.postOrderBT(root);
		System.out.println();

	}

	//Printing Pre-Order Binary Tree
	void preOrderBT(Node root){
		if(root == null)
			return ;
		System.out.print(root.data + " ");
		preOrderBT(root.left);
		preOrderBT(root.right);
	}

	//Printing In-Order Binary Tree
	void inOrderBT(Node root){
		if(root == null)
			return;
		inOrderBT(root.left);
		System.out.print(root.data + " ");
		inOrderBT(root.right);
	}

	//Printing Post-Order Binary Tree
	void postOrderBT(Node root){
		if(root == null)
			return;
		postOrderBT(root.left);
		postOrderBT(root.right);
		System.out.print(root.data + " ");
	}
}
