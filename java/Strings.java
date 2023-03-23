import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        String in = "hello world";
        String[] in2 = in.split(" ");
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        if(in.contains(x)){
            if((in2[0]).equals(x)){
                System.out.println("TRUE");
                
            }
            else{
                System.out.println("FALSE");
            }
            
        }
        else{
            System.out.println("Does not contain the word in the string");
        }
        
    }
}