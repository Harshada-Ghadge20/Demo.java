class Car{
    String name;
    String colour;
    int model;
    int speed;

    void display(){
        System.out.println("car name:"+name);
        System.out.println("car colour:"+colour);
        System.out.println("car model:"+model);
        System.out.println("car speed:"+ speed);
    }


}

public class Main {
    public static void main (String[]args){

        Car c1= new Car();
        c1.name="Vegnor";
        c1.colour="Red";
        c1.model=2026;
        c1.speed=50;

        c1.display();


    }

} 
