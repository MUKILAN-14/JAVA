package DataStructure;

public class Linked_List {

    boolean findLoop(LinkedListNode head){
        LinkedListNode slowptr=head;
        LinkedListNode fastptr=head;

        while(slowptr!=null&&fastptr!=null&&fastptr.next!=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
            if(slowptr==fastptr){
                return true;
            }
        }
        return false;
    }

    LinkedListNode ReverseNode(LinkedListNode head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        LinkedListNode prev=null;
        LinkedListNode curr=head;
        while(curr!=null){
            LinkedListNode nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        head=prev;
        return head;
    }
    LinkedListNode RotateNode(LinkedListNode head,int k){
        LinkedListNode temp=head;
        int count=0;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        temp.next=head;
        temp=head;
        int count1=0;
        k=k%(count+1);
        while(count1!=count-k){
            temp=temp.next;
            count1++;
        }
        head=temp.next;
        temp.next=null;
        
        return head;
    }

    public static void main(String[] args) {
    Linked_List ll=new Linked_List();  

    LinkedListNode l1=new LinkedListNode(1);
    LinkedListNode l2=new LinkedListNode(2);
    LinkedListNode l3=new LinkedListNode(3);
    LinkedListNode l4=new LinkedListNode(4);

    l1.next=l2;
    l2.next=l3;
    l3.next=l4;
    l4.next=null;
     
    System.out.println(ll.findLoop(l1));

    System.out.println(l1);
    System.out.println(l2);
    System.out.println(l3);
    System.out.println(l4);
    System.out.println("  ");

    System.out.println(ll.RotateNode(l1,3));
    System.out.println(ll.ReverseNode(l1));
    }
    
}
