package ru.example.mindi;

public class ClassicalMusic implements Music{

    private ClassicalMusic() {}

    @Override
    public String getSong() {
        return "Some classical music";
    }

    public void initMethod(){
        System.out.println("Initializing bean");
    }

    public void destroyMethod(){
        System.out.println("Destroying bean");
    }

    public static ClassicalMusic factoryMethod(){
        return new ClassicalMusic();
    }
}