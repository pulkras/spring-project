package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    //   private String name;

    public Dog() {
        System.out.println("Dog is create");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    public void init() {
        System.out.println("Class Dog: init method");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }

}
