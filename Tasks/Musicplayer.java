import java.util.*;

interface Playable{
    void play();
    void stop();
}
class MP3Player implements Playable{
    int a;
    MP3Player(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose 1 to 3");
        a=sc.nextInt();
        sc.close();
    }
    public void play(){
        switch(a){
            case 1:
            System.out.println("Narumughaiye Narumughaiye from IRUVAR");
            stop();
            break;
            case 2:
            System.out.println("kalank title track from KALANK");
            stop();
            break;
            case 3:
            System.out.println("Thaabangaley From 96");
            stop();
            break;
        }
    }
    public void stop(){
        System.out.println("Music is stopped");
    }
}
class radio implements Playable{
    public void play(){
        System.out.println("Rathamaarey from JAILER");
    }
    public void stop(){
        System.out.println("Music is stopped");
    }
}
class music{
    public static void main(String []args){
        Playable user1=new MP3Player();
        user1.play();
        
    }
    
}