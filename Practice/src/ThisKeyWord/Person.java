package ThisKeyWord;

public class Person {
    String name;
    int age;
    String HairColor;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    Person(String name, int age, String HairColor){
        this(name, age);
        this.HairColor = HairColor;
    }

    void message(){
        System.out.println("I'm message method");
    }

    void display2(){
        this.message();
        System.out.println("I'm display2 method");
    }

    void display(){
        System.out.println("Person name is "+name);
        System.out.println("Person age is "+age);
        System.out.println("Person Hair color is "+HairColor);
    }
}
