
import java.util.Scanner;

class Node{
    int data;
    Node left ,right;
    public Node(int data){
        this.data=data;

    }

}

class BinaryTree{
    static Scanner sc=new Scanner(System.in);

     static Node createNode(){
        System.out.println("enter the data :");
        int data =sc.nextInt();
        if(data==-1){
            return null;
        }
        Node root=new Node(data);
        
        System.out.println("enter the data for left node of"+ data);
        root.left=createNode();
        System.out.println("enter the data for Right node of "+ data);
        root.right=createNode();

        return root;
    }

    static void inOrder(Node root){
        if(root==null) return ;

        inOrder(root.left);
        System.out.print( root.data);
        inOrder(root.right);
        
    }

     


    
    public static void main(String[] args) {

       Node node= createNode();

       inOrder(node);

        


    }
}