import java.util.Arrays;

class Person{
    String name;
    int age;
    String mobile_no;
    Person(String name,int age,String mobile_no){
        this.name=name;
        this.age=age;
        this.mobile_no=mobile_no;
    }
    public void Display(Person x){
        System.out.println("name: "+x.name+" "+"age: "+x.age+" mobile_no: "+x.mobile_no);

    }
    public boolean compareAge(Person x,Person y){

        if(x.age==y.age){
            return true;
        }

        return false;
    }
}
class Class_Objects{
    public static void main(String[] args) {
        Person anoop=new Person("anoop",21,"8143764753");
        Person pranay=new Person("pranay",21,"8190921463");
        Person[] x=new Person[2]; 
        x[0]=anoop;
        x[1]=pranay;
        anoop.Display(anoop);
        System.out.println(anoop.compareAge(anoop, pranay));

    }
}