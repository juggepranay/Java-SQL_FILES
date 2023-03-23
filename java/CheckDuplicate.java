import java.util.*;
public class CheckDuplicate{
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,1};
        List<Integer> x=new ArrayList<>(Arrays.asList(arr));
        if(arr.length!=x.size()){
            System.out.println("false");

        }else{
            System.out.println("true");
        }
        
    }
}