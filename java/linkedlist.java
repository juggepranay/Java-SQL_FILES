class Node{
    int data;
    Node next;

}


class actions{
    Node head;
    public void insert(int data){

        
        Node n= new Node();
        n.data =data;
        n.next=null;

        if(head==null){
            head =n;

        }
        else{
            Node t=head;
            while(t.next!=null)
            {
                t=t.next;

            }
            t.next=n;


        }
        


    }



    public void show(){
        Node node=head;
        while(node.next!=null){
            System.out.println(node.data);
            node =node.next;
        }
        System.out.println(node.data);
    }
}



class linkedlist
{
    public static void main(String[] args) {
        actions A=new actions();
        A.insert(7);
        A.insert(19);
        A.insert(77);
        A.show();
    }
}