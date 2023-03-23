class bank{
    String bankname(){ return "abc";}
}

class sbi extends bank{
    String bankname(){ return "sbi";}
}

class icic extends bank{
    String bankname(){return "icic";}
}




class Polymorphism{
    public static void main(String[] args) {
        bank obj2;
        obj2=new icic();
        System.out.println(obj2.bankname());



        bank obj= new sbi();
        System.out.println(obj.bankname());
        
    }
    
}