import java.util.*;

class charArray{
    public static void main (String args[]) {
     
        char [] Array1={'a','b','c','d','e'};
        char [] Array2=new char[5];
        int count=97;

        for(int i=0;i<5;i++){
            Array2[i]=(char)count;
            count++;

        }

        for(int i=0;i<5;i++){

            if(Array1[i]==Array2[i]){
                System.out.println("TRUE");
            }
        }
       
    }
}