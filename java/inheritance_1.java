class employee{
    String name="dude";
    int age=22;
    void getsalary(){
        System.out.println("recived the salary");


    }

    void code(){
        System.out.println("mm");
    }

    void complaint(){
        System.out.println("complaint solved");
    }
}




class programmer extends employee{
    
    void details(String name,int age){
        System.out.println("name ="+name +"\n"+"age ="+age );
    }
    void code(){
        System.out.println("coding part is successfully completed");
        
    }


}

class manager extends programmer{
    
}



class inheritance_1{
    public static void main(String[] args) {
        programmer obj=new programmer();

        System.out.println(obj.name);
        obj.details(obj.name, obj.age);


        manager obj2=new manager();
        obj2.getsalary();



        //upcasting

        employee obj3 = new programmer();

        obj3.code();


         


        
    }
}