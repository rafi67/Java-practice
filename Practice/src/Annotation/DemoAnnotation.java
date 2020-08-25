package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

@interface MyAnnotation{}
@interface MyAnnotation2{
    int value() default 0;
}

@interface MyAnnotation3{
    int value1() default 0;
    String value2() default "";
    String value3() default "xyz";
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@interface Run{
    String name() default "";
}

class Animal {
    protected void eatSomething() {
        System.out.println("Eating something");
    }
}

class Dog extends Animal {
    @MyAnnotation3(value1=20, value2="Rafi", value3="Fahim")
    @Override
    protected void eatSomething() {
        System.out.println("Eating food");
    }
}

public class DemoAnnotation {
    @MyAnnotation
    @SuppressWarnings("unchecked")
    private static void showList() {
        ArrayList list = new ArrayList();
        list.add("Rafi");
        list.add("Shafil");
        list.add("Fahim");
        for(Object o:list){
            System.out.println(o);
        }
    }

    @Run(name="me1")
    public static void showName() {
        System.out.println("PC");
    }

    public static void main(String... args) {
        Animal a = new Dog();
        a.eatSomething();
        showList();
        showName();
    }
}
