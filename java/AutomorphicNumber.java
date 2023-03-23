class AutomorphicNumber{

    public boolean check(int i){

        int sqr=i*i;
        // ldn last digit number 
        int ldn=i%10;

        // ldsqr last digit of sqr
        int ldsqr=sqr%10;

        if(ldn==ldsqr){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        AutomorphicNumber n=new AutomorphicNumber();
        System.out.println( n.check(32));
    }
    
}