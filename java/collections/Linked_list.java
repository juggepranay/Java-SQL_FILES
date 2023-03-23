import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// linked list using queue
class Linked_list{
    public static void main(String[] args) {



        // offer returns true or false if element is not add in list
        // whereas the add fuction throught exception 
        // same remove as add () and poll as offer() 
        LinkedList<Integer> q=new LinkedList<>();
        q.offer(88);
        q.add(86);
        q.add(12);
        q.add(123);
        System.out.println(q);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        
        
        

    }

}