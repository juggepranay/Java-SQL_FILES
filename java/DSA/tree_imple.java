import java.util.Scanner;
import java.util.*;

class tree_imple{
    
    Scanner sc=new Scanner (System.in);
    public node onCreate(){
            System.out.println("enter the value for root node");
            int data=sc.nextInt(); 
            if(data=-1) return null;
            node root=new node(data);
            System.out.println("enter the data for left of: "+ data);
            root.left=onCreate();
            System.out.println("enter the data for right of: "+ data);
            root.right= onCreate();
            return n;
        }

        public void inorder(node root){
            if(root==null) return;
            inorder(root.left);
            System.out.println(root);
            inorder(root.right);

        }

    public static void main(String[] args) {
        tree_imple t=new tree_imple();
        node root=t.onCreate();

        
    }
}

class node{
    int data;
    node left;
    node right;
    node (int data){
        this.data=data;
        this.left=null;
        this.right=null;
        
    }

}