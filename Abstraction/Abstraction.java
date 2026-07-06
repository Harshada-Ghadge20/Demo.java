abstract class Vehicle{
    abstract void model();

    void start(){
        System.out.println("vehicle is start...");
    }
}
class Bike extends Vehicle{
    void model(){
        System.out.println("bike model is honda shine ");
    }
}
public class Main{
    public static void main(String[]args){
        Bike b =new Bike();
        b.model();
        b.start();

    }
}
