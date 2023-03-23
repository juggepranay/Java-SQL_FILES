import java.util.*;
/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(new sample().generate(5));
    }
}


class sample{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> row= new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    row.add(out.get(i-1).get(j)+out.get(i-1).get(j-1));
                }
            }
            out.add(row);
        }

        return out;
        
    }
}