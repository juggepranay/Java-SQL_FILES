import java.util.Scanner;
public class SameWords{
    public static void main(String args[]){
        String in = "I'm the new new";
        String[] in2 = in.split(" ");
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        count=0;
        for(int i=0;i<=in2.length;i++){
            if((in2.index[i]).equals(in)){
                count=count+1;
            }
        }
        System.out.println(count);
    }
} 