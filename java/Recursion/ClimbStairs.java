// number of ways to reach the nth step by only increament the step by 1 0r 2; 
class ClimbStairs{
     static int count=0;
      static int ways(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }

        return count=ways(n-1)+ways(n-2);
      }
       public static void main(String[] args) {

        System.out.println(ways(4));
}
}