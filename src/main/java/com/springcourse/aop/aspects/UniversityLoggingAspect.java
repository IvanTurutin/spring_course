package com.springcourse.aop.aspects;

import com.springcourse.aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

@Component
@Aspect
public class UniversityLoggingAspect {
/*
    @Before("execution(* get*())")
    public void beforeGetStudentsLoggingAdvice(JoinPoint joinPoint) {
        System.out.println("beforeGetStudentsLoggingAdvice: логгируем получение" +
                " списка студентов перед методом getStudents()");
    }

    @AfterReturning(pointcut = "execution(* get*())",
    returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student student1 = students.get(0);
        String name = student1.getNameSurname();
        student1.setNameSurname("Mr." + name);
        double avgGrade = student1.getAvgGrade();
        student1.setAvgGrade(avgGrade + 0.1);

        System.out.println("afterReturningGetStudentsLoggingAdvice: логгируем получение" +
                " списка студентов после выполнения метода getStudents()");
    }
*/

    @AfterThrowing(pointcut = "execution(* getStudents())",
    throwing = "exception")
    public void afterTrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterTrowingGetStudentsLoggingAdvice: логируем" +
                " выброс исключения " + exception);
    }

}
