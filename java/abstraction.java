abstract class A{
   abstract void Display();
    static int password;
}



class B extends A{

     void Display()
        {System.out.println("This is abstraction");}
        
    }



class abstraction{
    public static void main(String[] args) {
    
        B obj =new B();
        obj.Display();
        
    }
}