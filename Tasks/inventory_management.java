class Product{
    String name;
    int price;
    int quantity;

    Product(String name){
        this.name=name;
    }
    void displayDetails(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(quantity);
    }
}
class fruits extends Product{
    fruits(String name){
        super(name);
        super.price=120;
        super.quantity=30;
    }

}
class Dairy extends Product{
    Dairy(String name){
        super(name);
        super.price=320;
        super.quantity=20;
    }

}
class Vegies extends Product{
    Vegies(String name){
        super(name);
        super.price=100;
        super.quantity=200;
    }

}
class DryGoods extends Product{
    DryGoods(String name){
        super(name);
        super.price=620;
        super.quantity=50;
    }

}
class Store{
    public static void main(String[]args){
        Product c1= new fruits("Apple");
        c1.displayDetails();
        System.out.println(" ");
        c1= new Dairy("Ghee");
        c1.displayDetails();
        System.out.println(" ");
        c1= new Vegies("Tomato");
        c1.displayDetails();
        System.out.println(" ");
        c1= new DryGoods("Cashew Nuts");
        c1.displayDetails();
    }
}