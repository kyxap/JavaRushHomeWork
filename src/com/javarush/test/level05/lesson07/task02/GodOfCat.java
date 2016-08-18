package com.javarush.test.level05.lesson07.task02;

/**
 * Created by ky on 10.09.2014.
 */
public class GodOfCat
{
    public static void main(String[] args){
        Cat cat1 = new Cat();
        cat1.initialize("KOTEE");

        System.out.println("Cat1 data: ");
        System.out.println(cat1.name);
        System.out.println(cat1.weight);
        System.out.println(cat1.color);
        System.out.println(cat1.address);
        System.out.println(cat1.age);


        System.out.println("==========================");

        Cat cat2 = new Cat();
        cat2.initialize("b", 2, 3);
        System.out.println("Cat2 data: ");
        System.out.println(cat2.name);
        System.out.println(cat2.weight);
        System.out.println(cat2.color);
        System.out.println(cat2.address);
        System.out.println(cat2.age);




    }
}
