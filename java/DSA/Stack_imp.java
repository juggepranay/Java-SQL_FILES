import java.util.*;

class Stack_i{

    int[] a;
    int top;
    Stack_i(){
        a=new int[100];
        top=-1;
    }


    void push(int x){
        if(top==a.length-1){
            System.out.println("stack is overflow");
        }
        else{
            a[++top]=x;
        }
       
    }

    int pop(){
        if(top==-1){
            System.out.println("underflow");
            return -1;
        }
        else{
            return (a[top--]);
        }
    }
    void display(){
        for(int i=0;i<=top;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }

    boolean Empty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    int peek(){
        if(top==-1){
            return -1;

        }else{
            return (a[top]);
        }
    }





}

class Stack_imp{
    public static void main(String[] args) {
        Stack_i s=new Stack_i();
        s.push(3);
        System.out.println(s.peek());
        s.push(4);
        s.push(42);
        s.push(432);
        s.display();
        System.out.println(s.pop());
        
      
    }
}