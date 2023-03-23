import java.util.Scanner;

public class basic{
    public static void main(String args[]){
        System.out.println("hello world");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int z;
        int x;
        x = sc.nextInt();

        switch(x){

            case 1 :
            z= a+b;
            System.out.println(z);
            break;
            case 2:
            z= a-b;
            System.out.println(z);
            break;

            case 3:
            z= a/b;
            System.out.println(z);
            break;

            case 4:
            z=a*b;
            System.out.println(z);
            break;


        }



    }
}
S