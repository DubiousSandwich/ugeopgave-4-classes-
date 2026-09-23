public class Student {

    //opgave 1

    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void printInfo(){
        System.out.println("Name: " + this.name + " Age: " + this.age);
    }

}
