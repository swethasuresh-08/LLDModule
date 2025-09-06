package org.example.functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        //Implementing Interface using class
        BiPredicate<String,Integer> biObj=new BiPredicateImp();
        System.out.println(biObj.test("Scaler",5));

        //Implementing using Anonymous Class
        BiPredicate<String,Integer> biObj2=new BiPredicate<String, Integer>() {
            @Override
            public boolean test(String s, Integer integer) {
                if(s.length()>integer)
                    return true;
                else
                    return false;
            }
        };
        System.out.println(biObj2.test("Scaler",8));

        //Implementing using Lambda
        //() -> Input Param
        //{} -> Implementation
        BiPredicate<String,Integer> biPredicate3=(str,value)->str.length()>value;
        System.out.println(biPredicate3.test("Scaler",10));

        //Binary Operator
        BinaryOperator<String> binaryOperator=(str1,str2)->{
            System.out.println("We are in Lambda Binary");
            return str1+" "+str2;
        };
        System.out.println(binaryOperator.apply("Scaler","Bangalore"));
    }
}
