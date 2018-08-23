package com.mirko.s1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on bean
        System.out.println(theCoach.getDailyWorkout());

        // call new methods
        System.out.println(theCoach.getDailyFortune());

        // call new new methods with props - inject values from props
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());


        // close the context
        context.close();
    }
}
