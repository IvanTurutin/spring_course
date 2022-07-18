package com.springcourse.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturningBookLoggingAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturningBookLoggingAspect: в библиотеку " +
                "пытаются вернуть книгу");
        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        System.out.println("aroundReturningBookLoggingAspect: в библиотеку " +
                "успешно вернули книгу");
        System.out.println("aroundReturningBookLoggingAspect: метод returnBook " +
                "выполнил работу за " + (end - begin) + " мс.");
        return targetMethodResult;
    }
}
