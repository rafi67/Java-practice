package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ValueAnnotation{
    int value();
}

class Hello {
    @ValueAnnotation(10)
    public void sayHello() {
        System.out.println("Hello annotation");
    }
}

public class DemoAnnotation2 {
    public static void main(String... args) {
        try {
            Hello h = new Hello();
            Method m = h.getClass().getMethod("sayHello");
            ValueAnnotation v = m.getAnnotation(ValueAnnotation.class);
            System.out.println("Value is "+v.value());
        }
        catch(NoSuchMethodException e){
            e.printStackTrace();
        }
    }
}
