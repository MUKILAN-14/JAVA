class Animals{
    String animal_name;
    Animals(String animal_name){
        this.animal_name=animal_name;
    }
    void makesound(){
        System.out.println(animal_name);
    }
}
class cat extends Animals{
    cat(String name){
        super(name);
    }
    void makesound(){
        System.out.println(animal_name);
        System.out.println("Meow Meow");
    }
}
class dog extends Animals{
     dog(String name){
        super(name);
    }
    void makesound(){
        System.out.println(animal_name);
        System.out.println("Barking");
    }
}
class cow extends Animals{
     cow(String name){
        super(name);
    }
    void makesound(){
        System.out.println(animal_name);
        System.out.println("Moooooooo");
    }
}
class sheep extends Animals{
     sheep(String name){
        super(name);
    }
    void makesound(){
        System.out.println(animal_name);
        System.out.println("Baaa Baaa");
    }
}
class lion extends Animals{
     lion(String name){
        super(name);
    }
    void makesound(){
        System.out.println(animal_name);
        System.out.println("Roar");
    }
}
class main{
    public static void main(String[]args){
        cat c=new cat("CAT");
        c.makesound();
        dog d=new dog("DOG");
        d.makesound();
        lion l=new lion("LION");
        l.makesound();
        cow co=new cow("COW");
        co.makesound();
        sheep s=new sheep("SHEEP");
        s.makesound();
    }
}