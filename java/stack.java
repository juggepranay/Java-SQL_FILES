import org.xml.sax.SAXException;

// class stack {
//     Node head;
//     Node tail;

//     void push(int data){
//         Node node=new Node(data);
//         if(head==null){
//             head=node;
//             tail=node;
//         }else{
//             tail.top=node;
//             node.previous=tail;
//             tail=node;
            
//         }

//     }

//     int pop()throws NullPointerException{
//         if(tail==null){
//              throw new NullPointerException("underflow");
//             // System.out.println("Underflow");


//         }else{
//             int temp=tail.data;
//             tail=tail.previous;
            
//             return temp;

//         }
        

//     }
//     int peek() throws NullPointerException{
//         if(tail==null)
//         throw new NullPointerException("underflow");
//         else 
//         return tail.data;
//     }
//     boolean isEmpty()
//     {
//         return tail==null;
//     }

//     public static void main(String[] args) {
//         stack obj=new stack();
//         obj.push(22);
//         obj.push(222);
//         obj.push(0);
//         System.out.println(obj.peek());
//         int n=obj.pop();
        
//         System.out.println(n);
// System.out.println(obj.isEmpty());
//         System.out.println(obj.peek());

//         System.out.println(obj.pop());
//         System.out.println(obj.pop());
//         System.out.println(obj.pop());
//     }
// }

// class Node{
//     int data;
//     Node top;
//     Node previous;
//     Node(int data){
//         this.data=data;
//     }
// }



/**
 * stack
 */
class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode(int val){
        this.val=val;
    }
}
public class stack {
TreeNode node;
public static void main(String[] args) {
    stack stack=new stack();
    stack.node=new TreeNode(0);
    stack.node.left=new TreeNode(1);
    stack.node.left.right=new TreeNode(2);
    System.out.println(new Solution().maxDepth(stack.node));
}
}

class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}