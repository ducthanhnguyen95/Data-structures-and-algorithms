package com.codewiththanh.datastructure.arrays;

public class Main {

    public static void main(String[] args)  {
        Array numbers = new Array(3);
        Array arrayIntersect = new Array(3);
        arrayIntersect.insert(1);
        arrayIntersect.insert(30);
        arrayIntersect.insert(20);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
//        System.out.println(numbers.indexOf(30));
//        numbers.removeAt(1);
//        numbers.print();
        System.out.println(numbers.max());;
        numbers.intersect(arrayIntersect).print();
    }
}