package main.java.com.kamal.kishore.spring.ioc.interfaces.impl;

import main.java.com.kamal.kishore.spring.ioc.interfaces.ISimNetwork;

public class AirtelNetwork implements ISimNetwork {
    public AirtelNetwork(){
        System.out.println("Airtel Network default constructor called");
    }
    public void makeCall() {
        System.out.println("Airtel Network making call");
    }

    public void useInternet() {
        System.out.println("Airtel Network using Internet");
    }
}
