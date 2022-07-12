package com.springcourse.springintroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog dog = context.getBean("dogBean", Dog.class);
        dog.say();
/*
        Dog dog2 = context.getBean("dogBean", Dog.class);
        System.out.println("dog equal dog2? " + (dog == dog2));
*/
        context.close();
    }
}
