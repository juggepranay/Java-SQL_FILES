import java.util.Scanner;
class Factorial
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fac=1;
        while(n>=1){
            fac=n*fac;
            n--;
        }
        System.out.println(fac);
    }
}