
package com.springCoreAnnotion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("collegeBean")
@Scope("prototype")
public class College {

    @Value("ShivChatrapati")
    private String ColName;
    public College()
    {
        System.out.println("\n\nCollege object get cretaed by component annotation" + "and College name is : " + ColName);
    }

    @PostConstruct
    public void init()
    {
        System.out.println("\n\nHii i am init method , you can use for set up code ");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("\n\nHiii i am destroy method , i do clean up job before bean get detroy");
    }
}
