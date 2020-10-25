package main.java.com.kamal.kishore.spring.ioc;

import main.java.com.kamal.kishore.spring.ioc.sim.ISimNetwork;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocApplication {
    public static void main(String[] args) {
        System.out.println(("Application loading..."));
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(("..................Application Loaded............."));

        /*
        Setter Injection
         */
        ISimNetwork airtelNetwork = applicationContext.getBean("airtelNetwork", ISimNetwork.class);
        System.out.println(("..................Setter Injection.................:: " + airtelNetwork));

        /*
        Constructor Injection
         */

        ISimNetwork vodafoneNetowrk = applicationContext.getBean("vodafoneNetwork", ISimNetwork.class);
        System.out.println(("..................Constructor Injection............:: " + vodafoneNetowrk));

    }
}
