class Grading{
    String name;
    int mark;
    Grading(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
    void getDetails(){
        System.out.println("Name of the Student :"+name);

        System.out.println("Mark of the Student :"+mark+"/100");
    }
    void getGrade(){
        getDetails();
        if(mark>90){
            System.out.println("GRADE A");
        }
        else if(mark>70){
            System.out.println("GRADE B");
        }
        else if(mark>60){
            System.out.println("GRADE C");
        }
        else if(mark>50){
            System.out.println("GRADE D");
        }
        else if(mark>35){
            System.out.println("GRADE E");
        }
        else{
            System.out.println("FAIL");
        }
    }
    public static void main(String []args){
        Grading st1=new Grading("Mukilan M",80);
        st1.getGrade();
    }
}