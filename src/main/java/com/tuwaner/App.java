package com.tuwaner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @date 2019/4/16
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("application.xml");
        CustomerService cust = (CustomerService) appContext.getBean("customerService");
        System.out.println("--------------------");
        cust.printName();
        System.out.println("--------------------");
        cust.printURL();
        System.out.println("--------------------");
    }
}
