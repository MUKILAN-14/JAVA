class Train {
    private String name;
    private String departureTime;
    private String sourceStation;
    private String destinationStation;
    private int passengerStrength;
    private int trainNumber;

    public Train(String name, String departureTime, String sourceStation, String destinationStation,
                 int passengerStrength, int trainNumber) {
        this.name = name;
        this.departureTime = departureTime;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.passengerStrength = passengerStrength;
        this.trainNumber = trainNumber;
    }

    public void getdetails() {
        System.out.println(name);
        System.out.println(departureTime);
        System.out.println(trainNumber);
    }

}

class ReservationSystem {
    user[] arr;
    
    void createSeat(){
        String a[]={"a1","a2","a3","a4","a5"};
        String l[]={"l1","l2","l3","l4","l5"};
    }
    void createUser(String name,int id,String source,String destination){
        arr = new user[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=new user(id,name,source,destination);
        }
    }
    void displayUser(){
        System.out.println(arr);
    }

    public static void main(String[] args) {
        ReservationSystem u1 = new ReservationSystem();
        u1.createUser("mukilan", 17, "chennai", "thanjavur");
        u1.displayUser();
   }
}
class user{
    int id;
    String name;
    String source;
    String destination;

    user(int id,String name,String source,String destination){
        this.id=id;
        this.source=source;
        this.name=name;
        this.destination=destination;
    }
}