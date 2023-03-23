import java.util.*;


class Learncollectionsclass{
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5,6};
        List<Integer> a=new ArrayList<>(Arrays.asList(arr));
        System.out.println(a);
        a.add(3);
        a.add(4);
        a.add(55);
        a.add(43);
        Collections.sort(a);
        Collections.reverse(a);
        System.out.println( Collections.max(a));
        Collections.min(a);
        // System.out.println( Collections.max(arr));
        
        System.out.println(a);
    }
}