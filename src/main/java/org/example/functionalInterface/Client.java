package org.example.functionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    static class Car implements Comparable<Car>{
        String name;
        int price;
        int speed;

        Car(String name,Integer price,Integer speed)
        {
            this.name=name;
            this.price=price;
            this.speed=speed;
        }

        public String toString() {
            return "[Name ="+this.name+",Price="+this.price+", Speed ="+this.speed+"]\n";

        }

        @Override
        public int compareTo(Car o) {
            return this.speed-o.speed;
        }
    }
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(10, 2, 35, 5, 4);
        Collections.sort(number);
        System.out.println(number);

        Car car1=new Car("A",1000,120);
        Car car2=new Car("B",1500,150);
        Car car3=new Car("C",1600,130);
        Car car4=new Car("D",1700,200);
        Car car5=new Car("E",1800,250);
        Car car6=new Car("F",2000,180);

        List<Car> cars=Arrays.asList(car1,car2,car3,car4,car5,car6);

//        Comparator<Car> comparator = new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o2.speed-o1.speed;
//            }
//        };
//        Comparator<Car> comparator=(o1,o2)->{
//            return o1.speed-o2.speed;
//        };
        Collections.sort(cars);
        System.out.println(cars);
    }
}
