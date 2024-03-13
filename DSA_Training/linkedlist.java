package DSA_Training;

class node{
    int data;
    node next;
    node(int data,node next){
        this.data=data;
        this.next=next;
    }
}

public class linkedlist {
    static node linked_data(int d){
        node head=null;
        node future=null;
        head= new node(d,future);
        future=head;
        return head;
        }
    
        public static void main(String[] args) {
            node h=linked_data(3);
            h=linked_data(4);
            h=linked_data(5);
            for(node temp=h;temp!=null;temp=temp.next){
                System.out.println(temp.data);
            }
            
        }
}
