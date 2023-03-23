class Parent{
    public  String name;
    int age;
   public Parent(String name,int age){
        this.name=name;
        this.age =age;
    }
}

class child extends Parent{
    int age;
    String name;


  public  child(String name,int age)
    {
    super(name,age);
    }
}  


class Inheritance{
    public static void main(String[] args) {
        child obj=new child("pranay",21);
        obj.name="pranay";
        obj.age=22; 
        System.out.println( Integer.MAX_VALUE);

    }
}