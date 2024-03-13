import java.util.*;

class Banking {
    static int balance=1000;
    int amount;
    
    void Credit(int amt){
        amount=amt;
        if (amount>100000){
            System.out.println("Crossed the per day limit");
            System.out.println("");
        }
        else{
        balance=balance+amount;
        System.out.println("Amount Credited :"+amount);
        System.out.println("Account balance :"+balance);
        System.out.println("");
        }
    }
    void Debit(int amt){
        amount=amt;
        if (amount>balance){
            System.out.println("insufficient balance");
            System.out.println("Account Blance :"+balance);
            System.out.println("");
        }
        else if(amount>40000){
            System.out.println("Crossed the Per day limit");
            System.out.println("");
        }
        else{
        balance=balance-amount;
        System.out.println("Amount Debited :"+amount);
        System.out.println("Account balance :"+balance);
        System.out.println("");
        }
    }

    public static void main(String[] args) {
        Banking mem=new Banking();
        mem.Credit(2000);
        mem.Debit(100);

        Banking mem1=new Banking();
        mem1.Credit(4000);
        mem1.Debit(600);
   }
}
class fact {
    
    static void getfact(int num){
        int fact=1;
        for(int strt=1;strt<=num;strt++){
            fact=fact*strt;
        }
        System.out.println("Factorial of the num is :"+fact);
    }
    
    public static void main(String[] args) {
        fact num1=new fact();
        num1.getfact(6);
   }
}


class details{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Roll number :");
        int roll_no=sc.nextInt();
        System.out.println("Enter the Name :");
        String name=sc.nextLine();
    }
}

class Employee{

     int calculate_salary(int salary,int days){
        return days*salary;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Employee emp1=new Employee();
        System.out.println("Enter your name :");
        String name=sc.next();
        System.out.println("Enter your id :");
        int id=sc.nextInt();
        System.out.println("Enter no.days :");
        int a=sc.nextInt();
        System.out.println("Enter per day salary :");
        int b=sc.nextInt();
        int tot=emp1.calculate_salary(b,a);
        System.out.println("Monthly Salary :"+tot);
    }
}

class arr{
    
    public static void main(String[] args){
        int a[]= new int[]{100,200,300,300,200,100};
        int b[]= new int[a.length];
        int count=0;
        for(int i=0;i<a.length;i++){
            b[i]=a[i];     
        }
        for(int i=0;i<a.length;i++){
            
            for(int j=i;j<b.length;j++){
                if (a[i]==b[j]){
                    b[j]=0;
                    count=count+1;
                }
            }
            if (count==0){
               continue; 
            }
            else{
            System.out.println(String.format("%d : %d",a[i],count));
            }
            count=0;
        }
    }
}


class largest{
    public static void main(String []args){
        int a[]= new int[]{2,4,1,8,3,5};
        for(int i=0;i<a.length;i++){
             int temp=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
           
        }
    }
}

class matrix{
    public static void main(String[] args){
        int a[][]= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int b[][]= new int[][]{{1,1,1},{1,3,1},{5,4,2}};
        int c[][]= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]);
            }
        }
        
    }
}

class oddoreven{
    public static void main(String[] args){
        int a[][]=new int [][]{{1,2,3},{4,5,6},{7,8,9}};
        int count_even=0;
        int count_odd=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if(a[i][j]%2==0){
                    count_even++;
                }
                else{
                    count_odd++;
                }
            }
            
        }
        System.out.println("No of even :"+count_even);
        System.out.println("No of odd :"+count_odd);
    }
}
class string{
    public static void main(String[] args){
        String str=new String();
        StringBuffer sb=new StringBuffer("Hello ");
        System.out.println(sb.append("world"));
        str="mukilan";
        String m= new String(" M");
        System.out.println(str);
        System.out.println(m);
        System.out.println(str.equals(m));
        if(str==m){
            System.out.println("hi");
        }
        String c=new String(new char[]{'m','u'});
        System.out.println(c);
        String name= new String();
        name=str.concat(m);
        System.out.println(name);
        int index;
        index=str.indexOf("u");
        System.out.println(index);
        
    }
}

class employee{
        int id;
        String name;
        int salary;
        int days;
    employee(int ID, String Name,int sal,int Days){
        id=ID;
        name=Name;
        salary=sal;
        days=Days;
    }
     int getSalary(){
        int sal=days*1000;
        return sal;
     }

     int workingDays(){
        return days;
     }
}

class staff extends employee{
        int rollNo;
        int experience;
        String dept_name;
    staff(int roll,int exp,String dept,int a,String b,int c,int d){
        super(a,b,c,d);
        rollNo=roll;
        experience=exp;
        dept_name=dept;
    }
    void getDetails(){
        
       System.out.println(id);
       System.out.println(name);
       System.out.println(rollNo);
       System.out.println(dept_name);

       System.out.println(getSalary());
       System.out.println(workingDays());
    }

    public static void main(String[] args){
        staff st1=new staff(17,3,"EEE",2117,"Mukilan",20000,23);
        st1.getDetails();
    }
}

class car{

    car(){
        System.out.println("Cars Milege");
    }

}
class tata extends car{
    int milege;
    int distance;
    int petrol_consumption;
    tata(){
        System.out.println("1.Tata");
    }
    tata(int e,int f){
        distance=e;
        petrol_consumption=f;
    }
    int getmilegeTata(){
        milege=distance/petrol_consumption;
        return milege;
    }
}
class punch extends tata{
    int milege1;
    int distance1;
    int petrol_consumption1;
    punch(){
        System.out.println("2.Punch");
    }
    punch(int c,int d,int e,int f){
        super(e,f);
        distance1=c;
        petrol_consumption1=d;
        
    }
    int getmilegepunch(){
        milege1=distance1/petrol_consumption1;
        return milege1;
    }
}
class spresso extends punch{
    int milege2;
    int distance2;
    int petrol_consumption2;
    spresso(){
        System.out.println("3.Spresso");
    }
    spresso(int a,int b,int c,int d,int e,int f){
        super(c,d,e,f);
        distance2=a;
        petrol_consumption2=b;
    }
    int getmilegespresso(){
        milege2=distance2/petrol_consumption2;
        return milege2;
    }
    void milege(){
        System.out.println("Milege of Tata    : "+getmilegeTata());
        System.out.println("Milege of Punch   : "+getmilegepunch());
        System.out.println("Milege of Spresso : "+getmilegespresso());
    }

    public static void main(String[] args){
        spresso num1=new spresso(50,2,60,2,65,3);
        num1.milege();
    }
}
class mm{
    int a;
    int b;
    int c;
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
}