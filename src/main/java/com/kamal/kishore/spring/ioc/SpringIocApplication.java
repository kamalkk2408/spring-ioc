package main.java.com.kamal.kishore.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocApplication {
    public static void main(String[] args) {
        System.out.println(("Application loading..."));
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(("Application Loaded..."));
    }
}
