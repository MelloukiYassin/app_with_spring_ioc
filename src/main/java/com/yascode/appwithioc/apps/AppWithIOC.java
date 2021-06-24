package com.yascode.appwithioc.apps;

import com.yascode.appwithioc.beans.form.Shape;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppWithIOC {
    public static void main(String[] args) {
        // Make a call to the container
        ClassPathXmlApplicationContext applicationContext =
                        new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the desired bean
        Shape shape = applicationContext.getBean("myForm", Shape.class);

        // Treatment
        String volume = shape.getVolume();
        System.out.println(volume);
        // Close the container
        applicationContext.close();
    }
}
