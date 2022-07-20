package com.springcourse.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

/*    @Around("execution(public String returnBook())")
    public Object aroundReturningBookLoggingAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturningBookLoggingAspect: в библиотеку " +
                "пытаются вернуть книгу");
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();

        } catch (Exception e) {
            System.out.println("aroundReturningBookLoggingAspect: было поймано" +
                    " исключение: " + e);
            targetMethodResult = "Неизвесное название книги";
        }

        System.out.println("aroundReturningBookLoggingAspect: в библиотеку " +
                "успешно вернули книгу");
        return targetMethodResult;
    }*/

    @Around("execution(public String returnBook())")
    public Object aroundReturningBookLoggingAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturningBookLoggingAspect: в библиотеку "
                + "пытаются вернуть книгу");
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();

        } catch (Exception e) {
            System.out.println("aroundReturningBookLoggingAspect: было поймано"
                    + " исключение: " + e);
            throw e;
        }

        System.out.println("aroundReturningBookLoggingAspect: в библиотеку "
                + "успешно вернули книгу");
        return targetMethodResult;
    }
}
