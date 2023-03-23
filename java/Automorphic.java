class Automorphic
{
 public static void main(String[] args) {
    int a=25;
    int square=a*a;
    boolean flag=true;
    while(a!=0){
        if(a%10==square%10){
            a=a/10;
            square=square/10;
            flag=true;
        }
        else{
            flag=false;
            break;
        }
    }
    if(flag){
        System.out.println("automorphic number");

    }else{
        System.out.println("not a automorphic number");
    }
    
}
}