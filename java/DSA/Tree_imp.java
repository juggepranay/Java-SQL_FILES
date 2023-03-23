import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data=data;
    }

}


class Tree_imp{
  static  Node root;
    // static Scanner sc=new Scanner(System.in);
    // public static Node createTree(){
    //     System.out.println("Enter the data for node:");
    //     int data=sc.nextInt();
    //     if(data==-1) return null;
    //     Node n=new Node(data);
    //     System.out.println("enter the data for left of: "+ data);
    //     n.left=createTree();
    //     System.out.println("enter the data for right of: "+ data);
    //     n.right=createTree();
        
    //     return n;
    //}
    static void insert(int data){
        Node node=new Node(data);
        if(root==null)
        root=node;
        else{
            Queue<Node> queue=new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node peekNode=queue.poll();
                if(peekNode.left==null){
                    peekNode.left=node;
                    return;
                }else
                queue.add(peekNode.left);
                if(peekNode.right==null){
                    peekNode.right=node;
                    return;

                }else
                queue.offer(peekNode.right);
                
            }
        }
    }
    static String display(Node root){
        if(root==null){return "NULL";}
        return display(root.left)+" "+root.data+" "+display(root.right);

    }

    public static void main(String[] args) {

        insert(0);
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
       String s= display(root);
       System.out.println(s);
       root=new Node(1);
       root.left=new Node(2);
       root.left.left=new Node(4);
       root.left.left.left=new Node(8);

        
    }
}