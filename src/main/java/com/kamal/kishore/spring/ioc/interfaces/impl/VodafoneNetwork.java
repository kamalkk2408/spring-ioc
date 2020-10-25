package main.java.com.kamal.kishore.spring.ioc.interfaces.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import main.java.com.kamal.kishore.spring.ioc.interfaces.ISimNetwork;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VodafoneNetwork implements ISimNetwork {
    private Integer id;
    private String name;

    public void makeCall() {
        System.out.println("Vodafone Network making call");
    }

    public void useInternet() {
        System.out.println("Vodafone Network using Internet");
    }

    @Override
    public String toString() {
        return "VodafoneNetwork{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
