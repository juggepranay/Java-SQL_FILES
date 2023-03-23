import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Remove_duplicates{
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,3};

        Set<Integer> s=new HashSet<>();
        for(int element:arr){
            s.add(element);
        }
        System.out.println(s);

    }
}