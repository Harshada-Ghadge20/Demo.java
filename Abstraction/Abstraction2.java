abstract class Animal{
    abstract void sound();

    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{

    void sound(){
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat is meowww mewww");
    }
}


class Bufellow extends Animal{
    void sound(){
        System.out.println("Bufellow is marking");
    }
}

public class Main{
    public static void main(String[]args){

        Dog d =new Dog();
        Cat c=new Cat();
        Bufellow b=new Bufellow();

        d.sound();
        d.eat();
        c.sound();
        c.eat();
        b.sound();
        b.eat();
    }
}
