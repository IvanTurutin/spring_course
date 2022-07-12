package com.springcourse.aop.aspects;

import com.springcourse.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

/*
    @Pointcut("execution(* com.springcourse.aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {}

    @Pointcut("execution(* com.springcourse.aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsFromUniLibraryExcludeReturnMagazine() {}

    @Before("allMethodsFromUniLibraryExcludeReturnMagazine()")
    public void beforeAllMethodsExcludeReturnMagazineAdvice() {
        System.out.println("beforeAllMethodsExcludeReturnMagazineAdvice: writing Log #4");
    }
*/

/*
    @Pointcut("execution(* com.springcourse.aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {}

    @Pointcut("execution(* com.springcourse.aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {}

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAndReturnMethodsFromUniLibrary() {}

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
    }
*/





    @Before("com.springcourse.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = "
                + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = "
                + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = "
                + methodSignature.getName());

        if("addBook".equals(methodSignature.getName())) {
            Object[] arguments = joinPoint.getArgs();
            for (Object o : arguments) {
                if (o instanceof Book) {
                    Book myBook = (Book) o;
                    System.out.println(
                            "Информация о книге: " +
                            "название - " + myBook.getName()
                            + ", автор - " + myBook.getAuthor()
                            + ", год издания - " + myBook.getYearOfPublication()
                            );
                } else if (o instanceof String) {
                    System.out.println("книгу в библиотеку добавляет - " + o);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: логирование " +
                "попытки получить книгу/журнал");
        System.out.println("------------------------------");

    }

/*
    @Before("execution(public * return*())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
    }
*/

}
