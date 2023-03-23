import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }

}

class BinaryTree{
    static Scanner sc=new Scanner(System.in);
    static Node onCreate(int data){
        if (data==-1){
            return null;
        }
        Node node=new Node(data);
        System.out.println("enter the value for the left node "+data);
        node.left=onCreate(sc.nextInt());
        System.out.println("enter the value for the right node "+data);
        node.right=onCreate(sc.nextInt());

        return node;


    }

     static void preorder(Node node){
        if(node==null)
		    return;
		
		System.out.print("data "+node.data+" ");
		
		preorder(node.left);
        
		preorder(node.right);
     }

    public static void main(String[] args) {
        System.out.println("enter the root data :");
        Node node=onCreate(sc.nextInt());

        preorder(node);

    }
}