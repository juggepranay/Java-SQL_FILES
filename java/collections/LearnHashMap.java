import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class LearnHashMap{
    public static void main(String[] args) {
        Map<String,Integer> m=new TreeMap<>();
        m.put('c', 1);
        m.put('b',2);
        System.out.println(m);
    }
}