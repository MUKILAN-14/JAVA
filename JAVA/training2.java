class RBI{
    int principle;
    int num_years;
    float rate_of_interest=3.5f;
    float rate_of_interest1=5.5f;
    float rate_of_interest2=4.5f;
    RBI(){
        System.out.println("1.SBI 2.HDFC 3.KVB 4.IOB");
    }
    RBI(int p,int n){
        principle=p;
        num_years=n;
    }
}
class SBI extends RBI{
    SBI(int p,int n){
        super(p,n);
    }
    float getSimpleInterest(){
        float SI;
        SI=(principle*num_years*rate_of_interest)/100;
        return SI;
    }
}
class CUB extends RBI{
    CUB(int p,int n){
        super(p,n);
    }
    float getSimpleInterest(){
        float SI;
        SI=(principle*num_years*rate_of_interest1)/100;
        return SI;
    }
}
class IOB extends RBI{
    IOB(int p,int n){
        super(p,n);
    }
    
    float getSimpleInterest(){
        float SI;
        SI=(principle*num_years*rate_of_interest2)/100;
        return SI;
    }
}

class Test{
    public static void main(String []args){
      SBI obj1= new SBI(1000,2);
      System.out.println("Simple interest in SBI :"+obj1.getSimpleInterest());
      CUB obj2= new CUB(1000,3);
      System.out.println("Simple interest in CUB :"+obj2.getSimpleInterest());
      IOB obj3= new IOB(2000,2);
      System.out.println("Simple interest in IOB :"+obj3.getSimpleInterest());
    }
}
class company{
    int days;
    int getSalary(int d){
        days =d;
        int salary;
        salary=1000*days;
        return salary;
    }
}
class employee extends company{
    int days;
    int getSalary(int d){
        days=d;
        int salary;
        salary=2000*days;
        return salary;
    }
    public static void main(String[]args){
        employee emp=new employee();
        System.out.println(emp.getSalary(30));
    }
}

class student{
    String name;
    int roll=19;
    Marks mark;
    student(String n,int r,Marks m){
        name=n;
        roll=r;
        mark=m;
    }
}
class Marks{
    int tam;
    int eng;
    int mat;
    int sci;
    Marks(int tam,int eng,int mat,int sci){
        this.tam=tam;
        this.eng=eng;
        this.mat=mat;
        this.sci=sci;
    }
    int getTotal(){
        return(tam+eng+mat+sci);
    }
    public static void main(String[]args){
        Marks m1=new Marks(50,60,70,80);
        student st1=new student("mukilan",12,m1);
        System.out.println("Total Mark :"+st1.mark.getTotal());
        System.out.println(st1.roll);
    }
}


    class StringRotation    
    {    
        public static void main(String[] args) {    
            String str1 = "abcde", str2 = "deabc";    
                
            if(str1.length() != str2.length()){    
                System.out.println("Second string is not a rotation of first string");    
            }    
            else {      
                str1 = str1.concat(str1);  
                System.out.println(str1.indexOf(str2));      
                if(str1.indexOf(str2)>=0)    
                    System.out.println("Second string is a rotation of first string");    
                else    
                    System.out.println("Second string is not a rotation of first string");    
            }    
        }    
    }   


    class SwapStrings     
    {    
        public static void main(String[] args) {    
            String str1 = "Good ", str2 = "morning ";    
            System.out.println("Strings before swapping: " + str1 + " " + str2);  

            str1 = str1 + str2;   
            System.out.println(str1);

            str2 = str1.substring(0, (str1.length() - str2.length())); 
            System.out.println(str2);      
            str1 = str1.substring(str2.length());    
            System.out.println("Strings after swapping: " + str1 + " " + str2);    
        }    
    }   

abstract class iphone{
    abstract void getColor();
    abstract void getprice();
    protected void getOs(){
        System.out.println("IOS");
    }
}
class iphone11 extends iphone{
    String color;
    int price;
    iphone11(String c,int p){
        color=c;
        price=p;
    }
    void getColor(){
        System.out.println("Color :"+color);
    }
    void getprice(){
        System.out.println("Price :"+price);
    }
}
class iphone12 extends iphone{
    String color;
    int price;
    iphone12(String c,int p){
        color=c;
        price=p;
    }
    void getColor(){
        System.out.println("Color :"+color);
    }
    void getprice(){
        System.out.println("Price :"+price);
    }
}
class iphone13 extends iphone{
    String color;
    int price;
    iphone13(String c,int p){
        color=c;
        price=p;
    }
    void getColor(){
        System.out.println("Color :"+color);
    }
    void getprice(){
        System.out.println("Price :"+price);
    }

}
class testclass{
    public static void main(String[]args){
        iphone ip=new iphone11("red",40000);
        ip.getOs();
        ip.getColor();
        ip.getprice();
        ip=new iphone12("Blue",50000);
        ip.getOs();
        ip.getColor();
        ip.getprice();
        ip=new iphone13("Black",70000);
        ip.getOs();
        ip.getColor();
        ip.getprice();
    }
}
interface Android{
    void messenger();
    void voiceRecording();
    void Bluetooth();
}
interface Iphone{
    void screenShot();
    void Whatsapp();
    void wifi();
}
class oneplus implements Android{
    oneplus(){
        messenger();
    }
    public void messenger(){
        System.out.println("Messenger");
    }
    public void voiceRecording(){
        System.out.println("Recording voice");
    }
    public void Bluetooth(){
        System.out.println("bluetooth is connected");
    }
}
class oppo implements Android{
    public void messenger(){
        System.out.println("Oppo Messenger");
    }
    public void voiceRecording(){
        System.out.println("RECORDING");
    }
    public void Bluetooth(){
        System.out.println("BLUETOOTH IS CONNECTED");
    }
}
class Iphone11 implements Iphone{
    public void screenShot(){
        System.out.println("ScreenShot Taken");
    }
    public void Whatsapp(){
        System.out.println("Whatsapp Messenger");
    }
    public void wifi(){
        System.out.println("Wifi connected");
    }
}
class Iphone12 implements Iphone{
    public void screenShot(){
        System.out.println("SCREENSHOT....");
    }
    public void Whatsapp(){
        System.out.println("WHATSAPP....");
    }
    public void wifi(){
        System.out.println("WIFI.....");
    }
}
interface note extends Android,Iphone{
    void Whatsapp();
    void Bluetooth();
    void wifi();
}
class accounts{
    private int balance;
    private int id;
    private String password;
    accounts(int id,String password){
        this.id=id;
        this.password=password;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance(String password) {
        if(this.password==password)
        {
        return balance;
        }
        else{
           System.out.println("Access Denied") ;
        }
        return 1;
    }
  
    
}
class test extends accounts{
    test(int id,String password){
        super(id,password);
    }
    public static void main(String[]args){
        test u1=new test(17,"MUKILAN");
        u1.getBalance("MUKILAN");
    }
}