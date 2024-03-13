import java.util.*;

class wrapperClass {
    
    public static void main(String []args){
        //creating
        ArrayList<Integer>ls=new ArrayList<>();
        //adding
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        System.out.println(ls);
        //read
        System.out.println(ls.get(2));
        //update
        ls.add(2,7);
        System.out.println(ls);
        //delete
        ls.remove(0);
        System.out.println(ls);
        //clone
        System.out.println(ls.clone());
        //index
        System.out.println(ls.indexOf(5));
        //replace
        ls.set(0,2);
        System.out.println(ls);
        //size
        System.out.println(ls.size());
        for (int i=0;i<ls.size();i++){
            if (ls.get(i)==4){
                ls.remove(ls.get(i));
                System.out.println(ls);
            }
        }
        for(int i=0;i<ls.size();i++){
            System.out.println((ls.get(i))*2);
        }
    }
}
class minmax{
    public static void main(String[]args){
        ArrayList<Integer> m=new ArrayList<>();
        m.add(7);
        m.add(-1);
        m.add(3);
        m.add(5);
        m.add(0);

        int min=m.get(0),max=m.get(0);
        
        for(int i=0;i<m.size();i++){
            if(m.get(i)<min){
                min=m.get(i);
            }
            else if (m.get(i)>max){
                max=m.get(i);
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
class Rotate{
    public static void main(String[]args){
        ArrayList<Integer> m=new ArrayList<>();
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        m.add(5);
        int r=3;
        int count=0;
        for(int i=0;i<r;i++){
           if(count<r){
           int f=m.remove(count);
           m.add(f);
          }  
        }
        System.out.println(m);
    }
}
class Reverse{
    ArrayList<Integer> reverse(ArrayList<Integer> Arr,int strt,int end){
        int e=end;
        for(int i=strt;i<=e;i++){
            int n=Arr.remove(strt);  
            Arr.add(end,n);
            end--;
        }
        return Arr;
    }
    public static void main(String[]args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
        Reverse r=new Reverse();
        System.out.println(r.reverse(a, 0, 2));
    }
}
class Duplicates{
    public static void main(String[] args) {
        ArrayList<Integer> Ar=new ArrayList<>();
        Ar.add(1);
        Ar.add(2);
        Ar.add(3);
        Ar.add(3);
        Ar.add(4);
        Ar.add(5);
        ArrayList<Integer> vis=new ArrayList<>();
        for(int i=0;i<=Ar.size();i++){
            int h=Ar.get(i);
            vis.add(h,Ar.get(i));
        }
        System.out.println(vis);
    }
}

class linked_list{
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(3);
        ll.add(2);
        ll.add(1);
        System.out.println(ll);
    }
}
class hashSet{
    public static void main(String[] args) {
        ArrayDeque<Integer> as=new ArrayDeque<>();
        as.add(1);
        as.add(2);
        as.add(3);
        as.add(3);
        as.add(4);
        System.out.println(as.hashCode());
        System.out.println(as);
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(4);
        hs.add(2);
        hs.add(2);
        hs.add(6);
        System.out.println(hs);
    }
}
class Valid_paranthesis{
    public static void main(String[] args) {
        String m="((()))";
        ArrayDeque<Character> ad=new ArrayDeque<>();
        for(int i=0;i<m.length();i++){
            if(m.charAt(i)=='(')
            ad.push(m.charAt(i));
            else{
                if(ad.isEmpty()==true){
                    System.out.println("invalid");
                    break;
                }
                ad.pop();
            }
        }
        if(ad.isEmpty()){
            System.out.println("valid");

        }
        else{
            System.out.println("invalid");
        }
        
    }
}
class FindDuplicates{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(3);
        al.add(1);
        al.add(4);
        al.add(5);
        al.add(5);
        al.add(5);
        al.add(7);
        al.add(1);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(3);
        al.add(1);
        al.add(4);
        al.add(5);
        al.add(5);
        al.add(5);
        al.add(7);
        ArrayList<Integer> al1=new ArrayList<>();
        for(int i=0;i<al.size();i++){
            al1.add(al.get(i));
        }
        int count=0;
        for(int i=0;i<al.size();i++){
            for(int j=i;j<al1.size();j++){
                if(al.get(i)==al1.get(j)){
                    al1.set(j,0);
                    count++;
                }
            }
            if (count>1){
             System.out.println(String.format("%d",al.get(i)));
             }
             count=0;
        }
        
    }
    
}
class MissingElement{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(); 
        al.add(5);
        al.add(3);
        al.add(4);
        al.add(1);
        al.add(6);
        al.add(7);
        al.add(2);
        al.add(9);
        int sum_array=0;
        int sum_of_N=0;
        int ele=0;
        for(int i=0;i<=al.size()+1;i++){
            sum_of_N=sum_of_N+i;
        }
        for(int i=0;i<al.size();i++){
            sum_array=sum_array+al.get(i);
        }
        ele=sum_of_N-sum_array;
        System.out.println(ele);
    }
}
class Missinginarray{
    public static void main(String[] args) {
        int ar1[]=new int[]{1,2,4,5};
        int size=5;
        boolean visited[]=new boolean[ar1.length];
        for(int i=0;i<size;i++){
            visited[i]=false;
        }
        for(int i=0;i<ar1.length;i++){
            visited[ar1[i]]=true;
        }  
    }
}
class factorial{
    void func(int k){
        int i=k;
        while(i>0){
            while(k>1){
                k=k/2;
                System.out.println(k);
            }
            i--;
        }
        
    }
    public static void main(String[] args) {
        factorial m=new factorial();
        m.func(10);
    }
}
class Stack{
    private int array_size=4;
    private int ref=-1;
    public char arr[]=new char[array_size];
    public int arr1[]=new int[array_size];

    boolean push(int n){
        ref=ref+1;
        if(ref==arr1.length){
            ref=ref-1;
            return false;
        }
        arr1[ref]=n;
        return true;
    }

    int pop(){
        int temp=arr1[ref];
        arr1[ref]=0;
        ref--;
        return temp;
    }

    boolean ispalindrome(String input){
        for(int i=0;i<input.length();i++){
            push(input.charAt(i));
        }
        boolean res=false;
        int p1=0;
        int p2=input.length()-1;
        while(p1!=p2){
            if(p1>p2){
                break;
            }
            else if(arr1[p1]==arr1[p2]){
                res=true;
            }
            else{
                res=false;
            }
            p1++;
            p2--;
        }
        return res;
    }

    void Reverse(){
        for(int i=0;i<arr1.length;i++){
            for(int j=arr1.length-1;j<=0;j--){
            int temp=arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;
            }
           break; 
        }
        System.out.print("[");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Stack st1=new Stack();
         /*String input1="MALAYALAM";
        String input2="bjbubb";
        System.out.println(st1.ispalindrome(input1));
        System.out.println(st1.ispalindrome(input2));
        */ 
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        
        st1.Reverse();
       
    }
}


class LinkedListNode{

    int data;

    LinkedListNode next;

    public LinkedListNode(int data, LinkedListNode next) {
        this.data = data;
        this.next = next;
    }



}
class LinkedListCustom {
    


    public static void main(String[] args){
    
        
        LinkedListNode node4 = new LinkedListNode(9,null);
        LinkedListNode node3 = new LinkedListNode(7,node4);
        LinkedListNode node2 = new LinkedListNode(5,node3);
        LinkedListNode node = new LinkedListNode(1,node2);

        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
      
    }
}