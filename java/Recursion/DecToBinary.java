class DecToBinary{

    static StringBuilder n=new StringBuilder();

 static StringBuilder convert(int x){
    if(x==1){
        return n.append("1").reverse();
    }
    if(x%2==0) n.append("0");
    if(x%2==1) n.append("1");
    return convert(x/2);
 }
 public static void main(String[] args) {
    System.out.println(convert(32));
    
 }

}