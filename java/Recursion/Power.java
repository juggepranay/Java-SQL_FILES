class Power{
    static int value=1;
    static int calculate(int x,int pow){
        if(pow==0) return x;
        if(pow==1){
            return x*value;
        }
        return value= (x*x)*calculate(x,pow-2);
    }

    public static void main(String[] args) {
        System.out.println(calculate(100,0));
    }
}