package main.java.com.kamal.kishore.spring.ioc.interfaces.impl;

import main.java.com.kamal.kishore.spring.ioc.interfaces.ISimNetwork;

public class VodafoneNetwork implements ISimNetwork {
    public void makeCall() {
        System.out.println("Vodafone Network making call");
    }

    public void useInternet() {
        System.out.println("Vodafone Network using Internet");
    }
}
