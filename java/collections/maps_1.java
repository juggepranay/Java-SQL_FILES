import java.util.*;
class maps_1{
    public static void main(String[] args) {
        Map<String, Integer> number=new HashMap<>();
        number.put("one", 1);
        number.put("two",2);
        number.put("three", 3);
        number.put("four", 4);
        System.out.println(number);

        // map check key same it replace or update with number value key should be unique


        // to check wheather the same key exists


        if(!number.containsKey("two")){
            number.put("two",44);

        }

        number.putIfAbsent("two", 22);



        // for loop to iterate map

        for(Map.Entry<String,Integer> e:number.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

       for(String key :number.keySet()){
        System.out.println(key);
       }

       for (Integer value: number.values()){
        System.out.println(value);

       }

       // remove any number 
       number.remove("two");
       System.out.println(number);

       System.out.println(number.isEmpty());


      
       // tree map returns sorted map



     Map<String,Integer> number1=new TreeMap<>();

       number1.put("zla",1);
       number1.put("xyla", 2);
       number1.put("hello",3);
        number1.put("abub", 4);
        System.out.println(number1);
    
    
    
    
    
    }
}