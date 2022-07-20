package com.springcourse.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* asd*(..))")
    public void allAddMethods() {

    }

}
