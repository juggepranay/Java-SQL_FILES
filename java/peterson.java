class Peterson{

    static void check(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            sum+=factorial(n%10);
            n=n/10;
        }
        if(temp==sum){
            System.out.println("number is peterson number");

        }
        else{
            System.out.println("number is not peterson number");
        }
        
        

    }
    static int factorial(int x){
        if(x==1) return 1;
        return x*factorial(x-1);
    }


    public static void main(String[] args) {

        check(773);
        
    }

}