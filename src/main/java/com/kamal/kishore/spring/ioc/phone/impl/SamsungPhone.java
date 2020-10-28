package main.java.com.kamal.kishore.spring.ioc.phone.impl;

import lombok.Getter;
import main.java.com.kamal.kishore.spring.ioc.phone.ISmartPhone;
import main.java.com.kamal.kishore.spring.ioc.sim.ISimNetwork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Objects;

@Getter
public class SamsungPhone implements ISmartPhone {

    ISimNetwork simNetwork;

    String name;

    @Override
    public boolean hasSim() {
        return Objects.nonNull(simNetwork);
    }

    @Override
    public boolean hasNetwork() {
        return false;
    }

    @Autowired
    public void setSimNetwork(@Qualifier("airtelNetwork") ISimNetwork simNetwork) {
        System.out.println("SETTER LOG");
        this.simNetwork = simNetwork;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SamsungPhone{" +
                "simNetwork=" + simNetwork +
                ", name='" + name + '\'' +
                '}';
    }
}
