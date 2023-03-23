class ReverseNumber{
    public static void main(String[] args) {
        int a=123;
        int rem=0,num=0;
        while(a!=0){
            rem=a%10;
            num=num*10+rem;
            a=a/10;
            
        }
        System.out.println(num);
    }
}