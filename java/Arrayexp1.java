import java.util.*;
// longest common prefix in an array
class Main{

    public static void main(String[] args){
        String[] arr={"geeksforgeeks","geeks","geek","geezer"};
        String s=arr[0];
        for(int i=1;i<arr.length;i++){
            s= dofind(s,arr[i]);
        }
        System.out.print(s);
    }
    static String dofind(String x,String y) {

            while(x.length()>0 && y.length()>0 && !x.startsWith(y)){
                y=y.substring(0,y.length()-1);
            }

            return y;

        }
}