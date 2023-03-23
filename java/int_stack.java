
class implement{

    int stack[]=new int [5];
    int top =0;
    public void push(int data){
        stack[top]=data;
        top++;
    }

    public void show(){
        for(int n:stack){
            System.out.println(n+" ");
        }
    }
}


class int_stack{
    public static void main(String[] args) {
        implement a=new implement();
        a.push(10);
        a.push(22);
        a.push(12);
        a.show();
        
    }
}