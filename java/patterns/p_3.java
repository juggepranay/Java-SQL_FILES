 /* 1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1  */



import java.util.*;
class p_3{
    public static void main(String args[])
    {
        for(int i =1;i<=5;i++){
            for (int s=1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
                
            }
             for(int k=2;k<=i;k++ ){
                System.out.print(k);
             }
         
             System.out.println();
        }
        for(int i=4;i>=1;i--){
            for(int s=1;s<=5-i;s++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

}