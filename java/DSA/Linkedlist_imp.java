import java.util.*;
class LLnode{
    int data;
    LLnode next;
 public LLnode(int data){
        this.data=data;
        this.next=null;
    }

}


class Linkedlist_imp{
    LLnode head;
    LLnode insertInBeg(int key,LLnode node)
    {
        LLnode ttmp=new LLnode(key);
        if(head==null){
            head=ttmp;
        }                                      
        else{
            ttmp.next=head;
            head=ttmp;
        }
        return head;
    }

    

    LLnode insertInEnd(int key,LLnode head){

        LLnode ttmp=new LLnode(key);
        LLnode ttmp1=head;
        if(ttmp1==null)
        head=ttmp;
        else{
            while(ttmp1.next!=null){
                ttmp1=ttmp1.next;
            }
                ttmp1.next=ttmp;
            

        }
        return head;
    }




    LLnode insertAtPos(int key,int pos,LLnode head){
        LLnode ttmp=new LLnode(key);
        if(pos==1){
            ttmp.next=head;
            head=ttmp;
        }
        else{
            LLnode ttmp1=head;
            for(int i=1;ttmp1!=null && i<pos;i++){
                ttmp1=ttmp1.next;
            }
            ttmp.next=ttmp1.next;
            ttmp1.next=ttmp;
        }
        return head;
    }



    LLnode delete(int pos,LLnode head){
        if(pos==0)
        return head.next;       

        if(head==null)
        return null;
        if(pos==1&&head.next==null){
        head.next=null;
        return head;
        }
        if(pos==1){
            head.next=head.next.next;

            return head;
        }
        LLnode node=head;
        for (int i = 1;node!=null &&i < pos; i++) {
            node=node.next;

        }
        if(node.next==null)
        return head;
        
        node.next=node.next.next;

        return head;

    }


    LLnode reverse(){
        LLnode head1=head,next1=head1.next,prevoious=null;
        while(next1.next!=null){
        next1=head1.next;
        head1.next=prevoious;
        prevoious=head1;
        head1=next1;
        }
        next1.next=prevoious;
       
        head=head1;

        return head;
    }

    
    void display(LLnode head)
	{

		LLnode ttmp=head;
		while(ttmp!=null)
			{System.out.print(ttmp.data+" ");
			 ttmp=ttmp.next;
			}
	}


    public static void main(String[] args) {

        Linkedlist_imp n=new Linkedlist_imp();
        n.insertInBeg(232,n.head);
        System.out.println(n.head.data);
        n.insertInEnd(53, n.head);
        n.insertInEnd(12, n.head);
        n.insertAtPos(100, 2,n.head);
        n.display(n.head);
    //    n.head= n.delete(1 , n.head);
n.display(n.head);
n.head=n.reverse();
 n.display(n.head);

        
    }

}