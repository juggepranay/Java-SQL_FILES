import java.util.Scanner;

class prime_check{
    public static void prime(int x){
        boolean flag=true;
        for(int i=2;i<x;i++){
            if(x%i==0){
                flag=false;
                
            }}

        if(flag==true){
            System.out.println(x +" is a prime" );
        }
        else{
            System.out.println(x + " is not a prime" );
        }

        

    }


    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);

    prime_check.prime(sc.nextInt());
    
    }
}
