package org.example.functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateImp implements BiPredicate<String,Integer> {

    @Override
    public boolean test(String s, Integer integer) {

        if(s.length()>integer)
        {
            return true;
        }
        return false;
}
}
