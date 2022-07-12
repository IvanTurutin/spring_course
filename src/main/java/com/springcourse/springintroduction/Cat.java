package com.springcourse.springintroduction;

//@Component("catBean")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat constructor is created");
    }

    @Override
    public void say() {
        System.out.println("Myau-Myau");
    }
}
