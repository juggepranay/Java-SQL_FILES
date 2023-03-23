import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        String in = "I'm the new new";
        String[] in2 = in.split(" ");
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int count=0;
        for(int i=0;i<in2.length;i++){
            if((in2[i]).equals(x)){
                count=count+1;
            }
        }
        System.out.println(count);
    }
} 