class PrimeNumber
{
    public static void main(String[] args) {
        int a=10;
        int i=2;
        while(i<=a){
            if(a%i==0){
                System.out.println("Not a prime");
                break;
            }
            else
            {
                System.out.println("prime number");
                break;
            }
        }
    }
}