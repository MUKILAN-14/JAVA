interface Engine{
    void engineStart();
    void engineOff();
}
interface Features{
    void connectbluetooth();
    void openMap();
}
class Vehicle{
       String modelname;
       String brand;
       int year;
       Vehicle(String modelname, String brand, int year){
        this.modelname=modelname;
        this.brand=brand;
        this.year=year;
        
       }
}

class Car extends Vehicle implements Engine,Features{
    Car(String modelname, String brand, int year) {
        super(modelname, brand, year);
        System.out.println("Modelname:"+modelname+" Brand:"+brand+" Year:"+year);
    }
    public void engineStart(){
        System.out.println("Engine Start");
    }
    public void engineOff(){
        System.out.println("Engine Off");
    }
    public void connectbluetooth(){
        System.out.println("Bluetooth ON");

    }
    public void openMap(){
        System.out.println("Open Map");
    }
    

} 
class vehi{
    public static void main(String args[]){
        Car thecar=new Car("Nexon","TATA",2023);
        thecar.engineStart();
        thecar.engineOff();
        thecar.connectbluetooth();
        thecar.openMap();

    }
}