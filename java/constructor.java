class person{

    private String name;
    private long mobile_no;
    
    public person(String n,int num){
        this.name=n;
        this.mobile_no=num;
    }

    public String getName(){
        return name;
    }
    public long getMobile(){
        return num;
    }


}



class constructor{

    person p;
    public main(person p){
        this.p=p;
    }
    public static void main(String[] args){
        person n=new person("pranay",81909212);
        constructor m=new constructor(n);
        System.out.println(m.p.getName());
        System.out.println(m.p.getMobile());



    }
}