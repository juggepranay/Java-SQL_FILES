import java.util.*;

class array_list{
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(33);
        l.add(32);
        l.add(12);
        l.add(23);
        l.add(43);
        
        System.out.println(l);


        System.out.println(l.get(0));


        List<Integer> l1=new ArrayList<>();

        l1.add(2);
        l1.add(3);
        for(int i=2;i<=6;i++){
            l1.add(i);

        }
        System.out.println(l1);
        

        l.addAll(l1);
        System.out.println(l);
        l1.clear();
        System.out.println(l1);

        l.remove(1);
        System.out.println(l);

        l.remove(Integer.valueOf(23));
        l.set(9, 100);
        System.out.println(l.contains(43));
        System.out.println(l+" .  " +"size of list="+l.size());



        //iterator
        Iterator <Integer> it =new Iterator<Integer>();

        while(it.hasNext()){
            System.out.println("iterator"+it.next());
        }



    }
}