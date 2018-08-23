package com.mirko.s1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean res = (theCoach == alphaCoach);
        System.out.println("\nPointing to the same object: " + res);
        System.out.println("Memory location for theCoach: " + theCoach);
        System.out.println("Memory location for alphaCoach" + alphaCoach + "\n");

        // close the context
        context.close();
    }
}
