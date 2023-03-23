import java.util.*;


class node{

    int data;
    node prev;
    node next;

    node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }



}


class Doublelinkedlist{
    node head;
    node tail;
//insert method
    void insert(int data){
        node node=new node(data);
        if(head==null){
            head=node;
            tail=node;
            head.next=tail;
        tail.prev=head;
            }else{
                node.prev=tail;
                tail.next=node;
                tail=node;
            }
    }

    //insert begining 
    void insertAtBegin(int data){
        node node=new node(data);
        if(head==null){
            head=node;
            tail=node;
            tail.prev=head;
            head.next=tail;

        }else{
            node.next=head;
            head=node;
        }
    }

    //insert last
    void insertLast(int data){
        node node=new node(data);
        node.prev=tail;
        tail.next=node;
        tail=node;
    }

    //delete by position
    void deleteByPosition(int pos){
        node node=head;
        if(pos<0)
        return;
        if(pos==0){
        head=head.next;
        head.prev=null;
        }
        for (int i = 0; node!=null&&i < pos-1;i++) {
            node=node.next;
        }
        if(node==null || node.next==null)
        return;
        node temp=node.next.next;
        node.next.next.prev=node;
        node.next=temp;

    }
    // delete by key
    boolean deleteByKey(int key){
        if(head==null)
        return false;
        node start =head;
        node end=tail;
        while (start.data!=end.data&&start!=end&&start.next!=end) {
            if(start.data==key||end.data==key)
            return true;
            else {
            start=start.next;
            end=end.prev;
            }
        }
        return false;
    }


    
   //display
    void display(){
        node ttmp=head;
		while(ttmp!=null)
			{System.out.print(ttmp.data+" ");
			 ttmp=ttmp.next;
			}

    }




    public static void main(String[] args) {
        Doublelinkedlist d=new Doublelinkedlist();
        d.insert(0);
        d.insert(1);
        d.insert(2);
        // d.head=d.insertAtBeg(2231);
        // d.head=d.insertAtBeg(15);
        System.out.println(d.tail.prev.prev.data);
        d.insertAtBegin(-1);
        
        System.out.println("head: "+d.head.data);
        d.insertLast(3);
        System.out.println("tail: "+d.tail.data);

        d.deleteByPosition(2);
        System.out.println(d.head.next.next.prev.data);
        System.out.println(d.head.hashCode());
        System.out.println(d.deleteByKey(2));
        d.display();

    }
    
}