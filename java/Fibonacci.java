class Fibonacci{
    int i=0;
    int j=1;
    public void printseq(int x){
        System.out.print(i+" ");
        System.out.print(j+" ");
        int f;
        while(i<x){
            f=i+j;
            System.out.print(f+" ");
            i=j;
            j=f;

        } 


    }
    public static void main(String[] args) {
        Fibonacci obj=new Fibonacci();
        obj.printseq(20);
    }
}