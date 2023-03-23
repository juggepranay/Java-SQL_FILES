class Sample{
    Node root;

    public static void main(String[] args) {
        
        Sample s=new Sample();
        s.root=new Node(5);
        s.root.left=new Node(1);
        s.root.right=new Node(4);
        s.root.right.left=new Node(3);
        s.root.right.right=new Node(6);
        
        System.out.println(new Solution().isValidBST(s.root));

    }
}
    class Solution {
    Node previous=null;
    public boolean isValidBST(Node root) {
if(root==null)
return true;
boolean r=true;
boolean l=true;
if(root.right!=null)
{
    r=root.right.val>root.val;
}
if(root.left!=null){
    l=root.left.val<root.val;
}
return l&&r&& isValidBST(root.left)&&isValidBST(root.right);
        
    }
}



class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val=val;
    }
}