package com.springcourse.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = null;
        try {
            bookName = uniLibrary.returnBook();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Название возвращенной книги " + bookName);

        context.close();
        System.out.println("Method main ends");

    }
}
