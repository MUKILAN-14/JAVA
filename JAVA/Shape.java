import java.util.*;

class rectangle{
    int length,height,breadth;
    int area;
    void CalculateArea(int len,int he,int br){
        length=len;
        height=he;
        breadth=br;
        area=length*height*breadth;
    }
}

class circle{
    float pi=3.14f;
    float radius;
    float area;
    void CalculateArea(float rad){
        radius=rad;
        area=pi*radius*radius;      
    }
}

class triangle{
    int breadth,height;
    int area;
    void CalculateArea(int br,int he){
        breadth=br;
        height=he;
        area =(breadth*height)/2;      
    }
}

class Shape{
    public static void main(String []args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the Sno 1.Rectangle 2.Circle 3.triangle:");
        int shape=scr.nextInt();
        switch(shape){
            case 1:
                rectangle rect=new rectangle();
                System.out.println("Enter the value of length:");
                int len=scr.nextInt();
                System.out.println("Enter the value of height:");
                int he=scr.nextInt();
                System.out.println("Enter the value of breadth:");
                int br=scr.nextInt();
                rect.CalculateArea(len,he,br);
                int area=rect.area;
                System.out.println("Area of the Rectangle :"+area);
                break;
            case 2:
                circle cir=new circle();
                System.out.println("Enter the Radius :");
                int rad=scr.nextInt();
                cir.CalculateArea(rad);
                float Area_Cir=cir.area;
                System.out.println("Area of the circle:"+Area_Cir);
                break;
            case 3:
                triangle tri=new triangle();
                System.out.println("Enter the value of height:");
                int hei=scr.nextInt();
                System.out.println("Enter the value of breadth:");
                int brd=scr.nextInt();
                tri.CalculateArea(brd,hei);
                int Area_tri=tri.area;
                System.out.println("Area of the triangle :"+Area_tri);
                break;
            default :
                System.out.println("Enter the valid Sno");

        }
        

    }
}