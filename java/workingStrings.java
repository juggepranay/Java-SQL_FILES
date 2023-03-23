import java.util.*;

class workingStrings{
     int n;

     static char[] Splitstr(String x){
        char ArraySplit[]= new char[x.length()];
        if(x!="0"){
            for(int i=0;i<x.length();i++){
                ArraySplit[i]=x.charAt(i);

            }
            
           
        }
        return ArraySplit;
    }

    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        System.out.println("no. of letter in word");
        // n =sc.nextInt();
        String x = sc.nextLine(); 
        char [] Arraydone;
        Arraydone = Splitstr(x);

        for(int i=0;i<Arraydone.length;i++){
            System.out.println(Arraydone[i]);
        }


    }

}