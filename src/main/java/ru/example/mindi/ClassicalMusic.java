package ru.example.mindi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Some classical music";
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("Initializing bean");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("Destroying bean");
    }
}
