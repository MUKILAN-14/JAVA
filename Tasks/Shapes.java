interface Shape{
    void calculateArea(int a,int b,int c);
}
class AbstractShape {
    String shape_name;
    String color;
    float area;
    AbstractShape(String name,String color){
        shape_name=name;
        this.color=color;
    }

    void displayDetails(){
        System.out.println(" ");
        System.out.println("Name of the Shape :"+shape_name);
        System.out.println("Color of the shape :"+color);
        System.out.println("Area of the Shape :"+area);
        System.out.println(" ");

    }
}


class rectangle extends AbstractShape implements Shape{
    int length,height,breadth;
    float area;
    rectangle(int length,int height,int breadth,String name,String color){
        super(name,color);
        this.length=length;
        this.height=height;
        this.breadth=breadth;
        calculateArea(length, height, breadth);
        super.area=area;
    }
    public void calculateArea(int len,int he,int br){
        length=len;
        height=he;
        breadth=br;
        area= length*height*breadth;
    }
}

class circle extends AbstractShape{
    float pi=3.14f;
    float radius;
    float area;
    circle(float radius,String name,String color){
        super(name,color);
        this.radius=radius;
        calculateArea(radius);
        super.area=area;
    }
    public void calculateArea(float rad){
        radius=rad;
        area= pi*radius*radius;     
    }
}

class triangle extends AbstractShape{
    int breadth,height;
    float area;
 
    triangle(int breadth,int height,String name,String color){
        super(name,color);
        this.breadth=breadth;
        this.height=height;
        calculateArea(breadth, height);
    }
    public void calculateArea(int br,int he){
        breadth=br;
        height=he;
        area= (breadth*height)/2; 
        super.area=area;  
    }
    public static void main(String[]args){
        AbstractShape shp=new triangle(2,4,"triangle","red");
        shp.displayDetails();
    }
}
