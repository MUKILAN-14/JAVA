package add;
public class Addition{
    int a;
    int b;
    int total;

    Addition(){
        System.out.println("Hello");
    }
    Addition(int a ,int b){
        this.a=a;
        this.b=b;
        total=sum(a,b);
        System.out.println("Total is :"+total);
    }
    int sum(int a,int b){
        return a+b;
    }
    public static void main(String[]args){
        new Addition(12,13);
    }
}