class SumOfDigits{
     static int  sum=0;
    public static  int sum(int x){
        if(x==0){
            return sum;
        }
      return sum+=x%10+sum(x/10);
    }
    public static void main(String[] args) {
        System.out.println(sum(56));
    }
}