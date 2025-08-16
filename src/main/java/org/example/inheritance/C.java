package org.example.inheritance;

public class C extends B{
    C(){
        System.out.println("C constructor is called");
    }
    C(String name,int phone)
    {
        System.out.println("C Constructor wid two parameter called");
    }
    String phonr;
}
