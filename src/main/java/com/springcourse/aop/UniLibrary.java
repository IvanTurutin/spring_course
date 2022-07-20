package com.springcourse.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

//    @Override
    public void getBook() {
        System.out.println("мы берем книгу из UniLibrary ");
        System.out.println("------------------------------");
    }

    public String returnBook() {
        int a = 1 / 0;
        System.out.println("возвращаем книгу в UniLibrary");
//        System.out.println("------------------------------");

        return "Буратино";
    }

    public String getMagazine() {

        System.out.println("мы берем журнал из UniLibrary");
        System.out.println("------------------------------");

        return "";
    }

    public void returnMagazine() {

        System.out.println("Мы возвращаем журнал в Unilibrary");
        System.out.println("------------------------------");

    }

    public void addBook(String personName, Book book) {
        System.out.println("мы добавляем книгу в UniLibrary ");
        System.out.println("------------------------------");

    }

    public void addMagazine() {

        System.out.println("мы добавляем журнал в UniLibrary ");
        System.out.println("------------------------------");

    }

    public void getNewspaper() {
        System.out.println("Мы берем газету в UniLibrary");
        System.out.println("------------------------------");

    }

}
