package org.example.Generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static void doSomething(List<? extends Animal> animals)
    {
        for(Animal animal:animals)
        {
            System.out.println(animal.name);
        }
    }
    public static void main(String[] args) {
        Pair<String,Integer> p1=new Pair<String,Integer>();
        p1.first="Swetha";
        p1.second=12;
        List<Animal> animals=new ArrayList<>();
        List<Dog> dog=new ArrayList<>();
        doSomething(animals);
        doSomething(dog);
        //List<Animal> animal=new ArrayList<Dog>();//Not Possible
        //List<? extends Animal> animal = new ArrayList<Dog>();//Possible
        //? extends Animal ==> Animal + accepts child class
        //? super Animal ==> accepts Animal + Parent Class
    }
}
