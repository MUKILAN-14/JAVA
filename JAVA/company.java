abstract class company{
    String name;
    String department;
    int WorkingDays;
    company(String name,String department,int WorkingDays){
        this.name=name;
        this.department=department;
        this.WorkingDays=WorkingDays;
    }
    abstract void getSalary();
    abstract void getCompany();
    protected int getTotalWorkingDays(){
        return 25;
    }
    void getProfile(){
        System.out.println("Name               :"+name);
        System.out.println("Department         :"+department);
        System.out.println("No of Working days :"+WorkingDays+"/"+getTotalWorkingDays());
        System.out.println("Domain             :"+getClass().getName());
    }
    
}
class DepartmentStaff extends company{
    int salary;
    int days;
    String company_name;
    DepartmentStaff(int days,String com,String a,String b,int c){
        super(a,b,c);
        this.days=days;
        company_name=com;
    }
    void getSalary(){
        this.days=days;
        salary=1000*days;
        System.out.println("Salary of Department Staff :"+salary);
    }
    void getCompany(){
        
        System.out.println("Company Name               :"+company_name);
    }
}
class NonTechtStaff extends company{
    int salary;
    int days;
    String company_name;
    NonTechtStaff(int days,String com,String a,String b,int c){
        super(a,b,c);
        this.days=days;
        company_name=com;
    }
    void getSalary(){
        this.days=days;
        salary=800*days;
        System.out.println("Salary of NonTechtStaff Staff :"+salary);
    }
    void getCompany(){
       
        System.out.println("Company Name            :"+company_name);
    }
}
class manager extends company{
    int salary;
    int days;
    String company_name;
    manager(int days,String com,String a,String b,int c){
        super(a,b,c);
        this.days=days;
        company_name=com;
    }
    void getSalary(){
        salary=1500*days;
        System.out.println("Salary of Manager :"+salary);
    }
    void getCompany(){
        System.out.println("Company Name      :"+company_name);
    }
  public static void main(String[]args){
        company em1=new manager(23,"cybernaut","Mukilan M","EEE",23);
        System.out.println(" ");
        em1.getSalary();
        em1.getCompany();
        em1.getProfile();
        System.out.println(" ");
        em1=new DepartmentStaff(22,"cybernaut","Rupendraa E","EEE",22);
        em1.getSalary();
        em1.getCompany();
        em1.getProfile();
        System.out.println(" ");
        em1=new NonTechtStaff(17,"cybernaut","Dhivakar N","EEE",17);
        em1.getSalary();
        em1.getCompany();
        em1.getProfile();
        
    }
}