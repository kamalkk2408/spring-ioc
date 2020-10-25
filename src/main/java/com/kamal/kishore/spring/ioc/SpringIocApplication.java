package main.java.com.kamal.kishore.spring.ioc;

import main.java.com.kamal.kishore.spring.ioc.interfaces.ISimNetwork;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocApplication {
    public static void main(String[] args) {
        System.out.println(("Application loading..."));
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(("..................Application Loaded............."));
        ISimNetwork simNetwork = applicationContext.getBean("simNetwork", ISimNetwork.class);
        simNetwork.makeCall();
        simNetwork.useInternet();

    }
}
