import java.util.*;

class reverseString{
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the string");
         String s = sc.next();
         for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
         }
        
    }
}