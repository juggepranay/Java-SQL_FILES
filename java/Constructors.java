class hello{
    int data; 
    static  int i;
    hello(int data){
        i++;
        System.out.println("Object "+ i+" created ");
    }
      
    
    
}

class Constructors{
    public static void main(String[] args) {
        hello obj= new hello(33);
        hello obj2 =new hello(21);
    }
}