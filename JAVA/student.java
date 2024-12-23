class student{
    int m1,m2,m3,m4,m5;
    int id,year;
    String Name;

    void GetTotal(){
        int Total=m1+m2+m3+m4+m5;
        System.out.println("Total   : "+Total);
    }

    void GetAverage(){
        int Average=(m1+m2+m3+m4+m5)/5;
        System.out.println("Average : "+Average);
    }

    void GetCGPA(){
        float CGPA=(float)(m1+m2+m3+m4+m5)/50;
        System.out.println("CGPA    : "+CGPA);
        System.out.println("          * * * * *             ");
        System.out.println(" ");
    }

    void GetInfo(){
        System.out.println("STUDENT INFORMATION");
        System.out.println("Name of the student      : "+Name);
        System.out.println("Id Number of the student : "+id);
        System.out.println("Year of study            : "+year);
        
    }
    public static void main(String[] args){
       student std1= new student();
       student std2= new student();
       student std3= new student();
       student std4= new student();

       std1.Name="Mukilan";
       std1.id=17;
       std1.year=3;
       std1.m1=60;
       std1.m2=78;
       std1.m3=87;
       std1.m4=67;
       std1.m5=98;
       std1.GetInfo();
       std1.GetTotal();
       std1.GetAverage();
       std1.GetCGPA();

       std2.Name="Rupendraa";
       std2.id=23;
       std2.year=3;
       std2.m1=80;
       std2.m2=98;
       std2.m3=87;
       std2.m4=77;
       std2.m5=98;
       std2.GetInfo();
       std2.GetTotal();
       std2.GetAverage();
       std2.GetCGPA();

       std3.Name="Raghupathi";
       std3.id=45;
       std3.year=3;
       std3.m1=90;
       std3.m2=83;
       std3.m3=81;
       std3.m4=80;
       std3.m5=73;
       std3.GetInfo();
       std3.GetTotal();
       std3.GetAverage();
       std3.GetCGPA();

       std4.Name="Baasha";
       std4.id=36;
       std4.year=3;
       std4.m1=70;
       std4.m2=73;
       std4.m3=67;
       std4.m4=87;
       std4.m5=88;
       std4.GetInfo();
       std4.GetTotal();
       std4.GetAverage();
       std4.GetCGPA();
    }
}