package main.java.com.kamal.kishore.spring.ioc.interfaces.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import main.java.com.kamal.kishore.spring.ioc.interfaces.ISimNetwork;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AirtelNetwork implements ISimNetwork {

    private Integer id;
    private String name;

    public void makeCall() {
        System.out.println("Airtel Network making call");
    }

    public void useInternet() {
        System.out.println("Airtel Network using Internet");
    }

    @Override
    public String toString() {
        return "AirtelNetwork{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
