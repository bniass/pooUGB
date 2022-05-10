package main;

import service.IOperation;

public class TestInterface {
    public static void main(String[] args) {
        IOperation somme = (x,  y)-> x + y;
        IOperation sub = (x,  y)-> x - y;

        IOperation mult = (x,  y)-> x * y;

        System.out.println(somme.operation(10, 10));
        System.out.println(sub.operation(10, 10));
        System.out.println(mult.operation(10, 10));
    }


}
