import java.util.Scanner;
public class Anagrams{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        char[] C1 = S1.toCharArray();
        char[] C2 = S2.toCharArray();
        for(int i=0;i<S1.length();i++){
            if(!S2.contains(S1.charAt(i)+"")){
                System.out.println("FALSE");
                return;


            }

            
        }
        System.out.println("TRUE");


    }
}