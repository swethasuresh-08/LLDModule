package org.example.streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    static class  Car{
        String name;
        int price;
        int speed;

        Car(String name,int price,int speed)
        {
            this.name=name;
            this.price=price;
            this.speed=speed;
        }

        @Override
        public String toString() {
            return this.name+" "+this.price+" "+this.speed;
        }
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
       // Stream<Integer> stream=numbers.stream();

       //Get Even Number
//        List<Integer> evenNumber=new ArrayList<>();
//        for(int i=0;i<numbers.size();i++)
//        {
//            if(numbers.get(i)%2==0)
//                evenNumber.add(numbers.get(i));
//        }
//        System.out.println(evenNumber);

        //Stream iterates over every element one by one
        System.out.println(numbers.stream().filter((num)->num%2==0).toList());

        Car car1=new Car("Volvo",1500,120);
        Car car2=new Car("Volvo1",1000,220);
        Car car3=new Car("Volvo2",800,180);
        Car car4=new Car("Volvo3",500,127);
        Car car5=new Car("Volvo4",100,100);

        List<Car> car=Arrays.asList(car1,car2,car3,car4,car5);
        List<Car> expensive=car.stream().filter((c1)->c1.price>1000).toList();
        System.out.println(expensive);

        System.out.println(car.stream().map((c1)->c1.price).toList());
    }
}
