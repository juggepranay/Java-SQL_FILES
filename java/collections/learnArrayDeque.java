import java.net.SocketTimeoutException;
import java.util.ArrayDeque;

class learnArrayDeque{
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.offer(44);
        ad.addFirst(12);
        ad.addLast(55);
        System.out.println(ad);

        ad.pollFirst();
        ad.pollLast();
        System.out.println(ad);

        ad.offerFirst(11);
        ad.offerLast(100);
        System.out.println(ad);
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
    }
    
}