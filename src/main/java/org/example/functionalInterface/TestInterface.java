package org.example.functionalInterface;

@FunctionalInterface
public interface TestInterface {
    void fun1();
    default void fun2(){
        System.out.print("Hi");
    }
}
