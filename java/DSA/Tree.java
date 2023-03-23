// import java.util.Scanner;
import java.lang.*;

// class TreeNode{
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int data){
//         val=data;
//     }
// }


// class Tree{
//     static Scanner sc=new Scanner(System.in);
//     public static TreeNode onCreate(int data){
//         if(data==-1) return null;
//         TreeNode n=new TreeNode(data);
//         System.out.println("enter the left value for the " + data );
//         n.left=onCreate(sc.nextInt());
//         System.out.println("enter the right value for the " + data );
//         n.right=onCreate(sc.nextInt());
//         return n;

//     }

//     public static void main(String[] args) {
//        Tree obj=new Tree();
//        System.out.println("Enter the main root data");
//        TreeNode root=obj.onCreate(sc.nextInt()); 
//     }


// }



class Tree {
    public static void main(String[] args) {
        Tree n=new Tree();
        System.out.println(n.reverseVowels("hello"));}
    
         String reverseVowels(String y) {
            String x= y.toLowerCase();
            char s[]=x.toCharArray();
            int i=0;
            int j=x.length()-1;
            char temp='#';
            char temp2='#';
            while(i<j){
    
                while(s[i]!='a'&& s[i]!='e'&& s[i]!='i'&& s[i]!='o'&& s[i]!='u'){
                    i++;
                }
                
                while(s[j]!='a'&& s[j]!='e'&& s[j]!='i'&& s[j]!='o'&& s[j]!='u'){
                    j--;
                }
                temp=s[i];
                temp2=s[j];
                s[i]=temp2;
                s[j]=temp;
                i++;
                j--;
            }
            x="";
            for(int k=0;k<s.length-1;k++){
                x+=s[k];
            }
            return x;
        }
    }
    
