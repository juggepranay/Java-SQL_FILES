class queue{
    int a[];
    int front;
    int rear;
        queue(){
            a = new int[100];
            rear=-1;
            front=-1;

        }

        void push(int x){
            if(rear==-1){
                a[++rear]=x;
                front++;
            }
            else{
                if(rear==a.length-1)
                  System.out.println("overflow");
                  else
                a[++rear]=x;
            }
        }


        int pop(){
            if(rear==-1){
                front=rear;
                System.out.println("underflow");
                return -1;

            }
            
                return a[rear--];
        }

        int peek(){
            if(rear==-1){
                return -1;
            }

            return a[front];
        }

        void display(){
            for(int i=0;i<=rear;i++){
                System.out.print(a[i]+"  ");
            }
            System.out.println();
        }






}


class queue_imp{
    public static void main(String[] args) {
        queue q=new queue();
        q.push(33);
        q.push(232);
        q.display();
        System.out.println(q.peek());
        q.pop();
        q.pop();
        q.pop();

        q.display();
    }
}
