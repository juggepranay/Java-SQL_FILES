import java.util.*;
class p_4{
    public static void main(String args[])
    {
        
        for(int i=4;i>=1;i--){
            for(int s=1;s<=5-i;s++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int k=2;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =1;i<=5;i++){
            for (int s=1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
                
            }
             for(int k=2;k<=i;k++ ){
                System.out.print("*");
             }
         
             System.out.println();
        }
    }

}