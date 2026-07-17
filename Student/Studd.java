class Stud{
    String name;
    String address;
    int age;
    int marks;
    int rollno;

    void display(){
        System.out.println("student name:" +name);
        System.out.println("student address:" +address);
        System.out.println("student age:" +age);
        System.out.println("student marks:" +marks);
        System.out.println("student rollno:" +rollno);
    }
}


public class Main {
    public static void main(String[] args) {

        Stud s1 = new Stud();

        s1.name = "Sudarshan";
        s1.address = "Pune";
        s1.age = 23;
        s1.marks = 98;
        s1.rollno = 15;


        s1.display();
    }
}
